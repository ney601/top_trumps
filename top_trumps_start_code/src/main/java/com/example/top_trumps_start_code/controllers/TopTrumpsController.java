package com.example.top_trumps_start_code.controllers;

import com.example.top_trumps_start_code.models.Card;
import com.example.top_trumps_start_code.services.TopTrumpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/toptrumps")
public class TopTrumpsController {

@Autowired
TopTrumpService topTrumpService;

@PostMapping
public ResponseEntity <String> showCards (@RequestBody ArrayList<Card> cards)
    {
        String reply = topTrumpService.checkWinner(cards.get(0), cards.get(1));
        return new ResponseEntity<>(reply, HttpStatus.CREATED);
    }
}
