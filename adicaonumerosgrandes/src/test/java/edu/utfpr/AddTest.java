package edu.utfpr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    void testAddTwoOneDigitNumbers() {
        Add add = new Add();

        List<Integer> left = Arrays.asList(1);
        List<Integer> right = Arrays.asList(1);

        List<Integer> result = add.add(left, right);

        assertEquals(Arrays.asList(2), result);
    }

    @Test
    void testAddTwoDoubleDigitNumbers() {
        Add add = new Add();

        List<Integer> left = Arrays.asList(1, 5);
        List<Integer> right = Arrays.asList(1, 0);

        List<Integer> result = add.add(left, right);

        assertEquals(Arrays.asList(2, 5), result);
    }

    @Test
    void testAddTwoTreeDigitNumbers() {
        Add add = new Add();

        List<Integer> left = Arrays.asList(5, 0, 0);
        List<Integer> right = Arrays.asList(2, 5, 0);

        List<Integer> result = add.add(left, right);

        assertEquals(Arrays.asList(7, 5, 0), result);
    }

    @Test
    void testAddTwoTenDigitNumbers() {
        Add add = new Add();

        List<Integer> left = Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
        List<Integer> right = Arrays.asList(3, 3, 3, 3, 3, 3, 3, 3, 3, 3);

        List<Integer> result = add.add(left, right);

        assertEquals(Arrays.asList(5, 5, 5, 5, 5, 5, 5, 5, 5, 5), result);
    }

    @Test
    void largeLists() {
        Add add = new Add();

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            left.add(9);
            right.add(9);
        }

        List<Integer> result = add.add(left, right);

        List<Integer> resultExpected = new ArrayList<>();
        resultExpected.add(1);
        for (int i = 1; i < 1000000; i++) {
            resultExpected.add(8);
        }

        assertEquals(resultExpected, result);
    }

    @Test
    void differentDigitNumbers() {
        Add add = new Add();
    
        List<Integer> left = Arrays.asList(3, 2, 4, 7);
        List<Integer> right = Arrays.asList(1, 1, 0, 0, 0);
    
        List<Integer> result = add.add(left, right);
    
        assertEquals(Arrays.asList(1, 4, 2, 4, 7), result);
    }

    @Test
    void empty() {
        Add add = new Add();

        List<Integer> left = Arrays.asList();
        List<Integer> right = Arrays.asList();

        List<Integer> result = add.add(left, right);

        assertEquals(Arrays.asList(), result);
    }

    @Test
    void nullAndEmpty() {
        Add add = new Add();
    
        List<Integer> left = null;
        List<Integer> right = Arrays.asList();
    
        try {
            @SuppressWarnings("unused")
            List<Integer> result = add.add(left, right);
        } catch (IllegalArgumentException e) {
            assertEquals("Input lists cannot be null", e.getMessage());
        }
    }

    @Test
    void oneNull() {
        Add add = new Add();
    
        List<Integer> left = null;
        List<Integer> right = Arrays.asList(1, 2, 3);
    
        try {
            add.add(left, right);
        } catch (IllegalArgumentException e) {
            assertEquals("Input lists cannot be null", e.getMessage());
        }
    }
    

    @Test
    void oneEmpty() {
        Add add = new Add();

        List<Integer> left = Arrays.asList();
        List<Integer> right = Arrays.asList(4, 5, 6);

        List<Integer> result = add.add(left, right);

        assertEquals(Arrays.asList(4, 5, 6), result);
    }

    @Test
    void digitsAboveNine() {
        Add add = new Add();

        List<Integer> left = Arrays.asList(12, 13, 14);
        List<Integer> right = Arrays.asList(8, 9, 10);

        List<Integer> result = add.add(left, right);

        assertEquals(Arrays.asList(0, 4, 6, 2), result);
    }

    @Test
    public void negativeNumbers() {
        Add add = new Add();

        List<Integer> left = Arrays.asList(-1, 2, 3);
        List<Integer> right = Arrays.asList(-4, 5, 6);

        List<Integer> result = add.add(left, right);

        assertEquals(Arrays.asList(-5, 7, 9), result);
    }

}
