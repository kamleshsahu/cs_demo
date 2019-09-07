
package com.kamlesh.google_cs.model.customsearch_model;

import java.util.ArrayList;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagemap implements Parcelable
{

    @SerializedName("cse_thumbnail")
    @Expose
    private List<Cse_thumbnail> cse_thumbnail =new ArrayList<>();
    @SerializedName("metatags")
    @Expose
    private List<Metatag> metatags = new ArrayList<>();
    @SerializedName("cse_image")
    @Expose
    private List<Cse_image> cse_image = new ArrayList<>();
    @SerializedName("website")
    @Expose
    private List<Website> website = new ArrayList<>();
    @SerializedName("product")
    @Expose
    private List<Product> product = new ArrayList<>();
    @SerializedName("hproduct")
    @Expose
    private List<Hproduct> hproduct = new ArrayList<>();
    public final static Creator<Pagemap> CREATOR = new Creator<Pagemap>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Pagemap createFromParcel(Parcel in) {
            return new Pagemap(in);
        }

        public Pagemap[] newArray(int size) {
            return (new Pagemap[size]);
        }

    }
    ;
    private final static long serialVersionUID = -9203134672373038046L;

    protected Pagemap(Parcel in) {
        in.readList(this.cse_thumbnail,(Cse_thumbnail.class.getClassLoader()));
        in.readList(this.metatags, (Metatag.class.getClassLoader()));
        in.readList(this.cse_image, (Cse_image.class.getClassLoader()));
        in.readList(this.website, (Website.class.getClassLoader()));
        in.readList(this.product, (Product.class.getClassLoader()));
        in.readList(this.hproduct, (Hproduct.class.getClassLoader()));
    }

    public Pagemap() {
    }

    public List<Cse_thumbnail> getCse_thumbnail() {
        return cse_thumbnail;
    }

    public void setCse_thumbnail(List<Cse_thumbnail> cse_thumbnail) {
        this.cse_thumbnail = cse_thumbnail;
    }

    public List<Metatag> getMetatags() {
        return metatags;
    }

    public void setMetatags(List<Metatag> metatags) {
        this.metatags = metatags;
    }

    public List<Cse_image> getCse_image() {
        return cse_image;
    }

    public void setCse_image(List<Cse_image> cse_image) {
        this.cse_image = cse_image;
    }

    public List<Website> getWebsite() {
        return website;
    }

    public void setWebsite(List<Website> website) {
        this.website = website;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public List<Hproduct> getHproduct() {
        return hproduct;
    }

    public void setHproduct(List<Hproduct> hproduct) {
        this.hproduct = hproduct;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(cse_thumbnail);
        dest.writeList(metatags);
        dest.writeList(cse_image);
        dest.writeList(website);
        dest.writeList(product);
        dest.writeList(hproduct);
    }

    public int describeContents() {
        return  0;
    }

}
