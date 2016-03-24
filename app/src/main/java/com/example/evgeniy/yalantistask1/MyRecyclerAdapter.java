package com.example.evgeniy.yalantistask1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Evgeniy
 */
public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {

    private String[] mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public ViewHolder(View v) {
            super(v);
            imageView = (ImageView) v.findViewById(R.id.imageViewRecycle);
        }
    }

    public MyRecyclerAdapter (String[] myDataset){
        mDataset = myDataset;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);


        ViewHolder vh = new ViewHolder(v);
        return  vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Picasso.with(holder.imageView.getContext()).load(mDataset[position]).resize(300, 300).into(holder.imageView);



    }


    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
