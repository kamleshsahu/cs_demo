
package com.kamlesh.google_cs.model.customsearch_model;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchInformation implements Serializable, Parcelable
{

    @SerializedName("searchTime")
    @Expose
    private Double searchTime;
    @SerializedName("formattedSearchTime")
    @Expose
    private String formattedSearchTime;
    @SerializedName("totalResults")
    @Expose
    private String totalResults;
    @SerializedName("formattedTotalResults")
    @Expose
    private String formattedTotalResults;
    public final static Creator<SearchInformation> CREATOR = new Creator<SearchInformation>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SearchInformation createFromParcel(Parcel in) {
            return new SearchInformation(in);
        }

        public SearchInformation[] newArray(int size) {
            return (new SearchInformation[size]);
        }

    }
    ;
    private final static long serialVersionUID = -7787850312917355973L;

    protected SearchInformation(Parcel in) {
        this.searchTime = ((Double) in.readValue((Double.class.getClassLoader())));
        this.formattedSearchTime = ((String) in.readValue((String.class.getClassLoader())));
        this.totalResults = ((String) in.readValue((String.class.getClassLoader())));
        this.formattedTotalResults = ((String) in.readValue((String.class.getClassLoader())));
    }

    public SearchInformation() {
    }

    public Double getSearchTime() {
        return searchTime;
    }

    public void setSearchTime(Double searchTime) {
        this.searchTime = searchTime;
    }

    public String getFormattedSearchTime() {
        return formattedSearchTime;
    }

    public void setFormattedSearchTime(String formattedSearchTime) {
        this.formattedSearchTime = formattedSearchTime;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getFormattedTotalResults() {
        return formattedTotalResults;
    }

    public void setFormattedTotalResults(String formattedTotalResults) {
        this.formattedTotalResults = formattedTotalResults;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(searchTime);
        dest.writeValue(formattedSearchTime);
        dest.writeValue(totalResults);
        dest.writeValue(formattedTotalResults);
    }

    public int describeContents() {
        return  0;
    }

}
