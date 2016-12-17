package com.example.tourofheroes;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HeroDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_detail);

        createAndAddFragment();
    }

    private void createAndAddFragment() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Create new HeroDetailFragment
        HeroDetailFragment heroViewFragment = new HeroDetailFragment();
        // Add the new HeroDetailFragment to HeroDetailActivity;
        fragmentTransaction.add(R.id.hero_detail, heroViewFragment, "HERO_VIEW_FRAGMENT");

        fragmentTransaction.commit();
    }
}
