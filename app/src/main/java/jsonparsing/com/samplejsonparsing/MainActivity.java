package jsonparsing.com.samplejsonparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

PatientInfo infoModel=null;
FormModel formModel=null;
LinearLayout mainLayout;
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
            JSONObject jsonObject=new JSONObject(Common.json);
            if(jsonObject.getString("code").equalsIgnoreCase("200"))
            {

                JSONObject result=jsonObject.getJSONObject("result");
                infoModel=new PatientInfo(result.getJSONObject("patient"));
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
            TextView textView1 = new TextView(this);
            textView1.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            textView1.setGravity(Gravity.CENTER);
            textView1.setText(formModel.getFormName());
            ;
            textView1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);

            textView1.setPadding(20, 20, 20, 20);// in pixels (left, top, right, bottom)
            mainLayout.addView(textView1);
            TextView textView2 = new TextView(this);
            textView2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            textView2.setGravity(Gravity.CENTER);
            textView2.setText(formModel.getFormType());
            ;
            textView2.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);

            textView2.setPadding(20, 20, 20, 20);// in pixels (left, top, right, bottom)
            mainLayout.addView(textView2);
            View vieww=new View(this);
            LinearLayout.LayoutParams layoutPara = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    1);
            layoutPara.setMargins(5, 5, 5, 5);
            vieww.setLayoutParams(layoutPara);
            vieww.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            mainLayout.addView(vieww);
            for(int i=0;i<formModel.getSection().size();i++ )
            {
                FormModel.Sections sections=formModel.section.get(i);
                TextView heading = new TextView(this);
                heading.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                heading.setGravity(Gravity.LEFT);
                heading.setText(sections.getTitle().toUpperCase());
                ;
                heading.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);

                heading.setPadding(20, 20, 20, 20);// in pixels (
                mainLayout.addView( heading);
                for(int j=0;j<sections.getLabels().size();j++) {
                    FormModel.Labels labels=sections.labels.get(j);

                    if(labels.getWidgetType().equalsIgnoreCase("text")) {
                        TextView labelvalue = new TextView(this);
                        labelvalue.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                        labelvalue.setGravity(Gravity.LEFT);
                        labelvalue.setText(labels.getLabelText());
                        labelvalue.setTextSize(TypedValue.COMPLEX_UNIT_SP, 12);
                        labelvalue.setPadding(30, 5, 20, 5);// in pixels (
                        mainLayout.addView( labelvalue);
                    }else{
                        TextView labelText = new TextView(this);
                        labelText.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                        labelText.setGravity(Gravity.LEFT);
                        labelText.setText(labels.getLabelText());
                        ;
                        labelText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);

                        labelText.setPadding(20, 20, 20, 20);// in pixels (
                        mainLayout.addView( labelText);
                        for(int k=0;k<labels.getOptions().size();k++)
                        {
                            RadioButton radioButton = new RadioButton(this);
                            radioButton.setText(labels.options.get(k).optionText);
                            mainLayout.addView( radioButton);
                            if(labels.options.get(k).dependencyLabels.size()>0)
                            {
                                for(int m=0;m<labels.options.get(k).dependencyLabels.size();m++)
                                {
                                    FormModel.Labels depedencyLabel=labels.options.get(k).dependencyLabels.get(m);
                                    TextView textView = new TextView(this);
                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                                            LinearLayout.LayoutParams.WRAP_CONTENT);
                                    textView.setGravity(Gravity.CENTER);
                                    layoutParams.setMargins(10, 10, 10, 10); // (left, top, right, bottom)
                                    textView.setLayoutParams(layoutParams);
                                    textView.setText(depedencyLabel.getLabelText());
                                    textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
                                    mainLayout.addView(textView);
                                    for(int n=0;n<depedencyLabel.getOptions().size();n++)
                                    {
                                        FormModel.Options dependencyLabelOptions=depedencyLabel.getOptions().get(n);
                                       CheckBox chbox= new CheckBox(this);
                                        chbox.setText(dependencyLabelOptions.optionText);
                                        mainLayout.addView( chbox);
                                        if(dependencyLabelOptions.getDependency().size()>0)
                                        {
                                            for(int l=0;i<dependencyLabelOptions.getDependency().size();l++)
                                            {
                                                    FormModel.Labels dependencyLabelsinside=dependencyLabelOptions.getDependency().get(k);

                                                    for(int p=0;p<dependencyLabelsinside.getOptions().size();p++)
                                                    {
                                                        FormModel.Options depencyOptions=dependencyLabelsinside.options.get(p);
                                                    }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                  }
               }// le


View view=new View(this);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                      1);
                layoutParams.setMargins(5, 5, 5, 5);
                view.setLayoutParams(layoutParams);
                view.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                mainLayout.addView(view);

            }
        }
    }
}
