package com.artbender.nba.legends.model.game;

import com.artbender.nba.legends.model.entity.Card;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Hand {

    private final List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void clear() {
        cards.clear();
    }
    public void addCard(Card card) {
        cards.add(card);
    }
    public void removeCard(Card card) {
        cards.remove(card);
    }
    public void addCards(List<Card> newCards) {
        cards.addAll(newCards);
    }
    public void removeCards(List<Card> removeCards) {
        cards.removeAll(removeCards);
    }
    public int getCardCount() {
        return cards.size();
    }
}
