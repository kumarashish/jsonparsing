package jsonparsing.com.samplejsonparsing;

import org.json.JSONArray;
import org.json.JSONObject;

import java.security.PublicKey;
import java.util.ArrayList;

/**
 * Created by ashish.kumar on 08-01-2019.
 */

public class FormModel {
   String  formType;
   String formName;
   ArrayList<Sections> section=new ArrayList<>();
    public FormModel(JSONObject jsonObject)
    {
        try{
            this.formType= jsonObject.isNull("formType") ? "" : jsonObject.getString("formType");
            this.formName= jsonObject.isNull("formName") ? "" : jsonObject.getString("formName");
            JSONArray jsonArray=jsonObject.getJSONArray("sections");
            section.clear();
            for(int i=0;i<jsonArray.length();i++)
            {
                section.add(new Sections(jsonArray.getJSONObject(i)));
            }
        }catch (Exception ex)
        {
            ex.fillInStackTrace();
        }
    }

    public ArrayList<Sections> getSection() {
        return section;
    }

    public String getFormName() {
        return formName;
    }

    public String getFormType() {
        return formType;
    }
/*---------------------------------------sections------------------------------------------*/
    public class Sections
    {String title;
        String brief;
        ArrayList< Labels> labels=new ArrayList<>();

public Sections(JSONObject jsonObject)
{try {
    this.title = jsonObject.isNull("title") ? "" : jsonObject.getString("title");
    this.brief = jsonObject.isNull("brief") ? "" : jsonObject.getString("brief");
    JSONArray jsonArray = jsonObject.isNull("labels")?null:jsonObject.getJSONArray("labels");
    labels.clear();
    for(int i=0;i<jsonArray.length();i++)
    {
        labels.add(new  Labels(jsonArray.getJSONObject(i)));
    }
}catch (Exception ex)
{
    ex.fillInStackTrace();
}
}

        public ArrayList< Labels> getLabels() {
            return  labels;
        }

        public String getBrief() {
            return brief;
        }

        public String getTitle() {
            return title;
        }
    }

    /*---------------------------------------labels------------------------------------------*/
    public class Labels{
        String id;
        String widgetType;
        String labelText;
        ArrayList <Options>options=new ArrayList<>();

        public  Labels(JSONObject jsonObject)
        {try {
            options.clear();
            this.id = jsonObject.isNull("id") ? "" : jsonObject.getString("id");
            this.widgetType = jsonObject.isNull("widgetType") ? "" : jsonObject.getString("widgetType");
            this.labelText = jsonObject.isNull("labeltext") ? jsonObject.getString("labelText") : jsonObject.getString("labeltext");
            JSONArray optionsarray = jsonObject.isNull("options") ? null : jsonObject.getJSONArray("options");
            if(optionsarray!=null)
            {
              for(int i=0;i<optionsarray.length();i++)
              {
                  options.add(new Options(optionsarray.getJSONObject(i))) ;
              }
            }
        }catch (Exception ex)
        {
            ex.fillInStackTrace();
        }
        }

        public String getId() {
            return id;
        }

        public ArrayList<Options> getOptions() {
            return options;
        }

        public String getLabelText() {
            return labelText;
        }

        public String getWidgetType() {
            return widgetType;
        }

    }

     /*---------------------------------------Options------------------------------------------*/

     public class Options{
        String  id;
         String  optionText;
         String  defaultt;

         ArrayList<Labels>dependencyLabels=new ArrayList<>();
         public Options(JSONObject jsonObject)
         {
             try {
                 dependencyLabels.clear();
                 this.id = jsonObject.isNull("id") ? "" : jsonObject.getString("id");
                 this.optionText = jsonObject.isNull("optionText") ? "" : jsonObject.getString("optionText");
                 this.defaultt = jsonObject.isNull("default") ? "" : jsonObject.getString("default");
                 JSONArray dependencyarray = jsonObject.isNull("dependency") ? null : jsonObject.getJSONArray("dependency");
                 if (dependencyarray != null) {
                     for (int i = 0; i < dependencyarray.length(); i++) {
                         JSONArray labelsDependencyArray=dependencyarray.getJSONObject(i).getJSONArray("labels");
 for(int j=0;j<labelsDependencyArray.length();j++) {


     dependencyLabels.add(new Labels(labelsDependencyArray.getJSONObject(j)));
 }
                     }
                 }
             }catch (Exception ex)
             {
                 ex.fillInStackTrace();
             }
         }

         public String getId() {
             return id;
         }

         public ArrayList<Labels> getDependency() {
             return dependencyLabels;
         }

         public String getDefaultt() {
             return defaultt;
         }

         public String getOptionText() {
             return optionText;
         }
     }

}
