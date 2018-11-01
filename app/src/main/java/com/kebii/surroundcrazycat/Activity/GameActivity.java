package com.kebii.surroundcrazycat.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kebii.surroundcrazycat.View.GameView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GameView gameView = new GameView(this);
        setContentView(gameView);
        getSupportActionBar().hide();
    }
}
