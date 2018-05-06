package com.example.centurylinkcodingchallenge.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.centurylinkcodingchallenge.R;
import com.example.centurylinkcodingchallenge.model.RvItemPOJO;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<RvItemPOJO> rvData;
    Context context;

    private static final String TAG = "MyAdapter";

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, itemId, availability;
        ImageView itemImage, ivAvailability;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tv_title);
            itemImage = itemView.findViewById(R.id.iv_item_image);
            itemId = itemView.findViewById(R.id.tv_item_id);
            availability = itemView.findViewById(R.id.tv_availabality);
            ivAvailability = itemView.findViewById(R.id.iv_availability);
        }
    }

    public MyAdapter(List<RvItemPOJO> rvData, Context context) {
        this.rvData = rvData;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        RvItemPOJO item = rvData.get(position);
        //holder.title.setText(item.getTitle());
        holder.itemId.setText(item.getId());
        holder.availability.setText(item.getAvailability());
        //holder.itemImage.setImageDrawable(R.drawable.load);
    }

    @Override
    public int getItemCount() {
        if(rvData == null)
            return 0;
        else
            return rvData.size();
    }

}
