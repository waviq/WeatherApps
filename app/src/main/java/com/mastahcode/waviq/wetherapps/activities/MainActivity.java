package com.mastahcode.waviq.wetherapps.activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mastahcode.waviq.wetherapps.R;
import com.mastahcode.waviq.wetherapps.fragments.WetherFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //via static method instance
        FragmentManager fragmentManager = getSupportFragmentManager();
        WetherFragment wetherFragment = (WetherFragment)fragmentManager.findFragmentById(R.id.frame_main_activity);

        if (wetherFragment == null){
            wetherFragment = WetherFragment.newInstance("bebas","free");
            fragmentManager.beginTransaction().add(R.id.frame_main_activity,wetherFragment).commit();
        }




        //via constructor
        /*FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.frame_main_activity);

        if (fragment == null){
            fragment = new WetherFragment();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.add(R.id.frame_main_activity,fragment);
            transaction.commit();
        }*/
    }
}
