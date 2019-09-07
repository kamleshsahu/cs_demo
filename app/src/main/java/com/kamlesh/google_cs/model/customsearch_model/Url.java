
package com.kamlesh.google_cs.model.customsearch_model;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Url implements Serializable, Parcelable
{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("template")
    @Expose
    private String template;
    public final static Creator<Url> CREATOR = new Creator<Url>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Url createFromParcel(Parcel in) {
            return new Url(in);
        }

        public Url[] newArray(int size) {
            return (new Url[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8861812180916195119L;

    protected Url(Parcel in) {
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.template = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Url() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(template);
    }

    public int describeContents() {
        return  0;
    }

}
