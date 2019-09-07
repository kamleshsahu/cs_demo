package com.androidtutz.anushka.tmdbclient.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;
import android.support.annotation.NonNull;

import com.androidtutz.anushka.tmdbclient.model.Item;
import com.androidtutz.anushka.tmdbclient.model.csDataSource;
import com.androidtutz.anushka.tmdbclient.model.csDataSourceFactory;
import com.androidtutz.anushka.tmdbclient.old_model.Movie;
import com.androidtutz.anushka.tmdbclient.old_model.MovieDataSource;
import com.androidtutz.anushka.tmdbclient.old_model.MovieDataSourceFactory;
import com.androidtutz.anushka.tmdbclient.old_model.MovieRepository;
import com.androidtutz.anushka.tmdbclient.service.MovieDataService;
import com.androidtutz.anushka.tmdbclient.service.RetrofitInstance;
import com.androidtutz.anushka.tmdbclient.service.csDataService;
import com.androidtutz.anushka.tmdbclient.service.csRetrofitInstance;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class csMainActivityViewModel extends AndroidViewModel {


    LiveData<csDataSource> movieDataSourceLiveData;
    private Executor executor;
    private LiveData<PagedList<Item>> moviesPagedList;
    csDataSourceFactory factory;
    csDataService movieDataService;
    PagedList.Config config;
    Application application;
    public csMainActivityViewModel(@NonNull Application application) {
        super(application);


        this.application=application;
        movieDataService = csRetrofitInstance.getService();
        config = (new PagedList.Config.Builder())
                .setEnablePlaceholders(true)
                .setInitialLoadSizeHint(10)
                .setPageSize(10)
                .setPrefetchDistance(2)
                .build();
        executor= Executors.newFixedThreadPool(5);
    }


    public void setQuery(String query){
        factory = new csDataSourceFactory(movieDataService,application,query);
        movieDataSourceLiveData=factory.getMutableLiveData();

        moviesPagedList = (new LivePagedListBuilder<Long, Item>(factory,config))
                .setFetchExecutor(executor)
                .build();

    }

    public LiveData<PagedList<Item>> getMoviesPagedList() {
        return moviesPagedList;
    }

}
