package com.example.restraunts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestrauntAdapter extends RecyclerView.Adapter<RestrauntAdapter.ViewHolder> {

    private ArrayList<Restraunt> restrauntsArrayList;
    public RestrauntAdapter (ArrayList<Restraunt> restrauntsArrayList){
        this.restrauntsArrayList = restrauntsArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_restraunt_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_restrauntName.setText(restrauntsArrayList.get(position).getRestrauntName());
        holder.tv_restrauntLocation.setText(restrauntsArrayList.get(position).getRestrauntLocation());
        holder.tv_restrauntDescription.setText(restrauntsArrayList.get(position).getRestrauntDescription());
        holder.tv_restrauntContact.setText(restrauntsArrayList.get(position).getRestrauntContact());
    }

    @Override
    public int getItemCount() {
        return restrauntsArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv_restrauntName, tv_restrauntLocation, tv_restrauntDescription, tv_restrauntContact;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_restrauntName = itemView.findViewById(R.id.tv_restrauntName);
            tv_restrauntContact = itemView.findViewById(R.id.tv_restrauntContact);
            tv_restrauntDescription = itemView.findViewById(R.id.tv_restrauntDescription);
            tv_restrauntLocation = itemView.findViewById(R.id.tv_restrauntLocation);
        }
    }
}
