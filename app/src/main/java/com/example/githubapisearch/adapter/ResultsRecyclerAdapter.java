package com.example.githubapisearch.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.githubapisearch.R;
import com.example.githubapisearch.models.Items;
import com.example.githubapisearch.models.Owner;
import com.example.githubapisearch.repodetails.RepositoryDetails;
import com.example.githubapisearch.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.List;

public class ResultsRecyclerAdapter extends RecyclerView.Adapter<ResultsRecyclerAdapter.ViewHolder> {

    List<Items> arrayList ;
    Context context;
    List<Owner> ownerList;

    public ResultsRecyclerAdapter(List<Items> arrayList, Context context) {
        this.arrayList=arrayList;
        this.context=context;
    }

    @NonNull
    @Override
    public ResultsRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.results_recyclerview_item,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder ;
    }

    @Override
    public void onBindViewHolder(@NonNull ResultsRecyclerAdapter.ViewHolder holder, final int position) {
        final Items items = arrayList.get(position);
        final Owner owner = items.getOwner();

        holder.user.setText("User :" + owner.getLogin());
        holder.repositoreName.setText("repoName :" + items.getName());
        holder.watchers.setText("watchers :" + String.valueOf(items.getWatchersCount()));
        holder.issue.setText(String.valueOf("issues : "+items.getOpenIssuesCount()));
        holder.forks.setText(String.valueOf("forks :"+items.getForksCount()));
        Glide.with(context).load(owner.getAvatarUrl()).into(holder.imageView);

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RepositoryDetails.class);
              intent.putExtra("owner",owner);
              intent.putExtra("items",items);

                context.startActivity(intent);
            }
        });
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, UserDetails.class);
                intent.putExtra("owner",owner);
                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return arrayList == null ? 0 :arrayList.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView user,repositoreName,watchers,forks,issue;
        RelativeLayout relativeLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            relativeLayout=itemView.findViewById(R.id.results_relative_layout);
            forks=itemView.findViewById(R.id.resutls_forks);
            issue=itemView.findViewById(R.id.results_issue);
            imageView=itemView.findViewById(R.id.results_imageview);
            user=itemView.findViewById(R.id.results_user);
            repositoreName=itemView.findViewById(R.id.results_repo_name);
            watchers=itemView.findViewById(R.id.results_watchers);

        }
    }
}
