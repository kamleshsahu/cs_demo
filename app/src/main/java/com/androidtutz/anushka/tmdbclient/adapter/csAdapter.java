package com.androidtutz.anushka.tmdbclient.adapter;

import android.arch.paging.PagedListAdapter;
import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.androidtutz.anushka.tmdbclient.R;
import com.androidtutz.anushka.tmdbclient.databinding.MovieListItemBinding;
import com.androidtutz.anushka.tmdbclient.model.Item;


import com.androidtutz.anushka.tmdbclient.view.MovieActivity;
import com.bumptech.glide.Glide;

/**
 * Created by K. A. ANUSHKA MADUSANKA on 7/10/2018.
 */
public class csAdapter extends PagedListAdapter<Item, csAdapter.MovieViewHolder> {

    private Context context;

    public csAdapter(Context context) {
        super(Item.CALLBACK);
        this.context = context;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         MovieListItemBinding movieListItemBinding= DataBindingUtil.inflate(LayoutInflater.from(parent.getContext())
         ,R.layout.movie_list_item,parent,false);

        return new MovieViewHolder(movieListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

        Item movie=getItem(position);
        String imagePath;
        if(movie!=null && movie.getPagemap()!=null && movie.getPagemap().getCse_thumbnail()!=null && movie.getPagemap().getCse_thumbnail().size()>0) {
            imagePath = movie.getPagemap().getCse_thumbnail().get(0).getSrc();
            //movie.setPosterPath(imagePath);
            Glide.with(context)
                    .load(imagePath)
                    .placeholder(R.drawable.loading)
                    .into(holder.movieListItemBinding.ivMovie);
        }
        holder.movieListItemBinding.setMovie(movie);

    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
     private MovieListItemBinding movieListItemBinding;


        public MovieViewHolder(@NonNull MovieListItemBinding movieListItemBinding) {
            super(movieListItemBinding.getRoot());
            this.movieListItemBinding=movieListItemBinding;

            movieListItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int position=getAdapterPosition();

                    if(position!=RecyclerView.NO_POSITION) {
//
                        Item selctedMovie = getItem(position);

                        Intent intent=new Intent(context, MovieActivity.class);
                        intent.putExtra("movie",selctedMovie);
                        context.startActivity(intent);

                    }


                }
            });


        }
    }
}
