package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Reply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpService {


    ArrayList<Card> cards;
    Card card1;
    Card card2;
    Rank rank1;
    Rank rank2;
    public TopTrumpService() {
    }

    public TopTrumpService(ArrayList<Card> cards){
        this.cards = cards;
        this.card1 = cards.get(0);
        this.card2 = cards.get(1);

    }

    public String checkWinner(){
        rank1 = this.card1.getRank();
        rank2 = this.card2.getRank();

        if(rank1.getValue() >= rank2.getValue()){
            return String.format("%s of %s wins!", card1.getRank(),card1.getSuit());
        }else {
            return String.format("%s of %s wins!", card2.getRank(),card2.getSuit());
        }
    }
}
