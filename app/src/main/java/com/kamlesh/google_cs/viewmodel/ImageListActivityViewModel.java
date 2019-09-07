package com.kamlesh.google_cs.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.paging.LivePagedListBuilder;
import android.arch.paging.PagedList;
import android.support.annotation.NonNull;

import com.kamlesh.google_cs.model.customsearch_model.Item;
import com.kamlesh.google_cs.model.csDataSource;
import com.kamlesh.google_cs.model.csDataSourceFactory;

import com.kamlesh.google_cs.service.csDataService;
import com.kamlesh.google_cs.service.csRetrofitInstance;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ImageListActivityViewModel extends AndroidViewModel {


    LiveData<csDataSource> csDataSourceLiveData;
    private Executor executor;
    private LiveData<PagedList<Item>> itemsPagedList;
    csDataSourceFactory factory;
    csDataService csDataService;
    PagedList.Config config;
    Application application;
    public ImageListActivityViewModel(@NonNull Application application) {
        super(application);


        this.application=application;
        csDataService = csRetrofitInstance.getService();
        config = (new PagedList.Config.Builder())
                .setEnablePlaceholders(true)
                .setInitialLoadSizeHint(10)
                .setPageSize(10)
                .setPrefetchDistance(2)
                .build();
        executor= Executors.newFixedThreadPool(5);
    }


    public void setQuery(String query){
        factory = new csDataSourceFactory(csDataService,application,query);
        csDataSourceLiveData=factory.getMutableLiveData();

        itemsPagedList = (new LivePagedListBuilder<Long, Item>(factory,config))
                .setFetchExecutor(executor)
                .build();

    }

    public LiveData<PagedList<Item>> getMoviesPagedList() {
        return itemsPagedList;
    }

}
