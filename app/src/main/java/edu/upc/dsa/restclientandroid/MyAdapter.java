package edu.upc.dsa.restclientandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    List<Track> tracks;
    Context context;

    public MyAdapter(Context context, List<Track> trackList){
        tracks=trackList;
        this.context=context;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        holder.bindData(tracks.get(position));
    }

    @Override
    public int getItemCount() {
        return tracks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title,description;
        ImageView image;
        ConstraintLayout mainlayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.firstline);
            description = itemView.findViewById(R.id.secondline);
            image = itemView.findViewById(R.id.imageView);
            mainlayout = itemView.findViewById(R.id.ConstraintLayout);
        }

        public void bindData(Track track) {
            title.setText(track.getTitle());
            description.setText(track.getSinger());
        }
    }
}
