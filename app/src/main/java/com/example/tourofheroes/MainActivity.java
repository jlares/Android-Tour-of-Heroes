package com.example.tourofheroes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button heroesBtn = (Button) findViewById(R.id.heroes_btn);
    }

    /** Called when the user clicks the Send button */
    public void goTosHeroesActivity(View view) {
        Intent intent = new Intent(getApplicationContext(), HeroesActivity.class);
        startActivity(intent);
    }


}
