package com.xsallus.porc.game.screens;

import android.graphics.drawable.AnimationDrawable;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.content.Intent;
import android.os.Handler;
import com.xsallus.porc.R;
import android.os.Bundle;
import android.view.View;

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

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE

                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

}