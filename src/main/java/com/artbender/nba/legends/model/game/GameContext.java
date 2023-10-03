package com.artbender.nba.legends.model.game;

import com.artbender.nba.legends.model.entity.Card;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class GameContext {
    private List<PlayerContext> playerContexts;
    // from 2 sides
    private List<Board> boards;
    private String takeTurnPlayerContextId;


    public void createContext(Player homePlayer, List<Card> homePlayerCards,
                     Player awayPlayer, List<Card> awayPlayerCards) {

        this.playerContexts = new ArrayList<>();

        final String homePlayerContextId = UUID.randomUUID().toString();

        playerContexts.add(PlayerContext
                .builder()
                .playerContextId(homePlayerContextId)
                .player(homePlayer)
                .deck(Deck.builder()
                        .cards(homePlayerCards)
                        .build())
                        .hand(new Hand())
                .build());

        final String awayPlayerContextId = UUID.randomUUID().toString();

        playerContexts.add(PlayerContext
                .builder()
                .playerContextId(awayPlayerContextId)
                .player(awayPlayer)
                .deck(Deck.builder()
                        .cards(awayPlayerCards)
                        .build())
                .hand(new Hand())
                .build());

        this.boards = new ArrayList<>();
        this.boards.add(new Board(homePlayerContextId));
        this.boards.add(new Board(awayPlayerContextId));

        this.takeTurnPlayerContextId = homePlayerContextId;

    }

}
