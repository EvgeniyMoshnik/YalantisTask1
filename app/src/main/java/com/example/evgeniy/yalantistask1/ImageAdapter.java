package com.example.evgeniy.yalantistask1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Evgeniy
 * Make adapter for RecyclerView
 */
public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {

    private Context mContext;
    private String[] mUrlArray;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImageView;

        public ViewHolder(View v) {
            super(v);
            mImageView = (ImageView) v.findViewById(R.id.imageViewRecycle);
        }
    }

    public ImageAdapter(Context context, String[] urlArray) {
        mContext = context;
        mUrlArray = urlArray;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Picasso.with(mContext).load(mUrlArray[position]).error(R.drawable.no_photo_available).into(holder.mImageView);
    }


    @Override
    public int getItemCount() {
        return mUrlArray.length;
    }
}
