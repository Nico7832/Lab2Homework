package model;

import java.util.StringJoiner;

public class Cows extends Entity {
    private int yieldperday;
    private String name;

    public Cows(int yieldperday, String name) {
        this.yieldperday = yieldperday;
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cows.class.getSimpleName() + " :","|\n")
                .add("Yield per day='" + yieldperday+"'")
                .add("Name='" + name + "'")
                .add("Weight='" + weight+"'")
                .toString();
    }
}
