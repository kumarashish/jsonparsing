package jsonparsing.com.samplejsonparsing;

import android.view.View;

public class RequestModel {
    String label_id;
   String label_value;
   String option_id;
  String option_value;
String parent_label_id;
String defaultt;
boolean isCheckbox;
int type;
View view;
public RequestModel(String label_id,String label_value,String option_id,String option_value,String parent_label_id,String defaultt,boolean isCheckbox,int type,View view)
{
    this.label_id=label_id;
    this.label_value=label_value;
    this.option_id=option_id;
    this.option_value=option_value;
    this.parent_label_id=parent_label_id;
    this.defaultt=defaultt;
    this.isCheckbox=isCheckbox;
    this.type=type;
    this.view=view;
}

    public int getType() {
        return type;
    }

    public View getView() {
        return view;
    }

    public boolean isCheckbox() {
        return isCheckbox;
    }

    public void setView(int type,View view) {
    this.type=type;
        this.view = view;
    }

    public String getDefaultt() {
        return defaultt;
    }

    public String getLabel_id() {
        return label_id;
    }

    public String getLabel_value() {
        return label_value;
    }

    public String getOption_id() {
        return option_id;
    }

    public String getOption_value() {
        return option_value;
    }

    public String getParent_label_id() {
        return parent_label_id;
    }

    public void setLabel_id(String label_id) {
        this.label_id = label_id;
    }

    public void setLabel_value(String label_value) {
        this.label_value = label_value;
    }

    public void setOption_id(String option_id) {
        this.option_id = option_id;
    }

    public void setOption_value(String option_value) {
        this.option_value = option_value;
    }

    public void setIsCheckbox(boolean b) {
    this.isCheckbox=b;
    }
}
