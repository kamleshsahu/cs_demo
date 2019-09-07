package com.androidtutz.anushka.tmdbclient.service;

import com.androidtutz.anushka.tmdbclient.model.SearchResponse;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;


public interface csDataService {



    @Headers({"Content-Type: application/json",
            "cache-control: no-cache"})
    @GET("v1")
    Call<SearchResponse> searchImages(@Query("key") String apiKey,
                                      @Query("cx") String cx,
                                      @Query("q") String query,
                                      @Query("start") int idx);


}
