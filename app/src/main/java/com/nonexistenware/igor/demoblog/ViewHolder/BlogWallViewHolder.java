package com.nonexistenware.igor.demoblog.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nonexistenware.igor.demoblog.Interface.ItemClickListener;
import com.nonexistenware.igor.demoblog.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class BlogWallViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ImageView blogIWallImage;
    public CircleImageView authorImage;
    public TextView postTitle, authorPostCount, likeCount, postDate;
    ItemClickListener itemClickListener;

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }


    public BlogWallViewHolder(@NonNull View itemView) {
        super(itemView);
        blogIWallImage = itemView.findViewById(R.id.blog_main_image);
//        authorImage = itemView.findViewById(R.id.author_image);
        authorImage = itemView.findViewById(R.id.author_image);
        postTitle = itemView.findViewById(R.id.post_title);
        authorPostCount = itemView.findViewById(R.id.author_post_view_count);
        likeCount = itemView.findViewById(R.id.like_count);
        postDate = itemView.findViewById(R.id.post_date);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view, getAdapterPosition());
    }
}
