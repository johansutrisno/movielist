package org.d3ifcool.movielist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private List<RetroMovie> dataList;
    private Context context;

    public CustomAdapter(Context context, List<RetroMovie> dataList) {
        this.dataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_row, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.textViewTitle.setText(dataList.get(position).getTitle());
        holder.textViewGenre.setText(dataList.get(position).getGenre());

        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(dataList.get(position).getThumbnailUrl())
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(holder.movieImage);
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        TextView textViewTitle;
        TextView textViewGenre;
        private ImageView movieImage;

        public CustomViewHolder(View itemView) {
            super(itemView);
            this.mView = itemView;

            textViewTitle = mView.findViewById(R.id.title);
            textViewGenre = mView.findViewById(R.id.genre);
            movieImage = mView.findViewById(R.id.coverImage);
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
