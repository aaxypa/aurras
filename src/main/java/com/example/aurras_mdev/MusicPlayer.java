package com.example.aurras_mdev;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MusicPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(NavListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_Scrollable, new FragmentHome()).commit();
    }

    @Override
    public void onBackPressed(){

    }

    private BottomNavigationView.OnNavigationItemSelectedListener NavListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment SelectedFragment = null;

                    switch (item.getItemId()){
                        case(R.id.nav_home):
                            SelectedFragment = new FragmentHome();
                            break;
                        case(R.id.nav_community):
                            SelectedFragment = new FragmentCommunity();
                            break;
                        case(R.id.nav_search):
                            SelectedFragment = new FragmentSearch();
                            break;
                        case(R.id.nav_chat):
                            SelectedFragment = new FragmentChat();
                            break;
                        case(R.id.nav_library):
                            SelectedFragment = new FragmentLibrary();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.Fragment_Scrollable, SelectedFragment).commit();
                    return true;
                }
            };

}