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

import com.androidtutz.anushka.tmdbclient.databinding.CsListItemBinding;
import com.androidtutz.anushka.tmdbclient.model.customsearch_model.Item;


import com.androidtutz.anushka.tmdbclient.view.ImageActivity;
import com.bumptech.glide.Glide;



public class CSItemsAdapter extends PagedListAdapter<Item, CSItemsAdapter.MovieViewHolder> {

    private Context context;

    public CSItemsAdapter(Context context) {
        super(Item.CALLBACK);
        this.context = context;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         CsListItemBinding csListItemBinding= DataBindingUtil.inflate(LayoutInflater.from(parent.getContext())
         ,R.layout.cs_list_item,parent,false);

        return new MovieViewHolder(csListItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {

        Item item=getItem(position);
        String imagePath;
        if(item!=null && item.getPagemap()!=null && item.getPagemap().getCse_thumbnail()!=null && item.getPagemap().getCse_thumbnail().size()>0) {
            imagePath = item.getPagemap().getCse_thumbnail().get(0).getSrc();
            Glide.with(context)
                    .load(imagePath)
                    .placeholder(R.drawable.loading)
                    .into(holder.csListItemBinding.ivMovie);
        }
        holder.csListItemBinding.setMovie(item);

    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
     private CsListItemBinding csListItemBinding;


        public MovieViewHolder(@NonNull CsListItemBinding csListItemBinding) {
            super(csListItemBinding.getRoot());
            this.csListItemBinding=csListItemBinding;

            csListItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int position=getAdapterPosition();

                    if(position!=RecyclerView.NO_POSITION) {
//
                        Item selctedMovie = getItem(position);

                        Intent intent=new Intent(context, ImageActivity.class);
                        intent.putExtra("item",selctedMovie);
                        context.startActivity(intent);

                    }


                }
            });


        }
    }
}