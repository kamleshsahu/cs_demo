package com.kamlesh.google_cs.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class csRetrofitInstance {

    private static Retrofit retrofit = null;
    private static String BASE_URL="https://www.googleapis.com/customsearch/";

    public static csDataService getService(){


        if(retrofit==null){

               retrofit=new Retrofit
                       .Builder()
                       .baseUrl(BASE_URL)
                       .addConverterFactory(GsonConverterFactory.create())
                       .build();

        }

        return retrofit.create(csDataService.class);

    }

}
