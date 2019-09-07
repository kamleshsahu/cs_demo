package com.kamlesh.google_cs.model;

import android.app.Application;
import android.arch.paging.PageKeyedDataSource;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.util.Log;


import com.kamlesh.google_cs.R;
import com.kamlesh.google_cs.model.customsearch_model.Item;
import com.kamlesh.google_cs.model.customsearch_model.SearchResponse;
import com.kamlesh.google_cs.service.csDataService;
import com.kamlesh.google_cs.service.csRetrofitInstance;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class csDataSource extends PageKeyedDataSource<Integer,Item> {
  //  private MovieDataService movieDataService;
    private Application application;
    private csDataService dataService;
    private String query;

    public csDataSource(csDataService dataService, Application application,String query) {
        this.dataService = dataService;
        this.application = application;
        this.query=query;
    }


    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params, @NonNull final LoadInitialCallback<Integer, Item> callback) {
        dataService= csRetrofitInstance.getService();

        Call<SearchResponse> call = dataService.searchImages(
                application.getApplicationContext().getString(R.string.gogole_cs_api_key),
                application.getApplicationContext().getString(R.string.gogole_cs_cx),
                query,
                1);

        call.enqueue(new Callback<SearchResponse>() {
            @Override
            public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response) {
                SearchResponse csResponse=response.body();
                ArrayList<Item> items = new ArrayList<>();

                if(csResponse != null && csResponse.getItems() != null) {
                    items = (ArrayList<Item>) csResponse.getItems();

                    callback.onResult(items, null, 11);
                }
            }

            @Override
            public void onFailure(Call<SearchResponse> call, Throwable t) {

            }
        });
    }

    @Override
    public void loadBefore(@NonNull LoadParams<Integer> params, @NonNull LoadCallback<Integer, Item> callback) {

    }

    @Override
    public void loadAfter(@NonNull final LoadParams<Integer> params, @NonNull final LoadCallback<Integer, Item> callback) {
        Call<SearchResponse> call = dataService.searchImages(
                application.getApplicationContext().getString(R.string.gogole_cs_api_key),
                application.getApplicationContext().getString(R.string.gogole_cs_cx),
                query,
                params.key);

        call.enqueue(new Callback<SearchResponse>() {
            @Override
            public void onResponse(Call<SearchResponse> call, Response<SearchResponse> response) {
                SearchResponse csResponse=response.body();
                ArrayList<Item> items = new ArrayList<>();


                if(csResponse != null && csResponse.getItems() != null) {

                    items = (ArrayList<Item>) csResponse.getItems();

                    Log.i("startIdx",":"+(params.key+10));

                    callback.onResult(items,(params.key+10));
                }
            }

            @Override
            public void onFailure(Call<SearchResponse> call, Throwable t) {

            }
        });
    }

}






