package com.artbender.nba.legends.model.entity.card;

import com.artbender.nba.legends.model.entity.CardType;
import com.artbender.nba.legends.model.entity.GameCard;
import com.artbender.nba.legends.model.enums.EventType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CoachCard extends GameCard {

    private int value;
    private EventType eventType;

    @Override
    public CardType getCardType() {
        return CardType.COACH;
    }
}
