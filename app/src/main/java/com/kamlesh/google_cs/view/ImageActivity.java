package com.kamlesh.google_cs.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.androidtutz.anushka.tmdbclient.R;

import com.androidtutz.anushka.tmdbclient.databinding.ActivityItemBinding;
import com.kamlesh.google_cs.model.customsearch_model.Item;
import com.bumptech.glide.Glide;


public class ImageActivity extends AppCompatActivity {

    private Item item;
    private ActivityItemBinding activityMovieBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        activityMovieBinding= DataBindingUtil.setContentView(this,R.layout.activity_item);

        Intent intent = getIntent();

        if (intent.hasExtra("item")) {

            item = getIntent().getParcelableExtra("item");
            activityMovieBinding.setMovie(item);
            getSupportActionBar().setTitle(item.getTitle());

            if(item.getPagemap()!=null && item.getPagemap().getCse_image()!=null && item.getPagemap().getCse_image().size()>0)
            Glide.with(getApplicationContext())
                    .load(item.getPagemap().getCse_image().get(0).getSrc())
                    .placeholder(R.drawable.loading)
                    .into(activityMovieBinding.ivMovieLarge);

        }

    }


}