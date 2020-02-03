package com.xsallus.porc.game.screens;

import com.xsallus.porc.listeners.MyOnLongClickListener;
import com.xsallus.porc.listeners.MyOnDragListener;
import androidx.appcompat.app.AppCompatActivity;
import com.xsallus.porc.game.rules.Card;
import com.xsallus.porc.R;
import android.os.Bundle;
import android.view.View;

public class SinglePlayer extends AppCompatActivity {
    //Card pcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_player);

        /*findViewById(R.id.pcard1).setBackgroundResource(getResources().getIdentifier(pcard.geraCard(), "drawable", getPackageName()));
        findViewById(R.id.pcard2).setBackgroundResource(getResources().getIdentifier(pcard.geraCard(), "drawable", getPackageName()));
        findViewById(R.id.pcard3).setBackgroundResource(getResources().getIdentifier(pcard.geraCard(), "drawable", getPackageName()));
        findViewById(R.id.pcard4).setBackgroundResource(getResources().getIdentifier(pcard.geraCard(), "drawable", getPackageName()));
        findViewById(R.id.pcard5).setBackgroundResource(getResources().getIdentifier(pcard.geraCard(), "drawable", getPackageName()));
        findViewById(R.id.pcard6).setBackgroundResource(getResources().getIdentifier(pcard.geraCard(), "drawable", getPackageName()));
        findViewById(R.id.pcard7).setBackgroundResource(getResources().getIdentifier(pcard.geraCard(), "drawable", getPackageName()));*/

        findViewById(R.id.drop_card_container).setOnDragListener(new MyOnDragListener());
        findViewById(R.id.pcard1).setOnLongClickListener(new MyOnLongClickListener());
        findViewById(R.id.pcard2).setOnLongClickListener(new MyOnLongClickListener());
        findViewById(R.id.pcard3).setOnLongClickListener(new MyOnLongClickListener());
        findViewById(R.id.pcard4).setOnLongClickListener(new MyOnLongClickListener());
        findViewById(R.id.pcard5).setOnLongClickListener(new MyOnLongClickListener());
        findViewById(R.id.pcard6).setOnLongClickListener(new MyOnLongClickListener());
        findViewById(R.id.pcard7).setOnLongClickListener(new MyOnLongClickListener());

        /*if(findViewById(R.id.drop_card).getBackground() != getDrawable(R.drawable.back_card)) {
            pcard = new Card();
            if(pcard.getNum() > findViewById(R.id.drop_card).getResources().getIdentifier(findViewById(R.id.drop_card).getBackground().toString(), "Drawable", getPackageName())) {
                findViewById(R.id.drop_card).setBackgroundResource(getResources().getIdentifier(pcard.geraCard(), "drawable", getPackageName()));
            }
        }*/
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
