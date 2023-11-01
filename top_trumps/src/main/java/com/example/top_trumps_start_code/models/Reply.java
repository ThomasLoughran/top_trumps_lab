package com.example.top_trumps_start_code.models;

import java.util.ArrayList;

public class Reply {
    ArrayList<Card> cards;

    public Reply(ArrayList<Card> cards){
        this.cards = cards;
    }

    public Reply() {
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
