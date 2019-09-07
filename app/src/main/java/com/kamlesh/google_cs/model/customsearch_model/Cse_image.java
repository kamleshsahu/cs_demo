
package com.kamlesh.google_cs.model.customsearch_model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cse_image implements Parcelable
{

    @SerializedName("src")
    @Expose
    private String src;


    public final static Creator<Cse_image> CREATOR = new Creator<Cse_image>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Cse_image createFromParcel(Parcel in) {
            return new Cse_image(in);
        }

        public Cse_image[] newArray(int size) {
            return (new Cse_image[size]);
        }

    }
    ;
    private final static long serialVersionUID = 3230909590086238752L;

    protected Cse_image(Parcel in) {
        this.src = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Cse_image() {
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(src);
    }

    public int describeContents() {
        return  0;
    }

}
