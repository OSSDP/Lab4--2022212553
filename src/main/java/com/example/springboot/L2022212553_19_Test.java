package com.example.springboot;




import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2022212553_19_Test {

    @Test
    public void testGameOfLife_Rule1() {
        Solution solution = new Solution();
        int[][] board = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        int[][] expected = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}
        };
        solution.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    @Test
    public void testGameOfLife_Rule2() {
        Solution solution = new Solution();
        int[][] board = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        int[][] expected = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        solution.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    @Test
    public void testGameOfLife_Rule3() {
        Solution solution = new Solution();
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        int[][] expected = {
                {0, 1, 0},
                {0, 1, 1},
                {0, 1, 0},
                {0, 0, 0}
        };
        solution.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    @Test
    public void testGameOfLife_Rule4() {
        Solution solution = new Solution();
        int[][] board = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0},
                {0, 1, 1},
                {0, 0, 0}
        };
        int[][] expected = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 1},
                {0, 1, 1},
                {0, 0, 0}
        };
        solution.gameOfLife(board);
        assertArrayEquals(expected, board);
    }

    // Helper method to compare 2D arrays
    private void assertArrayEquals(int[][] expected, int[][] actual) {
        int rows = expected.length;
        int cols = expected[0].length;
        assertEquals(rows, actual.length, "Row count mismatch");
        assertEquals(cols, actual[0].length, "Column count mismatch");

        for (int i = 0; i < rows; i++) {
            assertArrayEquals(expected[i], actual[i], "Array mismatch at row " + i);
        }
    }

    private void assertArrayEquals(int[] ints, int[] ints1, String s) {

    }
}
