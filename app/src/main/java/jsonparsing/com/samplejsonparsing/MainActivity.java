package jsonparsing.com.samplejsonparsing;

import android.Manifest;
import android.net.LinkAddress;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.whygraphics.multilineradiogroup.MultiLineRadioGroup;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.UTFDataFormatException;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Integer> depencyIdList=new ArrayList<>();
    public ArrayList<EditText> editTextList=new ArrayList<>();
    PatientInfo infoModel=null;
    FormModel formModel=null;
    LinearLayout mainLayout;
    ArrayList<String>dependency=new ArrayList<>();
    ArrayList<RequestModel>request=new ArrayList<>();
    HashMap<String, RequestModel> map = new HashMap<String, RequestModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout=(LinearLayout)findViewById(R.id.mainlayout);
        jsonParsing();

    }
    public void jsonParsing()
    {
        try{
            JSONObject jsonObject=new JSONObject(Common.json3);
            if(jsonObject.getString("code").equalsIgnoreCase("200"))
            {

                JSONObject result=jsonObject.getJSONObject("result");
                //infoModel=new PatientInfo(result.getJSONObject("patient"));
                formModel=new FormModel(result.getJSONObject("form"));


            }
        }catch (Exception ex)
        {
            ex.fillInStackTrace();
        }
        addHeader();
        addFooter();
    }
    /****************header**********************/
    public void addHeader()
    {
        if(infoModel!=null)
        {
            TextView textView1 =getTextView(infoModel.getName(),1);
            mainLayout.addView(textView1);

            // Add textview 2
            TextView textView2 = getTextView("Age : "+infoModel.getAge(),1);
            mainLayout.addView(textView2);
            TextView textView3 = getTextView("Gender : "+infoModel.Gender,1);
            mainLayout.addView(textView3);
            TextView textView4 = getTextView("Umr Number : "+infoModel.getUMRNo(),1);
            mainLayout.addView(textView4);

        }
        View view=getView();
        mainLayout.addView(view);

    }
    /****************footer**********************/
    public void addFooter() {
        if (formModel != null) {
            depencyIdList.clear();
            TextView textView1 = getTextView(formModel.getFormName(),1);
            mainLayout.addView(textView1);
            /* -------------------------------------*/
            TextView textView2 = getTextView(formModel.getFormType(),1);
            mainLayout.addView(textView2);
            /* -------------------------------------*/
            View vieww = getView();
            mainLayout.addView(vieww);
            /* -------------------------------------*/
            for (int i = 0; i < formModel.getSection().size(); i++) {
                FormModel.Sections sections = formModel.section.get(i);
                TextView heading = getTextView(sections.getTitle().toUpperCase(),1);
                mainLayout.addView(heading);

                /* ---------------------------labels check------------------------------------------------------*/
                for (int j = 0; j < sections.getLabels().size(); j++) {
                    final FormModel.Labels labels = sections.labels.get(j);
                    if (labels.getWidgetType().equalsIgnoreCase("text")) {
                        TextView labelText = getTextView(labels.getLabelText(),1);
                        mainLayout.addView(labelText);
                        EditText labelvalue = getEditText(1);
                        labelvalue.setTag(labels.getLabelText());
                        labelvalue.setId(Integer.parseInt(labels.getId()));
                        editTextList.add(labelvalue);
                        mainLayout.addView(labelvalue);
                        map.put(labels.getLabelText(),new RequestModel(labels.getId(),labels.getLabelText(),"0","","0","0",false,0,labelvalue));
                        labelvalue.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                            }

                            @Override
                            public void afterTextChanged(Editable editable) {
                                RequestModel model=map.get(labels.getLabelText());
                                model.setOption_value(editable.toString());
                                handleRequest(model);
                            }
                        });

                        /* ------------------------------------------------------------------------------*/
                    } else {

                        TextView labelText = getTextView(labels.getLabelText(),1);
                        mainLayout.addView(labelText);
                        /* ------------------------------------------------------------------------------------------------------------------*/

                        final MultiLineRadioGroup radioGroup = new MultiLineRadioGroup(this);
                        radioGroup.setOrientation(LinearLayout.HORIZONTAL);
                        radioGroup.setPadding(20,0,20,0);
                        radioGroup.setMaxInRow(3);

                        LinearLayout dependencyLayout = null;

                        /* ---------------------------options check------------------------------------------------------*/
                        for (int k = 0; k < labels.getOptions().size(); k++) {
                            final FormModel.Options op = labels.options.get(k);
                            RadioButton radioButton = getRadioButton(op.getOptionText());
                            radioButton.setId(Integer.parseInt(op.getId()));

                            radioGroup.addView(radioButton);
                            if (op.getDefaultt().equalsIgnoreCase("1"))
                            {
                                radioGroup.check(Integer.parseInt(op.getId()));
                            }

                            RequestModel model=new RequestModel(labels.getId(),labels.getLabelText(),op.id,op.optionText,"0",op.getDefaultt(),false,1,radioGroup);
                            map.put(labels.getLabelText()+""+op.getOptionText(),model);


                            /* ---------------------------dependency check------------------------------------------------------*/
                            if (labels.options.get(k).dependencyLabels.size() > 0) {
                                depencyIdList.add(Integer.parseInt(op.getId()));
                                dependencyLayout = getLinearLayout();
                                /* ---------------------------dependency labels check------------------------------------------------------*/
                                for (int m = 0; m < labels.options.get(k).dependencyLabels.size(); m++) {
                                    final FormModel.Labels depedencyLabel = labels.options.get(k).dependencyLabels.get(m);

                                    TextView textView = getTextView(depedencyLabel.getLabelText(),2);
                                    dependencyLayout.addView(textView);
                                    String widgetType = depedencyLabel.widgetType;
                                    final MultiLineRadioGroup radioGroupp = new MultiLineRadioGroup(this);
                                    radioGroupp.setOrientation(LinearLayout.HORIZONTAL);
                                    radioGroupp.setPadding(40,0,40,0);
                                    radioGroupp.setMaxInRow(3);
                                    final LinearLayout dependencyLayout2 =getLinearLayout();
                                    if (widgetType.equalsIgnoreCase("text")) {
                                        EditText labelvalue = getEditText(2);
                                        labelvalue.setTag(depedencyLabel.getLabelText());
                                        labelvalue.setId(Integer.parseInt(depedencyLabel.getId()));
                                        RequestModel model1=new RequestModel(depedencyLabel.getId(),depedencyLabel.getLabelText(),"0","",op.getId(),"0",false,0,labelvalue);
                                        map.put(depedencyLabel.getLabelText(),model1);


                                        labelvalue.addTextChangedListener(new TextWatcher() {
                                            @Override
                                            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                            }

                                            @Override
                                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                            }

                                            @Override
                                            public void afterTextChanged(Editable editable) {
                                                RequestModel model=map.get(depedencyLabel.getLabelText());
                                                model.setOption_value(editable.toString());
                                                handleRequest(model);
                                            }
                                        });
                                        editTextList.add(labelvalue);
                                        dependencyLayout.addView(labelvalue);
                                    }
                                    /* ---------------------------dependency options check------------------------------------------------------*/
                                    for (int n = 0; n < depedencyLabel.getOptions().size(); n++) {
                                        final FormModel.Options dependencyLabelOptions = depedencyLabel.getOptions().get(n);
                                        if (widgetType.equalsIgnoreCase("radio")) {
                                            RadioButton radioBtn = getRadioButton(dependencyLabelOptions.optionText);
                                            radioBtn.setId(Integer.parseInt(dependencyLabelOptions .getId()));
                                            radioGroupp.addView(radioBtn);
                                            if(dependencyLabelOptions.getDefaultt().equalsIgnoreCase("1"))
                                            {
                                                radioGroupp.check(Integer.parseInt(dependencyLabelOptions .getId()));
                                            }

                                            RequestModel model1=new RequestModel(depedencyLabel.getId(),depedencyLabel.getLabelText(),dependencyLabelOptions.getId(),dependencyLabelOptions.getOptionText(),op.getId(),dependencyLabelOptions.getDefaultt(),false,1,radioGroupp);
                                            map.put(depedencyLabel.getLabelText()+""+ dependencyLabelOptions.getOptionText(),model1);

                                            for (int x = 0; x < dependencyLabelOptions.getDependency().size(); x++) {
                                                depencyIdList.add(Integer.parseInt(dependencyLabelOptions .getId()));
                                                final  FormModel.Labels level2label = dependencyLabelOptions.getDependency().get(x);
                                                TextView label2Text = getTextView(level2label.getLabelText(),3);
                                                dependencyLayout2.addView(label2Text);
                                                /* ------------------------------------------------------------------------------------------------------------------*/
                                                String widgetType2 = level2label.widgetType;

                                                if (widgetType2.equalsIgnoreCase("text")) {
                                                    EditText labelvalue = getEditText(3);
                                                    labelvalue.setTag(level2label.getLabelText());
                                                    labelvalue.setId(Integer.parseInt(level2label.getId()));
                                                    RequestModel model2=new RequestModel(level2label.getId(),level2label.getLabelText(),"0","",dependencyLabelOptions.getId(),"0",false,0,labelvalue);
                                                    map.put(level2label.getLabelText(),model2);


                                                    editTextList.add(labelvalue);
                                                    dependencyLayout2.addView(labelvalue);
                                                    labelvalue.addTextChangedListener(new TextWatcher() {
                                                        @Override
                                                        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                        }

                                                        @Override
                                                        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                        }

                                                        @Override
                                                        public void afterTextChanged(Editable editable) {
                                                            RequestModel model=map.get(level2label.getLabelText());
                                                            model.setOption_value(editable.toString());
                                                            handleRequest(model);
                                                        }
                                                    });
                                                }

                                                for (int y = 0; y < level2label.getOptions().size(); y++) {
                                                    final FormModel.Options options2 = level2label.options.get(y);
                                                    RequestModel model2=new RequestModel(level2label.getId(),level2label.getLabelText(),options2.getId(),options2.getOptionText(),dependencyLabelOptions.getId(),options2.getDefaultt(),false,0,null);
                                                    map.put(level2label.getLabelText()+""+options2.getId()+""+options2.getOptionText(),model2);

                                                    if (widgetType2.equalsIgnoreCase("Checkbox")) {
                                                        final CheckBox chbox = getCheckBox(options2.optionText,3);
                                                        chbox.setId(Integer.parseInt(options2.getId()));
                                                        if(options2.getDefaultt().equalsIgnoreCase("1"))
                                                        {
                                                            chbox.setChecked(true);
                                                        }
                                                        dependencyLayout2.addView(chbox);
                                                         final LinearLayout dependencyLayout3=getLinearLayout();
                                                        chbox .setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                            @Override
                                                            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                                RequestModel model=map.get(level2label.getLabelText()+""+options2.getId()+""+chbox.getText().toString());
                                                                model.setIsCheckbox(true);
                                                                model.setView(2,chbox);
                                                                if(isChecked) {
                                                                    handleRequest(model);
                                                                    if (depencyIdList.contains(chbox.getId())) {
                                                                        dependencyLayout3.setVisibility(View.VISIBLE);
                                                                    }
                                                                }else{
                                                                    removeItem( model);
                                                                    dependencyLayout3.setVisibility(View.GONE);
                                                                }
                                                            }
                                                        });

                                                       if(options2.getDependency().size()>0)
                                                       {/*****************getLabel 3*******************/
                                                           for(int a=0;a<options2.getDependency().size();a++)
                                                           {depencyIdList.add(chbox.getId());
                                                               final FormModel.Labels label3=options2.getDependency().get(a);
                                                               if(label3.getWidgetType().equalsIgnoreCase("text"))
                                                               { EditText labelvalue = getEditText(4);
                                                                   labelvalue.setTag(label3.getLabelText());
                                                                   labelvalue.setId(Integer.parseInt(label3.getId()));
                                                                   RequestModel model4=new RequestModel(label3.getId(),label3.getLabelText(),"0","",options2.getId(),"0",false,0,labelvalue);
                                                                   map.put(label3.getLabelText()+""+label3.getId(),model4);
                                                                   TextView label=getTextView(label3.getLabelText(),4);
                                                                   dependencyLayout3.addView(label);

                                                                   editTextList.add(labelvalue);
                                                                   dependencyLayout3.addView(labelvalue);
                                                                   labelvalue.addTextChangedListener(new TextWatcher() {
                                                                       @Override
                                                                       public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                                       }

                                                                       @Override
                                                                       public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                                       }

                                                                       @Override
                                                                       public void afterTextChanged(Editable editable) {
                                                                           RequestModel model=map.get(label3.getLabelText()+""+label3.getId());
                                                                           model.setOption_value(editable.toString());
                                                                           handleRequest(model);

                                                                       }
                                                                   });
                                                               }
                                                               if(dependencyLayout3.getChildCount()>0)
                                                               {    dependencyLayout3.setVisibility(View.GONE);
                                                                   dependencyLayout2.addView(dependencyLayout3);
                                                               }


                                                           }




                                                       }
                                                    } else if (widgetType2.equalsIgnoreCase("text")) {
                                                        EditText labelvalue = getEditText(3);
                                                        labelvalue.setTag(options2.optionText);
                                                        labelvalue.setId(Integer.parseInt(options2.getId()));
                                                        RequestModel model3=new RequestModel(level2label.getId(),level2label.getLabelText(),"0","",dependencyLabelOptions.getId(),"0",false,0,labelvalue);
                                                        map.put(level2label.getLabelText(),model3);

                                                        TextView label = getTextView(options2.optionText,3);
                                                        dependencyLayout2.addView(label);

                                                        editTextList.add(labelvalue);
                                                        dependencyLayout2.addView(labelvalue);
                                                        labelvalue.addTextChangedListener(new TextWatcher() {
                                                            @Override
                                                            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                            }

                                                            @Override
                                                            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                            }

                                                            @Override
                                                            public void afterTextChanged(Editable editable) {
                                                                RequestModel model=map.get(level2label.getLabelText());
                                                                model.setOption_value(editable.toString());
                                                                handleRequest(model);
                                                            }
                                                        });
                                                    } else if (widgetType2.equalsIgnoreCase("radio")) {
                                                        RadioButton radioB = getRadioButton(options2.optionText);
                                                        radioB.setId(Integer.parseInt(options2.getId()));
                                                        if(options2.getDefaultt().equalsIgnoreCase("1"))
                                                        {
                                                            radioB.setChecked(true);
                                                        }
                                                        dependencyLayout2.addView(radioB);


                                                    }

                                                }

