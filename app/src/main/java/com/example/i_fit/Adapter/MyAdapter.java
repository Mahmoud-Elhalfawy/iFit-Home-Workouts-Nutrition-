package com.example.i_fit.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.i_fit.Data.DataHandler;
import com.example.i_fit.Model.ListItem;
import com.example.i_fit.R;
import com.example.i_fit.Util.Util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
private Context context;
private DataHandler dataHandler;
private List<ListItem> listItems;
private HashMap<String,ListItem> h;
    public MyAdapter(Context context, List lisItem){
listItems=lisItem;

this.context=context;
}
                 @NonNull
                 @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view= LayoutInflater.from(parent.getContext())
             .inflate(R.layout.list_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        ListItem item=listItems.get(position);
        holder.name.setText("Name: "+item.getName());
        holder.artist.setText("Artist: "+item.getArtist());
        holder.layout.setBackgroundResource(R.drawable.hydrogen);

        if(h.containsKey(item.getName()))
            holder.layout.setBackgroundResource(R.drawable.youtube);

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView name;
        public TextView artist;
        public LinearLayout layout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        name=itemView.findViewById(R.id.nameID);
        artist=itemView.findViewById(R.id.artistID);
        layout=itemView.findViewById(R.id.layout);
        itemView.setOnClickListener(this);
        dataHandler=new DataHandler(context,new Util());

        h=dataHandler.getAllSongs();
            for (Map.Entry<String, ListItem> entry : h.entrySet()) {
                Log.d("dodo: ", entry.getValue().getName());
            }
            Log.d("dodo", String.valueOf(h.size()));



        }

        @Override
        public void onClick(View v) {
            int pos=getAdapterPosition();
            ListItem listItem=listItems.get(pos);
           if(!h.containsKey(listItem.getName())) {
               dataHandler.addSong(listItem);
               h.put(listItem.getName(),listItem);
                layout.setBackgroundResource(R.drawable.youtube);
           }else{
               dataHandler.deleteSong(listItem);
               h.remove(listItem.getName());
               layout.setBackgroundResource(R.drawable.hydrogen);
           }

        }
    }
}
