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
import com.example.i_fit.Model.Workout;
import com.example.i_fit.R;
import com.example.i_fit.Util.Util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Handler;

public class DescriptionAdapter extends RecyclerView.Adapter<DescriptionAdapter.ViewHolder> {
    private Context context;
    private DataHandler dataHandler;
    private List<Workout> listItems;
    public DescriptionAdapter(Context context, List lisItem){
        listItems=lisItem;

        this.context=context;
    }
    @NonNull
    @Override
    public DescriptionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.description_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Workout item=listItems.get(position);
        Log.d("TAG", item.getName());
        holder.title.setText(item.getName());
        holder.description.setText("Description: "+item.getDescription());
        holder.gifImageView.setImageResource(item.getGif());

        holder.layout.setBackgroundResource(R.drawable.lizard);
        boolean isExpanded=item.isExpanded();
        holder.layout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
        if(isExpanded) {
            holder.layout1.setBackgroundResource(R.drawable.youtube);

        }else
            holder.layout1.setBackgroundResource(R.drawable.hydrogen);
            holder.click.setText("Click to Show");


    }


    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView title;
        public TextView description;
        public pl.droidsonroids.gif.GifImageView gifImageView;
        public LinearLayout layout;
        public LinearLayout layout1;
        public TextView click;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            click=itemView.findViewById(R.id.clickID);
            title=itemView.findViewById(R.id.titleID);
            description=itemView.findViewById(R.id.descriptionID);
            layout=itemView.findViewById(R.id.expandablelayout);
            layout1=itemView.findViewById(R.id.layout1);
            gifImageView=itemView.findViewById(R.id.gifV);
            itemView.setOnClickListener(this);




        }

        @Override
        public void onClick(View v) {
            int pos=getAdapterPosition();
            Workout listItem=listItems.get(pos);
            listItem.setExpanded(!listItem.isExpanded());
            notifyItemChanged(getAdapterPosition());

        }
    }
}
