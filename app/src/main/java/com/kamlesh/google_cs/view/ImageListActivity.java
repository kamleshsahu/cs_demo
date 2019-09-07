package com.kamlesh.google_cs.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.paging.PagedList;
import android.content.res.Configuration;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import com.kamlesh.google_cs.R;
import com.kamlesh.google_cs.adapter.CSItemsAdapter;
import com.kamlesh.google_cs.databinding.ActivityImagelistBinding;

import com.kamlesh.google_cs.model.customsearch_model.Item;

import com.kamlesh.google_cs.viewmodel.ImageListActivityViewModel;

public class ImageListActivity extends AppCompatActivity {

    private PagedList<Item> items;
    private RecyclerView recyclerView;
    private CSItemsAdapter csAdapter;
    private SwipeRefreshLayout swipeRefreshLayout;
    private ActivityImagelistBinding activityMainBinding;
    private ImageListActivityViewModel imgListActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagelist);

        getSupportActionBar().setTitle("CustomSearch List");

        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_imagelist);


       imgListActivityViewModel= ViewModelProviders.of(this).get(ImageListActivityViewModel.class);

       if(getIntent().hasExtra("query")){
          imgListActivityViewModel.setQuery(getIntent().getStringExtra("query"));
          get_CSdata();

       }





//        swipeRefreshLayout = activityMainBinding.swipeLayout;
//        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary);
//        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//
//                get_CSdata();
//
//            }
//        });
    }

    public void get_CSdata() {

         imgListActivityViewModel.getMoviesPagedList().observe(this, new Observer<PagedList<Item>>() {
             @Override
             public void onChanged(@Nullable PagedList<Item> itemsFromLiveData) {
                  items=itemsFromLiveData;
                  showOnRecyclerView();

             }
         });
    }

    private void showOnRecyclerView() {

        recyclerView = activityMainBinding.rvMovies;
        csAdapter = new CSItemsAdapter(this);
        csAdapter.submitList(items);

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {

            recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        } else {


            recyclerView.setLayoutManager(new GridLayoutManager(this, 1));


        }

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(csAdapter);
        csAdapter.notifyDataSetChanged();

    }
}
