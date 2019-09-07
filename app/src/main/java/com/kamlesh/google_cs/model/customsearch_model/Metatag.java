
package com.kamlesh.google_cs.model.customsearch_model;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metatag implements Serializable, Parcelable
{

    @SerializedName("viewport")
    @Expose
    private String viewport;
    @SerializedName("apple-itunes-app")
    @Expose
    private String apple_itunes_app;
    @SerializedName("fb:app_id")
    @Expose
    private String fb_app_id;
    @SerializedName("og:site_name")
    @Expose
    private String og_site_name;
    @SerializedName("twitter:site")
    @Expose
    private String twitter_site;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("og:title")
    @Expose
    private String og_title;
    @SerializedName("og:image")
    @Expose
    private String og_image;
    @SerializedName("og:updated_time")
    @Expose
    private String og_updated_time;
    @SerializedName("og:url")
    @Expose
    private String og_url;
    @SerializedName("og:description")
    @Expose
    private String og_description;
    @SerializedName("og:type")
    @Expose
    private String og_type;
    @SerializedName("twitter:card")
    @Expose
    private String twitter_card;
    @SerializedName("twitter:title")
    @Expose
    private String twitter_title;
    @SerializedName("twitter:description")
    @Expose
    private String twitter_description;
    @SerializedName("twitter:image")
    @Expose
    private String twitter_image;
    @SerializedName("twitter:creator")
    @Expose
    private String twitter_creator;
    @SerializedName("article:publisher")
    @Expose
    private String article_publisher;
    @SerializedName("article:author")
    @Expose
    private String article_author;
    @SerializedName("article:section")
    @Expose
    private String article_section;
    @SerializedName("article:section_url")
    @Expose
    private String article_section_url;
    @SerializedName("article:id")
    @Expose
    private String article_id;
    @SerializedName("article:published")
    @Expose
    private String article_published;
    @SerializedName("article:modified")
    @Expose
    private String article_modified;
    @SerializedName("referrer")
    @Expose
    private String referrer;
    @SerializedName("google")
    @Expose
    private String google;
    @SerializedName("theme-color")
    @Expose
    private String theme_color;
    @SerializedName("og:image:width")
    @Expose
    private String og_image_width;
    @SerializedName("og:image:height")
    @Expose
    private String og_image_height;
    @SerializedName("twitter:image:src")
    @Expose
    private String twitter_image_src;
    @SerializedName("format-detection")
    @Expose
    private String format_detection;
    public final static Creator<Metatag> CREATOR = new Creator<Metatag>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Metatag createFromParcel(Parcel in) {
            return new Metatag(in);
        }

        public Metatag[] newArray(int size) {
            return (new Metatag[size]);
        }

    }
    ;
    private final static long serialVersionUID = 2538524806769239079L;

    protected Metatag(Parcel in) {
        this.viewport = ((String) in.readValue((String.class.getClassLoader())));
        this.apple_itunes_app = ((String) in.readValue((String.class.getClassLoader())));
        this.fb_app_id = ((String) in.readValue((String.class.getClassLoader())));
        this.og_site_name = ((String) in.readValue((String.class.getClassLoader())));
        this.twitter_site = ((String) in.readValue((String.class.getClassLoader())));
        this.author = ((String) in.readValue((String.class.getClassLoader())));
        this.og_title = ((String) in.readValue((String.class.getClassLoader())));
        this.og_image = ((String) in.readValue((String.class.getClassLoader())));
        this.og_updated_time = ((String) in.readValue((String.class.getClassLoader())));
        this.og_url = ((String) in.readValue((String.class.getClassLoader())));
        this.og_description = ((String) in.readValue((String.class.getClassLoader())));
        this.og_type = ((String) in.readValue((String.class.getClassLoader())));
        this.twitter_card = ((String) in.readValue((String.class.getClassLoader())));
        this.twitter_title = ((String) in.readValue((String.class.getClassLoader())));
        this.twitter_description = ((String) in.readValue((String.class.getClassLoader())));
        this.twitter_image = ((String) in.readValue((String.class.getClassLoader())));
        this.twitter_creator = ((String) in.readValue((String.class.getClassLoader())));
        this.article_publisher = ((String) in.readValue((String.class.getClassLoader())));
        this.article_author = ((String) in.readValue((String.class.getClassLoader())));
        this.article_section = ((String) in.readValue((String.class.getClassLoader())));
        this.article_section_url = ((String) in.readValue((String.class.getClassLoader())));
        this.article_id = ((String) in.readValue((String.class.getClassLoader())));
        this.article_published = ((String) in.readValue((String.class.getClassLoader())));
        this.article_modified = ((String) in.readValue((String.class.getClassLoader())));
        this.referrer = ((String) in.readValue((String.class.getClassLoader())));
        this.google = ((String) in.readValue((String.class.getClassLoader())));
        this.theme_color = ((String) in.readValue((String.class.getClassLoader())));
        this.og_image_width = ((String) in.readValue((String.class.getClassLoader())));
        this.og_image_height = ((String) in.readValue((String.class.getClassLoader())));
        this.twitter_image_src = ((String) in.readValue((String.class.getClassLoader())));
        this.format_detection = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Metatag() {
    }

    public String getViewport() {
        return viewport;
    }

    public void setViewport(String viewport) {
        this.viewport = viewport;
    }

    public String getApple_itunes_app() {
        return apple_itunes_app;
    }

    public void setApple_itunes_app(String apple_itunes_app) {
        this.apple_itunes_app = apple_itunes_app;
    }

    public String getFb_app_id() {
        return fb_app_id;
    }

    public void setFb_app_id(String fb_app_id) {
        this.fb_app_id = fb_app_id;
    }

    public String getOg_site_name() {
        return og_site_name;
    }

    public void setOg_site_name(String og_site_name) {
        this.og_site_name = og_site_name;
    }

    public String getTwitter_site() {
        return twitter_site;
    }

    public void setTwitter_site(String twitter_site) {
        this.twitter_site = twitter_site;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getOg_title() {
        return og_title;
    }

    public void setOg_title(String og_title) {
        this.og_title = og_title;
    }

    public String getOg_image() {
        return og_image;
    }

    public void setOg_image(String og_image) {
        this.og_image = og_image;
    }

    public String getOg_updated_time() {
        return og_updated_time;
    }

    public void setOg_updated_time(String og_updated_time) {
        this.og_updated_time = og_updated_time;
    }

    public String getOg_url() {
        return og_url;
    }

    public void setOg_url(String og_url) {
        this.og_url = og_url;
    }

    public String getOg_description() {
        return og_description;
    }

    public void setOg_description(String og_description) {
        this.og_description = og_description;
    }

    public String getOg_type() {
        return og_type;
    }

    public void setOg_type(String og_type) {
        this.og_type = og_type;
    }

    public String getTwitter_card() {
        return twitter_card;
    }

    public void setTwitter_card(String twitter_card) {
        this.twitter_card = twitter_card;
    }

    public String getTwitter_title() {
        return twitter_title;
    }

    public void setTwitter_title(String twitter_title) {
        this.twitter_title = twitter_title;
    }

    public String getTwitter_description() {
        return twitter_description;
    }

    public void setTwitter_description(String twitter_description) {
        this.twitter_description = twitter_description;
    }

    public String getTwitter_image() {
        return twitter_image;
    }

    public void setTwitter_image(String twitter_image) {
        this.twitter_image = twitter_image;
    }

    public String getTwitter_creator() {
        return twitter_creator;
    }

    public void setTwitter_creator(String twitter_creator) {
        this.twitter_creator = twitter_creator;
    }

    public String getArticle_publisher() {
        return article_publisher;
    }

    public void setArticle_publisher(String article_publisher) {
        this.article_publisher = article_publisher;
    }

    public String getArticle_author() {
        return article_author;
    }

    public void setArticle_author(String article_author) {
        this.article_author = article_author;
    }

    public String getArticle_section() {
        return article_section;
    }

    public void setArticle_section(String article_section) {
        this.article_section = article_section;
    }

    public String getArticle_section_url() {
        return article_section_url;
    }

    public void setArticle_section_url(String article_section_url) {
        this.article_section_url = article_section_url;
    }

    public String getArticle_id() {
        return article_id;
    }

    public void setArticle_id(String article_id) {
        this.article_id = article_id;
    }

    public String getArticle_published() {
        return article_published;
    }

    public void setArticle_published(String article_published) {
        this.article_published = article_published;
    }

    public String getArticle_modified() {
        return article_modified;
    }

    public void setArticle_modified(String article_modified) {
        this.article_modified = article_modified;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getGoogle() {
        return google;
    }

    public void setGoogle(String google) {
        this.google = google;
    }

    public String getTheme_color() {
        return theme_color;
    }

    public void setTheme_color(String theme_color) {
        this.theme_color = theme_color;
    }

    public String getOg_image_width() {
        return og_image_width;
    }

    public void setOg_image_width(String og_image_width) {
        this.og_image_width = og_image_width;
    }

    public String getOg_image_height() {
        return og_image_height;
    }

    public void setOg_image_height(String og_image_height) {
        this.og_image_height = og_image_height;
    }

    public String getTwitter_image_src() {
        return twitter_image_src;
    }

    public void setTwitter_image_src(String twitter_image_src) {
        this.twitter_image_src = twitter_image_src;
    }

    public String getFormat_detection() {
        return format_detection;
    }

    public void setFormat_detection(String format_detection) {
        this.format_detection = format_detection;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(viewport);
        dest.writeValue(apple_itunes_app);
        dest.writeValue(fb_app_id);
        dest.writeValue(og_site_name);
        dest.writeValue(twitter_site);
        dest.writeValue(author);
        dest.writeValue(og_title);
        dest.writeValue(og_image);
        dest.writeValue(og_updated_time);
        dest.writeValue(og_url);
        dest.writeValue(og_description);
        dest.writeValue(og_type);
        dest.writeValue(twitter_card);
        dest.writeValue(twitter_title);
        dest.writeValue(twitter_description);
        dest.writeValue(twitter_image);
        dest.writeValue(twitter_creator);
        dest.writeValue(article_publisher);
        dest.writeValue(article_author);
        dest.writeValue(article_section);
        dest.writeValue(article_section_url);
        dest.writeValue(article_id);
        dest.writeValue(article_published);
        dest.writeValue(article_modified);
        dest.writeValue(referrer);
        dest.writeValue(google);
        dest.writeValue(theme_color);
        dest.writeValue(og_image_width);
        dest.writeValue(og_image_height);
        dest.writeValue(twitter_image_src);
        dest.writeValue(format_detection);
    }

    public int describeContents() {
        return  0;
    }

}
