package com.kamlesh.google_cs.model;

import android.app.Application;
import android.arch.lifecycle.MutableLiveData;
import android.arch.paging.DataSource;

import com.kamlesh.google_cs.service.csDataService;

public class csDataSourceFactory extends DataSource.Factory {

    private csDataSource dataSource;
    private csDataService dataService;
    private Application application;
    private MutableLiveData<csDataSource> mutableLiveData;
    private String query;

    public csDataSourceFactory(csDataService dataService, Application application,String query) {
        this.dataService = dataService;
        this.application = application;
        this.query=query;
        mutableLiveData=new MutableLiveData<>();
    }

    @Override
    public DataSource create() {

        dataSource=new csDataSource(dataService,application,query);

        return dataSource;
    }


    public MutableLiveData<csDataSource> getMutableLiveData() {
        return mutableLiveData;
    }
}
