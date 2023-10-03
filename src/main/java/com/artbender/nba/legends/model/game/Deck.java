package com.artbender.nba.legends.model.game;

import com.artbender.nba.legends.model.entity.Card;
import lombok.Builder;
import lombok.Getter;

import java.util.Collections;
import java.util.List;

@Getter
@Builder(builderClassName = "Builder")
public class Deck {

    private List<Card> cards;

    public void shuffle() {
        Collections.shuffle(cards);
    }
    public int cardsLeft() {
        return cards.size();
    }
    public Card dealCard() {
        Card card = cards.get(0);
        cards.remove(card);
        return card;
    }
    public List<Card> dealCard(int count) {
        List<Card> cardList = cards.stream()
                .limit(count)
                .toList();
        cards.removeAll(cardList);
        return cardList;
    }

}
