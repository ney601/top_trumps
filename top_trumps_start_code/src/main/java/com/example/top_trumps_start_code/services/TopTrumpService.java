package com.example.top_trumps_start_code.services;

import com.example.top_trumps_start_code.models.Card;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TopTrumpService {

private ArrayList <Card> cards;

public TopTrumpService()
{

}

public String checkWinner(Card card1, Card card2)
{
    if (card1.getCardValue() > card2.getCardValue())
    {
        return card1.getRank() + " of " + card1.getSuit() + " wins!";
    }
    if (card1.getCardValue() < card2.getCardValue())
    {
        return card2.getRank() + " of " + card2.getSuit() + " wins!";
    }
    if (card1.getRank() == card2.getRank() && card1.getSuit() == card2.getSuit())
    {
        return "You can't have the same card in deck!";
    }
    else return "It's a draw!";
}

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
