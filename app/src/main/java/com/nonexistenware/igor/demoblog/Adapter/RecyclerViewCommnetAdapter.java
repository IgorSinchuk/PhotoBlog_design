package com.nonexistenware.igor.demoblog.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nonexistenware.igor.demoblog.R;
import com.nonexistenware.igor.demoblog.ViewHolder.CommentViewHolder;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerViewCommnetAdapter extends RecyclerView.Adapter<CommentViewHolder> {

    private ArrayList<String> authorcommentImage = new ArrayList<>();
    private ArrayList<String> commentText = new ArrayList<>();
    private Context context;

    public RecyclerViewCommnetAdapter(Context context, ArrayList<String> authorcommentImage, ArrayList<String> commentText) {
        this.authorcommentImage = authorcommentImage;
        this.commentText = commentText;
        this.context = context;
    }


    @NonNull
    @Override
    public CommentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_item_layout, parent, false);
        CommentViewHolder holder = new CommentViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull CommentViewHolder holder, int position) {
        Picasso.with(context)
                .load(authorcommentImage.get(position))
                .into(holder.authorCommentPhoto);

        holder.commentTextUnderPhoto.setText(commentText.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
