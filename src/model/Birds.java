package model;

import java.util.StringJoiner;

public class Birds extends Entity {
    private int age;
    private String breed;

    public Birds(int age, String breed) {
        this.age = age;this.breed = breed;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Birds.class.getSimpleName() + " :","|\n")
                .add("Age='" + age + "'")
                .add("Breed'"+ breed +"'")
                .add("Weight='" + weight+"'")
                .toString();
    }
}
