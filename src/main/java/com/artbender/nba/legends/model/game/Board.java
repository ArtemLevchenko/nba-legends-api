package com.artbender.nba.legends.model.game;

import com.artbender.nba.legends.model.entity.Card;
import com.artbender.nba.legends.model.enums.BoardZone;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class Board {

    private final String playerContextId;
    private final Map<BoardZone, List<Card>> boardZoneMap;

    public Board(String playerContextId) {
        this.playerContextId = playerContextId;
        this.boardZoneMap = new HashMap<>();
        this.boardZoneMap.put(BoardZone.INSIDE_ZONE, new ArrayList<>());
        this.boardZoneMap.put(BoardZone.MIDDLE_ZONE, new ArrayList<>());
        this.boardZoneMap.put(BoardZone._3POINT_ZONE, new ArrayList<>());
        this.boardZoneMap.put(BoardZone.COACH_ZONE, new ArrayList<>());
        this.boardZoneMap.put(BoardZone.DISCARD_ZONE, new ArrayList<>());
    }

    public void addCardToZone(BoardZone boardZone, Card card) {
        boardZoneMap.computeIfAbsent(boardZone, k -> new ArrayList<>()).add(card);
    }
}
