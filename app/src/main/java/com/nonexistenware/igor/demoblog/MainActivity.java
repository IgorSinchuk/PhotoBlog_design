package com.nonexistenware.igor.demoblog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.nonexistenware.igor.demoblog.Adapter.FragmentAdapter;
import com.nonexistenware.igor.demoblog.Fragment.HomeFragment;
import com.nonexistenware.igor.demoblog.Fragment.NotificationFragment;
import com.nonexistenware.igor.demoblog.Fragment.UserFragment;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        viewPager = findViewById(R.id.viewPager);
//        FragmentAdapter adapter = new FragmentAdapter(getSupportFragmentManager(), this);
//        viewPager.setAdapter(adapter);

        BottomNavigationView navigationView = findViewById(R.id.bottom_nav_bar);


        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if (id == R.id.blog_home) {
                    final HomeFragment homeFragment = new HomeFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame, homeFragment);
                    fragmentTransaction.commit();

                }
                if (id == R.id.blog_user) {
                    final UserFragment userFragment = new UserFragment();
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.frame, userFragment);
                    fragmentTransaction.commit();
                }
//                if (id == R.id.blog_notification) {
//                    final NotificationFragment notificationFragment = new NotificationFragment();
//                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                    fragmentTransaction.replace(R.id.frame, notificationFragment);
//                    fragmentTransaction.commit();
//                }
                return true;
            }
        });
        navigationView.setSelectedItemId(R.id.blog_home);

    }
}
