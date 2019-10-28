package com.nonexistenware.igor.demoblog.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.nonexistenware.igor.demoblog.R;
import com.squareup.picasso.Picasso;


public class UserFragment extends Fragment {

    private static UserFragment INSTANCE = null;

    public ImageView user_image, blog1, blog2, blog3, blog4, blog5, blog6;



    public UserFragment() {

    }

    public static UserFragment getInstance() {
        if (INSTANCE == null)
            INSTANCE = new UserFragment();
        return INSTANCE;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_user, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        user_image = view.findViewById(R.id.user_image);
        blog1 = view.findViewById(R.id.blog1);
        blog2 = view.findViewById(R.id.blog2);
        blog3 = view.findViewById(R.id.blog3);
        blog4 = view.findViewById(R.id.blog4);
        blog5 = view.findViewById(R.id.blog5);
        blog6 = view.findViewById(R.id.blog6);

        Picasso.with(getActivity())
                .load("https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1000&q=80")
                .into(user_image);


        Picasso.with(getActivity())
                .load("https://images.unsplash.com/photo-1500530855697-b586d89ba3ee?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60")
                .into(blog1);

        Picasso.with(getActivity())
                .load("https://images.unsplash.com/photo-1476900543704-4312b78632f8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60")
                .into(blog2);

        Picasso.with(getActivity())
                .load("https://images.unsplash.com/photo-1493020258366-be3ead1b3027?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60")
                .into(blog3);

        Picasso.with(getActivity())
                .load("https://images.unsplash.com/photo-1519501025264-65ba15a82390?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60")
                .into(blog4);

        Picasso.with(getActivity())
                .load("https://images.unsplash.com/photo-1508669232496-137b159c1cdb?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60")
                .into(blog5);

        Picasso.with(getActivity())
                .load("https://images.unsplash.com/photo-1502005229762-cf1b2da7c5d6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60")
                .into(blog6);

    }
}
