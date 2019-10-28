package com.nonexistenware.igor.demoblog.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nonexistenware.igor.demoblog.R;

public class CommentViewHolder extends RecyclerView.ViewHolder {

    public ImageView authorCommentPhoto;
    public TextView commentTextUnderPhoto;

    public CommentViewHolder(@NonNull View itemView) {
        super(itemView);
        authorCommentPhoto = itemView.findViewById(R.id.author_comment_photo);
        commentTextUnderPhoto = itemView.findViewById(R.id.comment_text_under_photo);

    }
}
