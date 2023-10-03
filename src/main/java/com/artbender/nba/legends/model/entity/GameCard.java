package com.artbender.nba.legends.model.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class GameCard implements Card {
    protected Long id;
    protected String name;
    protected String description;
    protected String image;
}
