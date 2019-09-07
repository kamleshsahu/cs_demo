
package com.kamlesh.google_cs.model.customsearch_model;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Queries implements Serializable, Parcelable
{

    @SerializedName("request")
    @Expose
    private List<Request> request = null;
    @SerializedName("nextPage")
    @Expose
    private List<NextPage> nextPage = null;
    public final static Creator<Queries> CREATOR = new Creator<Queries>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Queries createFromParcel(Parcel in) {
            return new Queries(in);
        }

        public Queries[] newArray(int size) {
            return (new Queries[size]);
        }

    }
    ;
    private final static long serialVersionUID = -9125174727204263399L;

    protected Queries(Parcel in) {
        in.readList(this.request, (Request.class.getClassLoader()));
        in.readList(this.nextPage, (NextPage.class.getClassLoader()));
    }

    public Queries() {
    }

    public List<Request> getRequest() {
        return request;
    }

    public void setRequest(List<Request> request) {
        this.request = request;
    }

    public List<NextPage> getNextPage() {
        return nextPage;
    }

    public void setNextPage(List<NextPage> nextPage) {
        this.nextPage = nextPage;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(request);
        dest.writeList(nextPage);
    }

    public int describeContents() {
        return  0;
    }

}
