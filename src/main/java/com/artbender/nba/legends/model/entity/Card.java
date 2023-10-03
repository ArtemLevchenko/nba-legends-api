package com.artbender.nba.legends.model.entity;

import com.artbender.nba.legends.model.enums.CardClass;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Getter
@RequiredArgsConstructor
public class Card {

    protected Long id;
    protected String name;
    protected String image;
    protected CardClass cardClass;

    private int cost;
    private int power;
    private int calculatedPower;
    private SpecialAbility specialAbility;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cost == card.cost && power == card.power && Objects.equals(id, card.id) && Objects.equals(name, card.name) && Objects.equals(image, card.image) && cardClass == card.cardClass && Objects.equals(specialAbility, card.specialAbility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, image, cardClass, cost, power, specialAbility);
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", cardClass=" + cardClass +
                ", cost=" + cost +
                ", power=" + power +
                ", specialAbility=" + specialAbility +
                '}';
    }
}
