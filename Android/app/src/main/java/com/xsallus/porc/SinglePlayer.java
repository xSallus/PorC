package com.xsallus.porc;

import com.xsallus.porc.listeners.MyOnLongClickListener;
import com.xsallus.porc.listeners.MyOnDragListener;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SinglePlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_player);

        findViewById(R.id.drop_card_container).setOnDragListener(new MyOnDragListener());
        findViewById(R.id.pcard1).setOnLongClickListener(new MyOnLongClickListener());
        findViewById(R.id.pcard2).setOnLongClickListener(new MyOnLongClickListener());
        findViewById(R.id.pcard3).setOnLongClickListener(new MyOnLongClickListener());
        findViewById(R.id.pcard4).setOnLongClickListener(new MyOnLongClickListener());
        findViewById(R.id.pcard5).setOnLongClickListener(new MyOnLongClickListener());
        findViewById(R.id.pcard6).setOnLongClickListener(new MyOnLongClickListener());
        findViewById(R.id.pcard7).setOnLongClickListener(new MyOnLongClickListener());
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
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY

                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    @SuppressWarnings("unused")
    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}
