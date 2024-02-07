package org.example;

public record Person(
    int id,
    String name,
    DaysOfWeek favoriteDay,
    Gender gender
) {
    public enum Gender {
        MALE,
        FEMALE,
        DIVERSE
    }
}
