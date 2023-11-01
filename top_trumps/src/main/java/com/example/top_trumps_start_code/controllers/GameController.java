package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Reply;
import com.example.top_trumps_start_code.models.Suit;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import static com.example.top_trumps_start_code.models.Suit.HEARTS;

@RestController
@RequestMapping(value = "topTrumps")
public class GameController {

    private Card card1;
    private Card card2;
    ArrayList<Card> cards = new ArrayList<>();



    @PostMapping
    public ResponseEntity<Reply> cardCheck(){
        this.card1 = new Card(Rank.TWO, Suit.HEARTS);
        this.card2 = new Card(Rank.FOUR, Suit.HEARTS);
        this.cards.add(card1);
        this.cards.add(card2);
        Reply reply = new Reply(cards);
        return new ResponseEntity<>(reply, HttpStatus.OK);
    }


//    @RestController
//    @RequestMapping(value = "/games")
//    public class GameController {
//
//        private Game game;      // ADDED
//        private String currentWord; // ADDED
//        private ArrayList<String> guessedLetters;   // ADDED
//
//        @PostMapping
//        public ResponseEntity<Reply> newGame(){
//            this.game = new Game("hello");      // MODIFIED
//            this.currentWord = "*****";     // ADDED
//            this.guessedLetters = new ArrayList<>();    // ADDED
//            Reply reply = new Reply(currentWord, "New game started");
//            return new ResponseEntity<>(reply, HttpStatus.CREATED);
//        }
//
//    }

}
