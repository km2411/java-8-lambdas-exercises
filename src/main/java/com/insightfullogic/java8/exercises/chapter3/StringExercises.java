package com.insightfullogic.java8.exercises.chapter3;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StringExercises {

    // Question 6
    public static int countLowercaseLetters(String string) {
        return (int) string.chars()
                .filter(Character::isLowerCase)
                .count();
    }

    // Question 7
    public static Optional<String> mostLowercaseString(List<String> strings) {
        Comparator<String> comparator = Comparator.comparing(StringExercises::countLowercaseLetters);
        return strings.stream()
                .max(comparator);
    }

}
