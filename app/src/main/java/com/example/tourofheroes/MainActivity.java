package com.example.tourofheroes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button heroesBtn = (Button) findViewById(R.id.heroes_btn);
    }

    /** Called when the user clicks the Send button */
    public void launchHeroesActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), HeroActivity.class);
        startActivity(intent);
    }


}