//

                                                /* ------------------------------------------------------------------------------------------------------------------*/

                                            }
                                        } else if (widgetType.equalsIgnoreCase("checkbox")) {
                                            final CheckBox chbox = getCheckBox(dependencyLabelOptions.optionText,2);
                                            RequestModel model3=new RequestModel(depedencyLabel.getId(),depedencyLabel.getLabelText(),dependencyLabelOptions.id,dependencyLabelOptions.getOptionText(),op.getId(),dependencyLabelOptions.getDefaultt(),true,2,chbox);
                                            map.put(depedencyLabel.getLabelText()+""+dependencyLabelOptions.optionText,model3);
                                            final LinearLayout  dependencyLayout3=getLinearLayout();
                                            chbox.setId(Integer.parseInt(dependencyLabelOptions.getId()));
                                            if(dependencyLabelOptions.getDefaultt().equalsIgnoreCase("1"))
                                            {
                                                chbox.setChecked(true);
                                            }
                                            dependencyLayout.addView(chbox);
                                            chbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                @Override
                                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                    RequestModel model=map.get(depedencyLabel.getLabelText()+""+chbox.getText().toString());

                                                    if (isChecked) {
                                                        handleRequest(model);
                                                        if (!dependency.contains(chbox.getText().toString())) {
                                                            dependency.add(chbox.getText().toString());
                                                        }
                                                    } else {
                                                        removeItem(model);
                                                        if (dependency.contains(chbox.getText().toString())) {
                                                            dependency.remove(chbox.getText().toString());
                                                        }
                                                    }
                                                    String checkedItem = "";
                                                    for (int i = 0; i < dependency.size(); i++) {
                                                        if (i == 0) {
                                                            checkedItem = dependency.get(i);
                                                        } else {
                                                            checkedItem += "," + dependency.get(i);
                                                        }
                                                    }


                                                    Toast.makeText(MainActivity.this, checkedItem, Toast.LENGTH_SHORT).show();

                                                    for (int x = 0; x < dependencyLabelOptions.getDependency().size(); x++) {
                                                        depencyIdList.add(Integer.parseInt(dependencyLabelOptions.getId()));
                                                        final  FormModel.Labels level2label = dependencyLabelOptions.getDependency().get(x);
                                                        TextView label2Text = getTextView(level2label.getLabelText(),3);
                                                        dependencyLayout3.addView(label2Text);
                                                /* ------------------------------------------------------------------------------------------------------------------*/
                                                        String widgetType2 = level2label.widgetType;

                                                        if (widgetType2.equalsIgnoreCase("text")) {
                                                            EditText labelvalue = getEditText(3);
                                                            labelvalue.setTag(level2label.getLabelText());
                                                            labelvalue.setId(Integer.parseInt(level2label.getId()));
                                                            RequestModel model2=new RequestModel(level2label.getId(),level2label.getLabelText(),"0","",dependencyLabelOptions.getId(),"0",false,0,labelvalue);
                                                            map.put(level2label.getLabelText(),model2);


                                                            editTextList.add(labelvalue);
                                                            dependencyLayout3.addView(labelvalue);
                                                            labelvalue.addTextChangedListener(new TextWatcher() {
                                                                @Override
                                                                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                                }

                                                                @Override
                                                                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                                }

                                                                @Override
                                                                public void afterTextChanged(Editable editable) {
                                                                    RequestModel model=map.get(level2label.getLabelText());
                                                                    model.setOption_value(editable.toString());
                                                                    handleRequest(model);
                                                                }
                                                            });
                                                        }

                                                        for (int y = 0; y < level2label.getOptions().size(); y++) {
                                                            FormModel.Options options2 = level2label.options.get(y);
                                                            RequestModel model2=new RequestModel(level2label.getId(),level2label.getLabelText(),options2.getId(),options2.getOptionText(),dependencyLabelOptions.getId(),options2.getDefaultt(),false,0,null);
                                                            map.put(level2label.getLabelText()+""+options2.getOptionText(),model2);

                                                            if (widgetType2.equalsIgnoreCase("Checkbox")) {
                                                                final CheckBox chbox = getCheckBox(options2.optionText,3);
                                                                chbox.setId(Integer.parseInt(options2.getId()));
                                                                if((options2.getDefaultt().equalsIgnoreCase("1")))
                                                                {
                                                                    chbox.setChecked(true);
                                                                }
                                                                dependencyLayout3.addView(chbox);

                                                                chbox .setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                                    @Override
                                                                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                                                                        RequestModel model=map.get(level2label.getLabelText()+""+chbox.getText().toString());
                                                                        model.setIsCheckbox(true);
                                                                        model.setView(2,chbox);
                                                                        if(isChecked) {
                                                                            handleRequest(model);
                                                                        }else {
                                                                            removeItem(model);
                                                                        }
                                                                    }
                                                                });

                                                            } else if (widgetType2.equalsIgnoreCase("text")) {
                                                                EditText labelvalue = getEditText(3);
                                                                labelvalue.setTag(options2.optionText);
                                                                labelvalue.setId(Integer.parseInt(options2.getId()));
                                                                RequestModel model3=new RequestModel(level2label.getId(),level2label.getLabelText(),"0","",dependencyLabelOptions.getId(),dependencyLabelOptions.getDefaultt(),false,0,labelvalue);
                                                                map.put(level2label.getLabelText(),model3);

                                                                TextView label = getTextView(options2.optionText,3);
                                                                dependencyLayout3.addView(label);

                                                                editTextList.add(labelvalue);
                                                                dependencyLayout3.addView(labelvalue);
                                                                labelvalue.addTextChangedListener(new TextWatcher() {
                                                                    @Override
                                                                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                                    }

                                                                    @Override
                                                                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                                    }

                                                                    @Override
                                                                    public void afterTextChanged(Editable editable) {
                                                                        RequestModel model=map.get(level2label.getLabelText());
                                                                        model.setOption_value(editable.toString());
                                                                        handleRequest(model);
                                                                    }
                                                                });
                                                            } else if (widgetType2.equalsIgnoreCase("radio")) {
                                                                RadioButton radioB = getRadioButton(options2.optionText);
                                                                radioB.setId(Integer.parseInt(options2.getId()));
                                                                dependencyLayout3.addView(radioB);


                                                            }

                                                        }

