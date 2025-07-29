package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void test() {
        assertEquals(7, Main.longestLengthWithoutRepeat("geeksforgeeks"));
        assertEquals(1, Main.longestLengthWithoutRepeat("aaa"));
        assertEquals(6, Main.longestLengthWithoutRepeat("abcdefabcbb"));
    }
} 