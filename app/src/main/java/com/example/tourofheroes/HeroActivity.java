package com.example.tourofheroes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HeroActivity extends AppCompatActivity {
    public static final String HERO_NAME_EXTRA = "com.example.tourofheroes.Hero name";
    public static final String HERO_POWER_LVL_EXTRA = "com.example.tourofheroes.Hero power level";
    public static final String HERO_EMPLOYER_EXTRA = "com.example.tourofheroes.Hero employer";
    public static final String HERO_CITY_EXTRA = "com.example.tourofheroes.Hero city";
    public static final String HERO_ID_EXTRA = "com.example.tourofheroes.Hero id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);
    }
}
