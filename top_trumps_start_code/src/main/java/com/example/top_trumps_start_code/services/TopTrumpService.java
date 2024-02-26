package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;

import java.util.ArrayList;

public class TopTrumpService {

private ArrayList <Card> cards;

public TopTrumpService()
{

}

public String checkWinner(Card card1, Card card2)
{
    if (card1.getCardValue() > card2.getCardValue())
    {
        return String.format(card1.getRank() + " of " + card1.getSuit() + " wins!");
    }
    else {
        return String.format(card2.getRank() + " of " + card2.getSuit() + " wins!");
    }
}
}
