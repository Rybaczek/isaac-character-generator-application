package characterpicker.core;

import java.util.Objects;

public class Character {
    private static final int DEFAULT_WEIGHT_VALUE = 1;
    private final String name;
    private final Weight weight;

    public Character(String name) {
        this.name = name;
        this.weight = Weight.of(DEFAULT_WEIGHT_VALUE);
    }

    public Character(String name, Weight weight) {
        this.name = name;
        this.weight = weight;
    }

    public Weight getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name) && Objects.equals(weight, character.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return name + " " + weight;
    }
}
