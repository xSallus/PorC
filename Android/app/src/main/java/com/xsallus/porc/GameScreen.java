package com.xsallus.porc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GameScreen extends AppCompatActivity {

    Button reload;
    Button deal;
    TextView cpu_score;
    TextView player_score;
    ImageView cpu_card;
    ImageView player_card;

    Card pCard;
    Card cCard;

    String pcard;
    String ccard;

    Integer score;

    Integer player;
    Integer cpu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_screen);

        reload = findViewById(R.id.refresh_btn);
        deal = findViewById(R.id.deal_btn);
        cpu_score = findViewById(R.id.cpu_scoreLabel);
        player_score = findViewById(R.id.player_scoreLabel);
        cpu_card = findViewById(R.id.cpu_card);
        player_card = findViewById(R.id.player_card);

        pCard = new Card();
        cCard = new Card();

        deal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                pcard = pCard.geraCard();
                ccard = cCard.geraCard();

                player_card.setBackgroundResource(getResources().getIdentifier(pcard, "drawable", getPackageName()));
                cpu_card.setBackgroundResource(getResources().getIdentifier(ccard, "drawable", getPackageName()));

                player = pCard.getNum();
                cpu = cCard.getNum();

                if(player > cpu) {
                    score = (Integer.parseInt(player_score.getText().toString())+1);
                    player_score.setText(score.toString());
                } else if (player < cpu) {
                    score = (Integer.parseInt(cpu_score.getText().toString())+1);
                    cpu_score.setText(score.toString());
                }

            }
        });

        /*reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player_card.setBackground(getDrawable(R.drawable.back_card));
                cpu_card.setBackground(getDrawable(R.drawable.back_card));

                cpu_score.setText('0');
                player_score.setText('0');
            }
        });*/
    }

}
