
package com.kamlesh.google_cs.model.customsearch_model;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hproduct implements Serializable, Parcelable
{

    @SerializedName("fn")
    @Expose
    private String fn;
    public final static Creator<Hproduct> CREATOR = new Creator<Hproduct>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Hproduct createFromParcel(Parcel in) {
            return new Hproduct(in);
        }

        public Hproduct[] newArray(int size) {
            return (new Hproduct[size]);
        }

    }
    ;
    private final static long serialVersionUID = 4156715536360237091L;

    protected Hproduct(Parcel in) {
        this.fn = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Hproduct() {
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(fn);
    }

    public int describeContents() {
        return  0;
    }

}