//

                                                /* ------------------------------------------------------------------------------------------------------------------*/

                                                    }

                                                }
                                            });
                                        } else if (widgetType.equalsIgnoreCase("text")) {
                                            TextView label = getTextView(dependencyLabelOptions.optionText,2);
                                            dependencyLayout.addView(label);
                                            EditText labelvalue = getEditText(2);
                                            labelvalue.setId(Integer.parseInt(dependencyLabelOptions.getId()));
                                            labelvalue.setTag(dependencyLabelOptions.optionText);
                                            editTextList.add(labelvalue);
                                            dependencyLayout.addView(labelvalue);
                                            labelvalue.addTextChangedListener(new TextWatcher() {
                                                @Override
                                                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                }

                                                @Override
                                                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                                                }

                                                @Override
                                                public void afterTextChanged(Editable editable) {
                                                    RequestModel model=map.get(dependencyLabelOptions.getOptionText());
                                                    model.setOption_value(editable.toString());
                                                    handleRequest(model);
                                                }
                                            });

                                        }
                                    }

                                    if (radioGroupp != null) {
                                        dependencyLayout.addView(radioGroupp);
                                        dependencyLayout2.setVisibility(View.GONE);
                                        dependencyLayout.addView(dependencyLayout2);
                                    }
                                    final LinearLayout finalDependencyLayout1 = dependencyLayout2;
                                    final LinearLayout finalDependencyLayout = dependencyLayout;
                                    radioGroupp.setOnCheckedChangeListener(new MultiLineRadioGroup.OnCheckedChangeListener() {
                                        @Override
                                        public void onCheckedChanged(ViewGroup group,  RadioButton button) {
                                            Toast.makeText(MainActivity.this, Integer.toString(button.getId()), Toast.LENGTH_SHORT).show();
                                            if (depencyIdList.contains(button.getId())) {
                                                finalDependencyLayout1.setVisibility(View.VISIBLE);
                                                // finalDependencyLayout.addView(finalDependencyLayout1);
                                            } else {
                                                if (finalDependencyLayout1 != null) {
                                                    finalDependencyLayout1.setVisibility(View.GONE);
                                                    //finalDependencyLayout.removeView(finalDependencyLayout1);
                                                }
                                            }

                                            String radiobtnText=button.getText().toString();
                                            RequestModel model=map.get(depedencyLabel.getLabelText()+""+button.getText());
                                            model.setView(1,radioGroupp);
                                                handleRequest(model);



                                        }

                                    });

                                }
                            }
                        }
                        mainLayout.addView(radioGroup);

                        final LinearLayout finalDependencyLayout = dependencyLayout;

                        radioGroup.setOnCheckedChangeListener(new MultiLineRadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(ViewGroup group,  RadioButton button) {
                                Toast.makeText(MainActivity.this, Integer.toString(button.getId()), Toast.LENGTH_SHORT).show();
                                if (depencyIdList.contains(button.getId())) {
                                    finalDependencyLayout.setVisibility(View.VISIBLE);
                                } else {
                                    if (finalDependencyLayout != null) {
                                        finalDependencyLayout.setVisibility(View.GONE);
                                    }


                                }
                                RequestModel model=map.get(labels.getLabelText()+""+button.getText().toString());
                                model.setView(1,radioGroup);
                                handleRequest(model);
                            }
                        });
                        if (dependencyLayout != null) {
                            dependencyLayout.setVisibility(View.GONE);
                            mainLayout.addView(dependencyLayout);
                        }
                    }
                }
                View view = getView();
                mainLayout.addView(view);
            }
        }
        Button submit = getButton("Submit");
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String request=getRequestJson().toString();
                Toast.makeText(MainActivity.this,request,Toast.LENGTH_SHORT).show();
                Log.d("TAG",request);
            }
        });
        mainLayout.addView(submit);

    }






