package com.artbender.nba.legends.model.enums;

import lombok.Getter;

@Getter
public enum CardClass {
    CHICAGO("Chicago"), LAKERS("Lakers"),
    FREE_AGENTS("Free Agents"), TACTICAL("Tactical");

    private final String label;

    CardClass(String label) {
        this.label = label;
    }

}
