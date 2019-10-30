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
                .load("https://lh3.googleusercontent.com/aoFWWdw3na1JtCo0Mq6qGx2OPL5f2UmrtWBNyuNAe-eyPu6CJ8DXo6J4r1zlKaVnnQmxrRUa0hc_ezjQxxIkQRCAHHA0_elxNI2AhHzIV-NimLCImXBejc3ydeHDj72KcTMMChCy3t-AXUDNTOt6OymKLGsPzHmagU_up4q_TOIrhBZ4sbZmj2x9Vy4qbFTKUlROH7kEcVoA3M7YdLuWzdZdD-0hAXmC0AD2PoEDHn2KMmZZ49bSEZA3P3Le043pLULn3vSmynAehgcadKVN9D36UzZDFb0nX6rCESXEnRgHBYaMDLTuvse6CwJlVEYZZKrAnebtkLr1Zzgm11kBtupHKZMaFywBfiFUUGunZ4pNWlQiV1BYPvK7xKk4fp_9DFsV0ZWfnP-bFbKaSZek1o4eLAD-wC1WBHMUp30_u0Vf2hEuffh4e_vSM1Xhxfask37pLGtFjRQPYovfuwHyKUF-N1HK432ZjdKeVttE-w0CKs5pm25wmvFGV3ZfANtMCkJMUidcfi-RkfIVHtKej97WsdGoQ0GQwk8P3DQrqclFNmLVvaEnQc0lzH6b_F9McRtSyeQH6SnwS7n8jHODu9Ss3lp9bWvRWbTnkHW4ZLMK2PQIvf2ZG9qgyOURlya6VGe1rbTHtYJVcEk8pq7YE2RLJkgYluUQ9q8iAiWab6fojx12FIDvlA=s640-no")
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
