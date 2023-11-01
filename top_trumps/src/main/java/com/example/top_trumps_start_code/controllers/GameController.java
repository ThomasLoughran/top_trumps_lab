package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.models.Rank;
import com.example.top_trumps_start_code.models.Reply;
import com.example.top_trumps_start_code.models.Suit;
import com.example.top_trumps_start_code.services.TopTrumpService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import static com.example.top_trumps_start_code.models.Suit.HEARTS;

@RestController
@RequestMapping(value = "/topTrumps")
public class GameController {


    @PostMapping
    public ResponseEntity<String> cardCheck(@RequestBody ArrayList<Card> cards){

        TopTrumpService topTrumpService = new TopTrumpService(cards);
        return new ResponseEntity<>(topTrumpService.checkWinner(),HttpStatus.OK);
    }



}
