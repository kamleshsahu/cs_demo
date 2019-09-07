
package com.kamlesh.google_cs.model.customsearch_model;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Website implements Serializable, Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("image")
    @Expose
    private String image;
    public final static Creator<Website> CREATOR = new Creator<Website>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Website createFromParcel(Parcel in) {
            return new Website(in);
        }

        public Website[] newArray(int size) {
            return (new Website[size]);
        }

    }
    ;
    private final static long serialVersionUID = -1533879337511330611L;

    protected Website(Parcel in) {
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.image = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Website() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(description);
        dest.writeValue(url);
        dest.writeValue(image);
    }

    public int describeContents() {
        return  0;
    }

}
