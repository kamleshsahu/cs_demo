
package com.kamlesh.google_cs.model.customsearch_model;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchResponse implements Serializable, Parcelable
{

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("url")
    @Expose
    private Url url;
    @SerializedName("queries")
    @Expose
    private Queries queries;
    @SerializedName("context")
    @Expose
    private Context context;
    @SerializedName("searchInformation")
    @Expose
    private SearchInformation searchInformation;
    @SerializedName("spelling")
    @Expose
    private Spelling spelling;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    public final static Creator<SearchResponse> CREATOR = new Creator<SearchResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SearchResponse createFromParcel(Parcel in) {
            return new SearchResponse(in);
        }

        public SearchResponse[] newArray(int size) {
            return (new SearchResponse[size]);
        }

    }
    ;
    private final static long serialVersionUID = -3908317287652370140L;

    protected SearchResponse(Parcel in) {
        this.kind = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((Url) in.readValue((Url.class.getClassLoader())));
        this.queries = ((Queries) in.readValue((Queries.class.getClassLoader())));
        this.context = ((Context) in.readValue((Context.class.getClassLoader())));
        this.searchInformation = ((SearchInformation) in.readValue((SearchInformation.class.getClassLoader())));
        this.spelling = ((Spelling) in.readValue((Spelling.class.getClassLoader())));
        in.readList(this.items, (Item.class.getClassLoader()));
    }

    public SearchResponse() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }

    public Queries getQueries() {
        return queries;
    }

    public void setQueries(Queries queries) {
        this.queries = queries;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public SearchInformation getSearchInformation() {
        return searchInformation;
    }

    public void setSearchInformation(SearchInformation searchInformation) {
        this.searchInformation = searchInformation;
    }

    public Spelling getSpelling() {
        return spelling;
    }

    public void setSpelling(Spelling spelling) {
        this.spelling = spelling;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(kind);
        dest.writeValue(url);
        dest.writeValue(queries);
        dest.writeValue(context);
        dest.writeValue(searchInformation);
        dest.writeValue(spelling);
        dest.writeList(items);
    }

    public int describeContents() {
        return  0;
    }

}
