
package com.androidtutz.anushka.tmdbclient.model;

import java.io.Serializable;

import android.databinding.BindingAdapter;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.widget.ImageView;

import com.androidtutz.anushka.tmdbclient.R;
import com.bumptech.glide.Glide;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cse_thumbnail implements Serializable, Parcelable
{

    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    @SerializedName("src")
    @Expose
    private String src;
//    @BindingAdapter({"src"})
//    public static void loadImage(ImageView imageView, String imageURL){
//
//        Glide.with(imageView.getContext())
//                .load(imageURL)
//                .placeholder(R.drawable.loading)
//                .into(imageView);
//    }

    public final static Creator<Cse_thumbnail> CREATOR = new Creator<Cse_thumbnail>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Cse_thumbnail createFromParcel(Parcel in) {
            return new Cse_thumbnail(in);
        }

        public Cse_thumbnail[] newArray(int size) {
            return (new Cse_thumbnail[size]);
        }

    }
    ;
    private final static long serialVersionUID = 7825623706869136931L;

    protected Cse_thumbnail(Parcel in) {
        this.width = ((String) in.readValue((String.class.getClassLoader())));
        this.height = ((String) in.readValue((String.class.getClassLoader())));
        this.src = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Cse_thumbnail() {
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(width);
        dest.writeValue(height);
        dest.writeValue(src);
    }

    public int describeContents() {
        return  0;
    }

}
