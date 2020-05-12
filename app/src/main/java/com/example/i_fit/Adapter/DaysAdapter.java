package com.example.i_fit.Adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.example.i_fit.Activities.MainMenuActivity;
import com.example.i_fit.Activities.NutritionActivity;
import com.example.i_fit.Activities.TabataWorkoutActivity;
import com.example.i_fit.Data.DataHandler;
import com.example.i_fit.Model.DaysItem;
import com.example.i_fit.Model.ListItem;
import com.example.i_fit.R;
import com.example.i_fit.Util.Util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DaysAdapter extends RecyclerView.Adapter<DaysAdapter.ViewHolder> {
    private Context context;
    private List<DaysItem> listItems;
    public DaysAdapter(Context context, List lisItem){
        listItems=lisItem;

        this.context=context;
    }
    @NonNull
    @Override
    public DaysAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.days_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DaysAdapter.ViewHolder holder, int position) {
        DaysItem item=listItems.get(position);
        holder.name.setText(item.getName());
        holder.layout.setBackgroundResource(item.getImage());

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


        }

        @Override
        public void onClick(View v) {
            Intent intent=new Intent(context, TabataWorkoutActivity.class);
            int pos=getAdapterPosition();
            DaysItem listItem=listItems.get(pos);
            intent.putExtra("day",listItem.getN());
            context.startActivity(intent);


        }
    }
}
