package com.artbender.nba.legends.model.entity;

import com.artbender.nba.legends.model.enums.BoardZone;
import com.artbender.nba.legends.model.enums.EventType;
import com.artbender.nba.legends.model.enums.TriggerType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SpecialAbility {
    private String description;
    private TriggerType triggerType;
    private Modification modification;
    private EventType eventType;
    private BoardZone availableZone;
}
