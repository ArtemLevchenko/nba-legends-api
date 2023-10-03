package com.artbender.nba.legends.model.entity.card;

import com.artbender.nba.legends.model.entity.CardType;
import com.artbender.nba.legends.model.entity.GameCard;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayerCard extends GameCard {

    private int cost;
    private int power;
    private Skill skill;

    @Override
    public CardType getCardType() {
        return CardType.PLAYER;
    }
}
