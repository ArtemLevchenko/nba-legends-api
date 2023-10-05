package com.artbender.nba.legends.model.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Getter
@RequiredArgsConstructor
public class Card {

    private Long id;
    private String name;
    private String image;

    private int cost;
    private int power;
    private SpecialAbility specialAbility;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cost == card.cost && power == card.power && Objects.equals(id, card.id) && Objects.equals(name, card.name) && Objects.equals(image, card.image) && Objects.equals(specialAbility, card.specialAbility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, image, cost, power, specialAbility);
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", cost=" + cost +
                ", power=" + power +
                ", specialAbility=" + specialAbility +
                '}';
    }
}
