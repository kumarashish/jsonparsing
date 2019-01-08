package jsonparsing.com.samplejsonparsing;

import org.json.JSONObject;

/**
 * Created by ashish.kumar on 08-01-2019.
 */

public class PatientInfo {
    String name;
    String  UMRNo;
    String Gender;
    String  age;
    public PatientInfo (JSONObject jsonObject)
    {try {
        this.name = jsonObject.isNull("name") ? "" : jsonObject.getString("name");
        this.UMRNo = jsonObject.isNull("UMRNo.") ? "" : jsonObject.getString("UMRNo.");
        this.Gender = jsonObject.isNull("Gender") ? "" : jsonObject.getString("Gender");
        this.age = jsonObject.isNull("age") ? "" : jsonObject.getString("age");
    }catch (Exception ex)
    {
        ex.fillInStackTrace();
    }

    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return Gender;
    }

    public String getUMRNo() {
        return UMRNo;
    }
}
