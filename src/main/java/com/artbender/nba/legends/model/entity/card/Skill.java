package com.artbender.nba.legends.model.entity.card;

import com.artbender.nba.legends.model.enums.EventType;
import com.artbender.nba.legends.model.enums.TriggerType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Skill {
    private Long id;
    private String description;
    private int value;
    private TriggerType triggerType;
    private EventType skillType;
}
