
package com.kamlesh.google_cs.model.customsearch_model;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.util.DiffUtil;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request implements Serializable, Parcelable
{

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("totalResults")
    @Expose
    private String totalResults;
    @SerializedName("searchTerms")
    @Expose
    private String searchTerms;
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("startIndex")
    @Expose
    private Integer startIndex;



    @SerializedName("inputEncoding")
    @Expose
    private String inputEncoding;
    @SerializedName("outputEncoding")
    @Expose
    private String outputEncoding;
    @SerializedName("safe")
    @Expose
    private String safe;
    @SerializedName("cx")
    @Expose
    private String cx;
    public final static Creator<Request> CREATOR = new Creator<Request>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Request createFromParcel(Parcel in) {
            return new Request(in);
        }

        public Request[] newArray(int size) {
            return (new Request[size]);
        }

    }
    ;
    private final static long serialVersionUID = 6861805605127596358L;

    protected Request(Parcel in) {
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.totalResults = ((String) in.readValue((String.class.getClassLoader())));
        this.searchTerms = ((String) in.readValue((String.class.getClassLoader())));
        this.count = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.startIndex = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.inputEncoding = ((String) in.readValue((String.class.getClassLoader())));
        this.outputEncoding = ((String) in.readValue((String.class.getClassLoader())));
        this.safe = ((String) in.readValue((String.class.getClassLoader())));
        this.cx = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Request() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getSearchTerms() {
        return searchTerms;
    }

    public void setSearchTerms(String searchTerms) {
        this.searchTerms = searchTerms;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public String getInputEncoding() {
        return inputEncoding;
    }

    public void setInputEncoding(String inputEncoding) {
        this.inputEncoding = inputEncoding;
    }

    public String getOutputEncoding() {
        return outputEncoding;
    }

    public void setOutputEncoding(String outputEncoding) {
        this.outputEncoding = outputEncoding;
    }

    public String getSafe() {
        return safe;
    }

    public void setSafe(String safe) {
        this.safe = safe;
    }

    public String getCx() {
        return cx;
    }

    public void setCx(String cx) {
        this.cx = cx;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(title);
        dest.writeValue(totalResults);
        dest.writeValue(searchTerms);
        dest.writeValue(count);
        dest.writeValue(startIndex);
        dest.writeValue(inputEncoding);
        dest.writeValue(outputEncoding);
        dest.writeValue(safe);
        dest.writeValue(cx);
    }

    public int describeContents() {
        return  0;
    }

    public static final DiffUtil.ItemCallback<Request> CALLBACK=new DiffUtil.ItemCallback<Request>() {
        @Override
        public boolean areItemsTheSame(Request oldItem, Request newItem) {
            return oldItem.startIndex == newItem.startIndex;
        }

        @Override
        public boolean areContentsTheSame(Request oldItem, Request newItem) {
            return false;
        }


    };


}
