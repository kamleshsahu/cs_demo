
package com.kamlesh.google_cs.model.customsearch_model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.util.DiffUtil;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item implements Parcelable
{

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("htmlTitle")
    @Expose
    private String htmlTitle;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("displayLink")
    @Expose
    private String displayLink;
    @SerializedName("snippet")
    @Expose
    private String snippet;
    @SerializedName("htmlSnippet")
    @Expose
    private String htmlSnippet;
    @SerializedName("cacheId")
    @Expose
    private String cacheId;
    @SerializedName("formattedUrl")
    @Expose
    private String formattedUrl;
    @SerializedName("htmlFormattedUrl")
    @Expose
    private String htmlFormattedUrl;
    @SerializedName("pagemap")
    @Expose
    private Pagemap pagemap;
    public final static Creator<Item> CREATOR = new Creator<Item>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Item createFromParcel(Parcel in) {
            return new Item(in);
        }

        public Item[] newArray(int size) {
            return (new Item[size]);
        }

    }
    ;
    private final static long serialVersionUID = -3804557731611999812L;

    protected Item(Parcel in) {
        this.kind = ((String) in.readValue((String.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.htmlTitle = ((String) in.readValue((String.class.getClassLoader())));
        this.link = ((String) in.readValue((String.class.getClassLoader())));
        this.displayLink = ((String) in.readValue((String.class.getClassLoader())));
        this.snippet = ((String) in.readValue((String.class.getClassLoader())));
        this.htmlSnippet = ((String) in.readValue((String.class.getClassLoader())));
        this.cacheId = ((String) in.readValue((String.class.getClassLoader())));
        this.formattedUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.htmlFormattedUrl = ((String) in.readValue((String.class.getClassLoader())));
        this.pagemap = ((Pagemap) in.readValue((Pagemap.class.getClassLoader())));
    }

    public Item() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHtmlTitle() {
        return htmlTitle;
    }

    public void setHtmlTitle(String htmlTitle) {
        this.htmlTitle = htmlTitle;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDisplayLink() {
        return displayLink;
    }

    public void setDisplayLink(String displayLink) {
        this.displayLink = displayLink;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getHtmlSnippet() {
        return htmlSnippet;
    }

    public void setHtmlSnippet(String htmlSnippet) {
        this.htmlSnippet = htmlSnippet;
    }

    public String getCacheId() {
        return cacheId;
    }

    public void setCacheId(String cacheId) {
        this.cacheId = cacheId;
    }

    public String getFormattedUrl() {
        return formattedUrl;
    }

    public void setFormattedUrl(String formattedUrl) {
        this.formattedUrl = formattedUrl;
    }

    public String getHtmlFormattedUrl() {
        return htmlFormattedUrl;
    }

    public void setHtmlFormattedUrl(String htmlFormattedUrl) {
        this.htmlFormattedUrl = htmlFormattedUrl;
    }

    public Pagemap getPagemap() {
        return pagemap;
    }

    public void setPagemap(Pagemap pagemap) {
        this.pagemap = pagemap;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(kind);
        dest.writeValue(title);
        dest.writeValue(htmlTitle);
        dest.writeValue(link);
        dest.writeValue(displayLink);
        dest.writeValue(snippet);
        dest.writeValue(htmlSnippet);
        dest.writeValue(cacheId);
        dest.writeValue(formattedUrl);
        dest.writeValue(htmlFormattedUrl);
        dest.writeValue(pagemap);
    }

    public int describeContents() {
        return  0;
    }


    public static final DiffUtil.ItemCallback<Item> CALLBACK=new DiffUtil.ItemCallback<Item>() {
        @Override
        public boolean areItemsTheSame(Item oldItem, Item newItem) {
            return oldItem.cacheId.equals(newItem.cacheId);
        }

        @Override
        public boolean areContentsTheSame(Item oldItem, Item newItem) {
            return false;
        }
    };

}
