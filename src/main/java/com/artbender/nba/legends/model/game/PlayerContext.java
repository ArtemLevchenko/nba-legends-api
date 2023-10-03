package com.artbender.nba.legends.model.game;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderClassName = "Builder")
public class PlayerContext {
    private String playerContextId;
    private Deck deck;
    private Hand hand;
    private Player player;
}
