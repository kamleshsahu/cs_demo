package com.androidtutz.anushka.tmdbclient.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.arch.paging.PagedList;
import android.content.res.Configuration;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.androidtutz.anushka.tmdbclient.R;

import com.androidtutz.anushka.tmdbclient.adapter.csAdapter;
import com.androidtutz.anushka.tmdbclient.databinding.ActivityImagelistBinding;

import com.androidtutz.anushka.tmdbclient.model.customsearch_model.Item;

import com.androidtutz.anushka.tmdbclient.viewmodel.ListViewActivityViewModel;

public class ImageListActivity extends AppCompatActivity {

    private PagedList<Item> movies;
    private RecyclerView recyclerView;
    private csAdapter movieAdapter;
    private SwipeRefreshLayout swipeRefreshLayout;
//    private MainActivityViewModel mainActivityViewModel;
    private ActivityImagelistBinding activityMainBinding;
    private ListViewActivityViewModel csmainActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagelist);

        getSupportActionBar().setTitle("TMDB Popular Movies Today");

        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_imagelist);


       csmainActivityViewModel= ViewModelProviders.of(this).get(ListViewActivityViewModel.class);

       if(getIntent().hasExtra("query")){
           new Handler()
           .postDelayed(new Runnable() {
               @Override
               public void run() {
                   //Write whatever to want to do after delay specified (1 sec)
                   csmainActivityViewModel.setQuery(getIntent().getStringExtra("query"));
                   getPopularMovies();
               }
           }, 1000);

       }





//        swipeRefreshLayout = activityMainBinding.swipeLayout;
//        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary);
//        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//            @Override
//            public void onRefresh() {
//
//                getPopularMovies();
//
//            }
//        });
    }

    public void getPopularMovies() {

//        mainActivityViewModel.getAllMovies().observe(this, new Observer<List<Item>>() {
//            @Override
//            public void onChanged(@Nullable List<Item> moviesFromLiveData) {
//                movies = (ArrayList<Item>) moviesFromLiveData;
//                showOnRecyclerView();
//            }
//        });

         csmainActivityViewModel.getMoviesPagedList().observe(this, new Observer<PagedList<Item>>() {
             @Override
             public void onChanged(@Nullable PagedList<Item> moviesFromLiveData) {
                  movies=moviesFromLiveData;
                  showOnRecyclerView();

             }
         });
    }

    private void showOnRecyclerView() {

        recyclerView = activityMainBinding.rvMovies;
        movieAdapter = new csAdapter(this);
        movieAdapter.submitList(movies);

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {

            recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        } else {


            recyclerView.setLayoutManager(new GridLayoutManager(this, 1));


        }

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(movieAdapter);
        movieAdapter.notifyDataSetChanged();

    }
}
