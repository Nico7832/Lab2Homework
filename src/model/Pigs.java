package model;

import java.util.StringJoiner;

public class Pigs extends Entity {
    private String name;
    private int length;

    public Pigs(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pigs.class.getSimpleName() + " :","|\n")
                .add("Name='" + name + "'")
                .add("Length='"+ length +"'")
                .add("Weight='" + weight+"'")
                .toString();
    }
}
