package com.xsallus.porc;

import java.util.Random;

public class Card {
    private String naipe;
    private Integer num;

    Random rn = new Random();

    public String geraCard(){
        String card = null;
        Integer naipenum = rn.nextInt(4);
        this.num = (rn.nextInt(13)+1);

        switch (naipenum) {
            case 0:
                this.naipe = "a";
                break;
            case 1:
                this.naipe = "b";
                break;
            case 2:
                this.naipe = "c";
                break;
            case 3:
                this.naipe = "d";
                break;
        }

        card = (naipe + num.toString());

        return card;
    }

    public Integer getNum() {
        return this.num;
    }
}
