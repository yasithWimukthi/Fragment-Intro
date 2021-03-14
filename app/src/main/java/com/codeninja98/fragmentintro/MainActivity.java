package com.codeninja98.fragmentintro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create fragment programmatically
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment;

        if(fragmentManager.findFragmentById(R.id.container)==null){
            fragment = new MainFragment();
            fragmentManager.beginTransaction().add(R.id.container,fragment).commit();
        }
    }
}