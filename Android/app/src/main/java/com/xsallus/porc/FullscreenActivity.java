package com.xsallus.porc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Bundle;
import android.widget.ImageView;

public class FullscreenActivity extends AppCompatActivity {

    Integer t;

    AnimationDrawable animation;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        t = 2500;
        setContentView(R.layout.activity_fullscreen);

        image = findViewById(R.id.animation);
        image.setBackgroundResource(R.drawable.anim);

        animation = (AnimationDrawable) image.getBackground();
        animation.start();

        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(FullscreenActivity.this, GameScreen.class);
                startActivity(intent);
                finish();
            }
        }, t);
    }
}