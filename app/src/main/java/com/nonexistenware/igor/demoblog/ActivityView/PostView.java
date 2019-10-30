package com.nonexistenware.igor.demoblog.ActivityView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.nonexistenware.igor.demoblog.Adapter.RecyclerViewCommnetAdapter;
import com.nonexistenware.igor.demoblog.Common.Common;
import com.nonexistenware.igor.demoblog.R;
import com.squareup.picasso.Picasso;

import java.net.CookieManager;
import java.util.ArrayList;

public class PostView extends AppCompatActivity {

    public ImageView postImage, postAuthorImage, authorOfCommentImage;
    public TextView postViewTitle, postAuthorName, postDateView, postDescription, postLikeCount;

    public ImageView author1, author2;
    public TextView comment1;
    public ImageView comment2;

    private ArrayList<String> mPhoto = new ArrayList<>();
    private ArrayList<String> mComment = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_view);

        postImage = findViewById(R.id.blog_image_view_blog);
        postAuthorImage = findViewById(R.id.blog_author_image_post_view);
        postViewTitle = findViewById(R.id.blog_post_title_view);
        postAuthorName = findViewById(R.id.blog_post_author_name);
//        postDateView = findViewById(R.id.blog_post_date_view);
        postDescription = findViewById(R.id.blog_post_description_view);
        postLikeCount = findViewById(R.id.blog_post_like_view_count);
        authorOfCommentImage = findViewById(R.id.author_of_comment_image);

        author1 = findViewById(R.id.author_comment_photo);
        author2 = findViewById(R.id.author_comment_photo2);
        comment1 = findViewById(R.id.comment_text_under_photo);
        comment2 = findViewById(R.id.emoji_comment_image);

        Picasso.with(this)
                .load("https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500")
                .into(author1);

        Picasso.with(this)
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYGuJ-tUe-9c1ShYQZDx9_ZnHPqyb3ENwZ2g5IpFMShJoVJ2XaaQ&s")
                .into(author2);

        Picasso.with(this)
                .load("https://images.emojiterra.com/twitter/v12/512px/1f44f.png")
                .into(comment2);

        Picasso.with(this)
                .load(Common.select_blog_item.getBlogImage())
                .into(postImage);

        Picasso.with(this)
                .load(Common.select_blog_item.getAuthorImage())
                .into(postAuthorImage);

        Picasso.with(this)
                .load(Common.select_blog_item.getAuthorCommentImage())
                .into(authorOfCommentImage);

        postAuthorName.setText(Common.select_blog_item.authorPostCount);
        postViewTitle.setText(Common.select_blog_item.postTitle);
//        postDateView.setText(Common.select_blog_item.detailedDate);
        postLikeCount.setText(Common.select_blog_item.likeCount);
        postDescription.setText(Common.select_blog_item.postDescription);
    }

    private void initialImageBitmaps() {
        mPhoto.add("https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500");
        mComment.add("Lets Rock!!!!");

//        initialRecyclerView();
    }

//    private void initialRecyclerView() {
//        RecyclerView recyclerView = findViewById(R.id.recycler_comment);
//        RecyclerViewCommnetAdapter adapter = new RecyclerViewCommnetAdapter(this, mPhoto, mComment);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//    }
}
