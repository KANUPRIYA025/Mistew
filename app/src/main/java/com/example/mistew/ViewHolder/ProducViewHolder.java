package com.example.mistew.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mistew.Interface.ItemClickListner;
import com.example.mistew.R;

public class ProducViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView textProductName, txtProductdescription;
    public ImageView imageView;
    public ItemClickListner listner;

    public ProducViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.product_image);
        textProductName = (TextView) itemView.findViewById(R.id.product_name);
        txtProductdescription = (TextView) itemView.findViewById(R.id.product_description);
    }
    public void setItemClickListner(ItemClickListner listner){
        this.listner = listner;
    }

    @Override
    public void onClick(View v) {
      listner.onClick(v,getBindingAdapterPosition(),false);
    }
}
