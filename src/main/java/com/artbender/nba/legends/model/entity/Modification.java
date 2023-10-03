package com.artbender.nba.legends.model.entity;

import com.artbender.nba.legends.model.enums.EventType;
import com.artbender.nba.legends.model.enums.Operation;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Modification {
    private int value;
    private Operation operation;
}
