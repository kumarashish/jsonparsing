package jsonparsing.com.samplejsonparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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

import org.json.JSONObject;

import java.io.UTFDataFormatException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
public ArrayList<Integer> depencyIdList=new ArrayList<>();
public ArrayList<EditText> editTextList=new ArrayList<>();
PatientInfo infoModel=null;
FormModel formModel=null;
LinearLayout mainLayout;
ArrayList<String>dependency=new ArrayList<>();
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
    public void addHeader()
    {
        if(infoModel!=null)
        {
            TextView textView1 = new TextView(this);
            textView1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            textView1.setGravity(Gravity.CENTER);
            textView1.setText(infoModel.getName());;
            textView1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
            textView1.setBackgroundColor(0xff66ff66); // hex color 0xAARRGGBB
            textView1.setPadding(20, 20, 20, 20);// in pixels (left, top, right, bottom)
            mainLayout.addView(textView1);

            // Add textview 2
            TextView textView2 = new TextView(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            textView2.setGravity(Gravity.CENTER);
            layoutParams.setMargins(10, 10, 10, 10); // (left, top, right, bottom)
            textView2.setLayoutParams(layoutParams);
            textView2.setText("Age : "+infoModel.getAge());
            textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
            mainLayout.addView(textView2);
            TextView textView3 = new TextView(this);
            LinearLayout.LayoutParams layoutParam = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            textView3.setGravity(Gravity.CENTER);
            layoutParam.setMargins(10, 10, 10, 10); // (left, top, right, bottom)
            textView3.setLayoutParams(layoutParam);
            textView3.setText("Gender : "+infoModel.Gender);
            textView3.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
          // hex color 0xAARRGGBB
            mainLayout.addView(textView3);
            TextView textView4 = new TextView(this);
            LinearLayout.LayoutParams layoutParam4 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            textView4.setGravity(Gravity.CENTER);
            layoutParam4.setMargins(10, 10, 10, 10); // (left, top, right, bottom)
            textView4.setLayoutParams(layoutParam4);
            textView4.setText("Umr Number : "+infoModel.getUMRNo());
            textView4.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
// hex color 0xAARRGGBB
            mainLayout.addView(textView4);

        }
        View view=new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                1);
        layoutParams.setMargins(10, 10, 10, 10);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
        mainLayout.addView(view);

    }
    public void addFooter()
    {
        if(formModel!=null) {
            depencyIdList.clear();
            TextView textView1 = new TextView(this);
            textView1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            textView1.setGravity(Gravity.CENTER);
            textView1.setText(formModel.getFormName());
            textView1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
            textView1.setPadding(20, 20, 20, 20);// in pixels (left, top, right, bottom)
            mainLayout.addView(textView1);
           /* -------------------------------------*/
            TextView textView2 = new TextView(this);
            textView2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            textView2.setGravity(Gravity.CENTER);
            textView2.setText(formModel.getFormType());
            ;
            textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);

            textView2.setPadding(20, 20, 20, 20);// in pixels (left, top, right, bottom)
            mainLayout.addView(textView2);

             /* -------------------------------------*/
            View vieww=new View(this);
            LinearLayout.LayoutParams layoutPara = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    1);
            layoutPara.setMargins(5, 5, 5, 5);
            vieww.setLayoutParams(layoutPara);
            vieww.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            mainLayout.addView(vieww);
             /* -------------------------------------*/
            for(int i=0;i<formModel.getSection().size();i++ )
            {
                FormModel.Sections sections=formModel.section.get(i);
                TextView heading = new TextView(this);
                heading.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                heading.setGravity(Gravity.LEFT);
                heading.setText(sections.getTitle().toUpperCase());
                heading.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
                heading.setPadding(20, 20, 20, 20);// in pixels (
                mainLayout.addView( heading);

                /* ---------------------------labels check------------------------------------------------------*/
                for(int j=0;j<sections.getLabels().size();j++) {

                    FormModel.Labels labels=sections.labels.get(j);
                    if(labels.getWidgetType().equalsIgnoreCase("text")) {
                        TextView labelText = new TextView(this);
                        labelText.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                        labelText.setGravity(Gravity.LEFT);
                        labelText.setText(labels.getLabelText());
                        labelText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
                        labelText.setPadding(20, 20, 20, 20);// in pixels (
                        mainLayout.addView( labelText);

                        EditText labelvalue = new  EditText(this);
                        labelvalue.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                        labelvalue.setGravity(Gravity.LEFT);
                        labelvalue.setTag(labels.getLabelText());
                        labelvalue.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
                        labelvalue.setPadding(30, 5, 20, 5);// in pixels (
                        editTextList.add(labelvalue);
                        labelvalue.addTextChangedListener(new TextWatcher() {
                            @Override
                            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                            }

                            @Override
                            public void onTextChanged(CharSequence s, int start, int before, int count) {
                            }
                            @Override
                            public void afterTextChanged(Editable s) {
                                 if(s.length()>0)
                                 {

                                 }
                            }
                        });
                        mainLayout.addView( labelvalue);
                         /* ------------------------------------------------------------------------------*/
                    }else{
                        TextView labelText = new TextView(this);
                        labelText.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                        labelText.setGravity(Gravity.LEFT);
                        labelText.setText(labels.getLabelText());
                        labelText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
                        labelText.setPadding(20, 20, 20, 20);// in pixels (
                        mainLayout.addView( labelText);
                         /* ------------------------------------------------------------------------------------------------------------------*/
                         RadioGroup radioGroup=new RadioGroup(this);
                         radioGroup.setOrientation(LinearLayout.HORIZONTAL);

                        LinearLayout dependencyLayout=null;
                        /* ---------------------------options check------------------------------------------------------*/
                        for(int k=0;k<labels.getOptions().size();k++)
                        {
                            RadioButton radioButton = new RadioButton(this);
                            radioButton.setText(labels.options.get(k).optionText);
                            String id=i+""+j+""+k;
                            radioButton.setId(Integer.parseInt(id));
                            radioGroup.addView(radioButton);
                             /* ---------------------------dependency check------------------------------------------------------*/
                            if(labels.options.get(k).dependencyLabels.size()>0)
                            { depencyIdList.add(Integer.parseInt(id));
                                dependencyLayout = new LinearLayout(MainActivity.this);
                                dependencyLayout .setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                                dependencyLayout.setOrientation(LinearLayout.VERTICAL);
                                dependencyLayout.setId(Integer.parseInt("1111"));
                                /* ---------------------------dependency labels check------------------------------------------------------*/
                                for(int m=0;m<labels.options.get(k).dependencyLabels.size();m++)
                                {
                                    FormModel.Labels depedencyLabel=labels.options.get(k).dependencyLabels.get(m);
                                    TextView textView = new TextView(this);
                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                                    textView.setGravity(Gravity.CENTER);
                                    layoutParams.setMargins(10, 10, 10, 10); // (left, top, right, bottom)
                                    textView.setLayoutParams(layoutParams);
                                    textView.setText(depedencyLabel.getLabelText());
                                    textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
                                    dependencyLayout.addView(textView);
                                    String widgetType=depedencyLabel.widgetType;
                                    RadioGroup radioGroupp=new RadioGroup(this);
                                    radioGroup.setOrientation(LinearLayout.HORIZONTAL);
                                    LinearLayout dependencyLayout2 = null;
                                    /* ---------------------------dependency options check------------------------------------------------------*/
                                    for(int n=0;n<depedencyLabel.getOptions().size();n++)
                                    {
                                        FormModel.Options dependencyLabelOptions=depedencyLabel.getOptions().get(n);
                                       
                                         if(widgetType.equalsIgnoreCase("radio"))
                                        {
                                            RadioButton radioBtn = new RadioButton(this);
                                            radioBtn.setText(dependencyLabelOptions.optionText);
                                           final String idd = i + "0" + j + "0" + k + "0" + m + "0" + n;
                                            radioBtn.setId(Integer.parseInt(idd));
                                            radioGroupp.addView(radioBtn);
                                            dependencyLayout2= new LinearLayout(MainActivity.this);
                                            dependencyLayout2 .setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                                            dependencyLayout2.setOrientation(LinearLayout.VERTICAL);
                                           for(int x=0;x<dependencyLabelOptions.getDependency().size();x++) {
                                               depencyIdList.add(Integer.parseInt(idd));
                                               FormModel.Labels level2label=dependencyLabelOptions.getDependency().get(x);
                                               TextView label2Text = new TextView(this);
                                               label2Text.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                                               label2Text.setGravity(Gravity.LEFT);
                                               label2Text.setText(level2label.getLabelText());
                                               label2Text.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
                                               label2Text.setPadding(20, 20, 20, 20);// in pixels (
                                               dependencyLayout2.addView( label2Text);
                                               /* ------------------------------------------------------------------------------------------------------------------*/
                                               String widgetType2= level2label.widgetType;
                                               for(int y=0;y<level2label.getOptions().size();y++) {
                                                   if(widgetType2.equalsIgnoreCase("Checkbox"))
                                                   {
                                                       FormModel.Options options2=level2label.options.get(y);
                                                       final CheckBox chbox = new CheckBox(this);
                                                       chbox.setText( options2.optionText);
                                                       String iddd = i + "" + j + "" + k + "" + m + "" + n+""+x+""+y;
                                                       chbox.setId(Integer.parseInt(iddd));
                                                       dependencyLayout2.addView(chbox);
                                                   }

                                               }

//

                                               /* ------------------------------------------------------------------------------------------------------------------*/

                                           }




                                        }
                                        else if(widgetType.equalsIgnoreCase("checkbox")) {
                                            final CheckBox chbox = new CheckBox(this);
                                            chbox.setText(dependencyLabelOptions.optionText);
                                            String idd = i + "" + j + "" + k + "" + m + "" + n;
                                            chbox.setId(Integer.parseInt(idd));
                                            dependencyLayout.addView(chbox);
                                            chbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                                                @Override
                                                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                                                    if (isChecked) {
                                                        if (!dependency.contains(chbox.getText().toString())) {
                                                            dependency.add(chbox.getText().toString());
                                                        }
                                                    } else {
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

                                                }
                                            });
                                        }
                                        else if(widgetType.equalsIgnoreCase("text"))
                                        {
                                            TextView label = new TextView(this);
                                            label.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                                            label.setGravity(Gravity.LEFT);
                                            label.setText(dependencyLabelOptions.optionText);
                                            label.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
                                            label.setPadding(20, 20, 20, 20);// in pixels (
                                            dependencyLayout.addView( labelText);

                                            EditText labelvalue = new  EditText(this);
                                            labelvalue.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                                            labelvalue.setGravity(Gravity.LEFT);
                                            labelvalue.setTag(dependencyLabelOptions.optionText);
                                            labelvalue.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
                                            labelvalue.setPadding(30, 5, 20, 5);// in pixels (
                                            editTextList.add(labelvalue);
                                            dependencyLayout.addView( labelvalue);

                                        }



                                    }




                                }
                            }
                        }
                        mainLayout.addView(radioGroup);

                        final LinearLayout finalDependencyLayout = dependencyLayout;
                        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                            @Override
                            public void onCheckedChanged(RadioGroup group, int checkedId) {
                                Toast.makeText(MainActivity.this,Integer.toString(checkedId),Toast.LENGTH_SHORT).show();
                                if(depencyIdList.contains(checkedId))
                                {
                                    finalDependencyLayout.setVisibility(View.VISIBLE);
                                }else  {
                                    if( finalDependencyLayout!=null) {
                                        finalDependencyLayout.setVisibility(View.GONE);
                                    }
                                }

                            }
                        });
                        if(dependencyLayout!=null) {
                            dependencyLayout.setVisibility(View.GONE);
                            mainLayout.addView(dependencyLayout);
                        }
                  }
               }// le
                View view=new View(this);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1);
                layoutParams.setMargins(5, 5, 5, 5);
                view.setLayoutParams(layoutParams);
                view.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                mainLayout.addView(view);
            }
        }
        Button submit=new Button(this);
        submit.setText("SUBMIT");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(5, 30, 5, 30);
        submit.setLayoutParams(layoutParams);
        submit.setGravity(Gravity.CENTER);
        submit.setTextColor(getResources().getColor(android.R.color.white));
        submit.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isAllFieldsValidated()) {
                    Toast.makeText(MainActivity.this, "All Fields Validated", Toast.LENGTH_SHORT).show();
                }
            }
        });
        mainLayout.addView(submit);

    }

    public boolean isAllFieldsValidated() {
        boolean status = true;
        for (int i = 0; i < editTextList.size(); i++) {
            if (editTextList.get(i).getText().length() == 0) {
                Toast.makeText(MainActivity.this, "Please enter value for"+ editTextList.get(i).getTag().toString()+" in above fields",Toast.LENGTH_SHORT).show();
                return false;
            }
        }
        return status;
    }



}
