package com.example.recyclerviewlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.viewHolder>{
    private Context context;
    private String[] arr={"Rose" , "Lotus","Tulip","Lilly","Jasmine"};

    public ListAdapter(Context context){

        this.context=context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview= LayoutInflater.from(context).inflate(R.layout.list_of_item_adapter,parent,false);
        return new viewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.textView.setText(arr[position]);


    }

    @Override
    public int getItemCount() {
        return arr.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.flowerlist);
        }
    }
}
