package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static int longestLengthWithoutRepeat(String input) {
        final Set<Character> uniqueChars = new HashSet<>();
        final List<String> paths = new ArrayList<>();
        final StringBuilder sb = new StringBuilder();

        for (Character currentChar : input.toCharArray()) {
            if (!uniqueChars.add(currentChar)) {
                paths.add(sb.toString());
                sb.setLength(0);
                uniqueChars.clear();
                continue;
            }

            sb.append(currentChar);
        }

        return paths
                .stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);
    }

    public static void main(String[] args) {
        longestLengthWithoutRepeat("BCBC");
        longestLengthWithoutRepeat("BBBB");
        longestLengthWithoutRepeat("GEEKSFORGEEKS");
    }

}