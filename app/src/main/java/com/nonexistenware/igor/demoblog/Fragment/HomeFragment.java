package com.nonexistenware.igor.demoblog.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.nonexistenware.igor.demoblog.ActivityView.PostView;
import com.nonexistenware.igor.demoblog.Common.Common;
import com.nonexistenware.igor.demoblog.Interface.ItemClickListener;
import com.nonexistenware.igor.demoblog.Model.BlogItem;
import com.nonexistenware.igor.demoblog.R;
import com.nonexistenware.igor.demoblog.ViewHolder.BlogWallViewHolder;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;


public class HomeFragment extends Fragment {

    FirebaseDatabase database;
    DatabaseReference mainBlogPage;
    Context context;
    List<BlogItem> blogItems;

    RecyclerView recyclerView;

    FirebaseRecyclerOptions<BlogItem> options;
    FirebaseRecyclerAdapter<BlogItem, BlogWallViewHolder> adapter;

    private static HomeFragment INSTANCE = null;

    public HomeFragment() {
        database = FirebaseDatabase.getInstance();
        mainBlogPage = database.getReference(Common.STR_POST_WALL);

        options = new FirebaseRecyclerOptions.Builder<BlogItem>()
                .setQuery(mainBlogPage, BlogItem.class)
                .build();

        adapter = new FirebaseRecyclerAdapter<BlogItem, BlogWallViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull final BlogWallViewHolder holder, int i, @NonNull final BlogItem model) {
                Picasso.with(getActivity())
                .load(model.getBlogImage())
                        .error(R.drawable.ic_error_outline_white_24dp)
                        .into(holder.blogIWallImage, new Callback() {
                            @Override
                            public void onSuccess() {

                            }

                            @Override
                            public void onError() {
                                Picasso.with(getActivity())
                                        .load(model.getBlogImage())
                                        .error(R.drawable.ic_error_outline_white_24dp)
                                        .into(holder.blogIWallImage, new Callback() {
                                            @Override
                                            public void onSuccess() {

                                            }

                                            @Override
                                            public void onError() {
                                                Log.e("ERROR", "Couldn't fetch image");
                                            }
                                        });
                            }
                        });

                holder.postTitle.setText(model.getPostTitle());
                holder.authorPostCount.setText(model.getAuthorPostCount());
                holder.likeCount.setText(model.getLikeCount());
                holder.postDate.setText(model.getPostDate());
                Picasso.with(getActivity())
                        .load(model.getAuthorImage())
                        .into(holder.authorImage, new Callback() {
                            @Override
                            public void onSuccess() {

                            }

                            @Override
                            public void onError() {

                            }
                        });

                holder.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onClick(View view, int position) {
                        Intent intent = new Intent(getActivity(), PostView.class);
                        Common.select_blog_item = model;
                        startActivity(intent);
                    }
                });

            }

            @NonNull
            @Override
            public BlogWallViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View itemView = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.layout_blog_item, parent, false);
                return new BlogWallViewHolder(itemView);
            }
        };
    }

    public static HomeFragment getInstance() {
        if (INSTANCE == null)
            INSTANCE = new HomeFragment();
        return INSTANCE;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recycler_fragment_home);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);

        setBlogHome();
        return view;
    }

    public void setBlogHome() {
        adapter.startListening();
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onStart() {
        super.onStart();
        if (adapter != null)
            adapter.startListening();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (adapter != null)
            adapter.startListening();
    }

    @Override
    public void onStop() {
        if (adapter != null)
            adapter.stopListening();
        super.onStop();
    }
}