/*********************************************************************************************************************************************************/
    /******************** TextView***********************/
    public TextView getTextView(String text ,int levelId)
    {
        TextView label = new TextView(this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        if(levelId==1) {
            lp.setMargins(20, 10, 20, 10);
        }else if(levelId==2)
        {
            lp.setMargins(50, 10, 20, 10);
        }
        else if(levelId==3)
        {
            lp.setMargins(80, 10, 20, 10);
        }
        else if(levelId==4)
        {
            lp.setMargins(120, 10, 20, 10);
        }
        label.setLayoutParams(lp);
        label.setGravity(Gravity.LEFT);
        label.setText(text);
        label.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);

        return label;
    }
    /*******************EditText*************************/
    public EditText getEditText(int levelId)
    {
        EditText labelvalue = new  EditText(this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,60);
        if(levelId==1) {
            lp.setMargins(20, 10, 20, 10);
        }else if(levelId==2)
        {
            lp.setMargins(50, 10, 20, 10);
        }
        else if(levelId==3)
        {
            lp.setMargins(80, 10, 20, 10);
        }
        else if(levelId==4)
        {
            lp.setMargins(120, 10, 20, 10);
        }
        labelvalue.setLayoutParams(lp);
        labelvalue.setGravity(Gravity.LEFT);
        labelvalue.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
        labelvalue.setPadding(10, 5, 10, 5);// in pixels (
        labelvalue.setBackgroundDrawable(getResources().getDrawable(R.drawable.blurr_bg_edittext));

        return labelvalue;
    }
    /*********************Radio*************************/
    public RadioButton getRadioButton(String text)
    {
        RadioButton radioButton  = new RadioButton(this);

        radioButton .setText(text);
        return radioButton;
    }
    /*******************CheckBox**********************/
    public CheckBox getCheckBox(String text,int levelId)
    {    LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        CheckBox chbox= new CheckBox(this);

        if(levelId==1) {
            lp.setMargins(20, 10, 20, 10);
        }else if(levelId==2)
        {
            lp.setMargins(50, 10, 20, 10);
        }
        else if(levelId==3)
        {
            lp.setMargins(80, 10, 20, 10);
        }
        chbox.setLayoutParams(lp);
        chbox.setText(text);
        return chbox;

    }
    /********************View************************/
    public View getView()
    {
        View view =new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1);
        layoutParams.setMargins(5, 5, 5, 5);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        return view;
    }
    /*******************Button**********************/
    public Button getButton(String text)
    {
        Button button =new Button(this);
        button.setText(text);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(5, 30, 5, 30);
        button.setLayoutParams(layoutParams);
        button.setGravity(Gravity.CENTER);
        button.setTextColor(getResources().getColor(android.R.color.white));
        button.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        return button;
    }

    /*******************getLinearLayout**************/
    public LinearLayout getLinearLayout()
    {
        LinearLayout  layout= new LinearLayout(MainActivity.this);
        layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        layout.setOrientation(LinearLayout.VERTICAL);
        return layout;
    }
    /******************getRadioGp********************/


    public void handleRequest(RequestModel model) {
        if (request.size() > 0) {
            if (isModelPresent(model) == false) {
                if(model.getDefaultt().equalsIgnoreCase("0")) {
                    request.add(model);
                    Log.d("tag", "ha ndleRequest: "+request.indexOf(model));
                }
            }

        } else {
            if(model.getDefaultt().equalsIgnoreCase("0")) {
                request.add(model);
            }
        }
    }

    public void removeItem(RequestModel model)
    {
        for (int i = 0; i < request.size(); i++) {
            RequestModel addedModel = request.get(i);
            if ((addedModel.getLabel_id().equalsIgnoreCase(model.getLabel_id())) && (addedModel.getParent_label_id().equalsIgnoreCase(model.getParent_label_id())) && (addedModel.getOption_id().equalsIgnoreCase(model.getOption_id()))) {
 request.remove(i);
                break;
            }
        }}

    public boolean isModelPresent(RequestModel model) {

        for (int i = 0; i < request.size(); i++) {
            RequestModel addedModel = request.get(i);
            if ((addedModel.getLabel_id().equalsIgnoreCase(model.getLabel_id())) && (addedModel.getParent_label_id().equalsIgnoreCase(model.getParent_label_id()))) {
                if(model.getOption_value().length()>0) {
                   // removeAllRelatedViews(addedModel.getParent_label_id());
                    if(model.isCheckbox==false) {
                        if (model.getDefaultt().equalsIgnoreCase("0")) {
                            request.set(i, model);
                        } else {
                            removeAllRelatedViews(addedModel);
                            if(request.indexOf(model)!=-1) {

                                request.remove(request.indexOf(model));
                            }

                        }
                    }else{
                        return false;
                    }

                }else{
                    request.remove(i);

                }

                return true;
            }

        }
        return false;
    }

    public void removeAllRelatedViews(RequestModel model) {
        Log.d("TAG", "removeAllRelatedViews: "+model.getOption_id());
        for (int i = 0; i < request.size(); i++) {
            RequestModel addedModel = request.get(i);
            if (addedModel.getParent_label_id().equalsIgnoreCase(model.getOption_id())) {

                {
                    if (ischildPresent(addedModel.getOption_id())) {
                        if(!addedModel.getOption_id().equalsIgnoreCase("0")) {
                            removeAllRelatedViews(addedModel);
                        }
                    }
                    handleCheckUncheck(addedModel.getType(),addedModel.getView());
                    if(request.indexOf(addedModel)!=-1)
                    {
                        request.remove(request.indexOf(addedModel));
                    }

                    if(i!=0) {
                        i = i - 1;
                    }


                }
            }

        }

    }




    public JSONObject getRequestJson() {
        JSONObject jsonObject = new JSONObject();
        JSONObject reqjsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        try {
            jsonObject.put("requesterid", "0");
            jsonObject.put("requestname", "save_custom_form");
            reqjsonObject.put("doctor_id", "190");
            reqjsonObject.put("form_id", "3");
            reqjsonObject.put("form_type", "Treatment History");
            reqjsonObject.put("patient_id", "289");
            for (int i = 0; i < request.size(); i++) {
                RequestModel model = request.get(i);
                JSONObject object = new JSONObject();
                object.put("label_id", model.getLabel_id());
                object.put("label_value", model.getLabel_value());
                object.put("option_id", model.getOption_id());
                object.put("option_value", model.getOption_value());
                object.put("parent_label_id", model.getParent_label_id());
                jsonArray.put(i, object);

            }
            reqjsonObject.put("labels", jsonArray);
            jsonObject.put("requestparameters", reqjsonObject);


        } catch (Exception ex) {
            ex.fillInStackTrace();
        }
        return jsonObject;
    }

    public boolean ischildPresent(final String id)
    {
        for(int i=0;i<request.size();i++)
        {
            if(request.get(i).getParent_label_id().equalsIgnoreCase(id))
            {
                return  true;
            }
        }
        return false;
    }

public void handleCheckUncheck(int type,View view)
{
    try {
        switch (type) {
            case 0:
                EditText edt = (EditText) view;
                edt.setText("");
                break;
            case 1:
                MultiLineRadioGroup gp = (MultiLineRadioGroup) view;
                gp.clearCheck();
                break;
            case 2:
                CheckBox chbox = (CheckBox) view;
                chbox.setChecked(false);
                break;

        }
    }catch (Exception ex)
    {
        ex.fillInStackTrace();
    }
}
}