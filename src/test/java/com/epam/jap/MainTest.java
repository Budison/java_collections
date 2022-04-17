package com.epam.jap;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.testng.Assert.*;


public class MainTest {

    @Test
    public void testArrayListAddWithInt() {
        // Given
        List<Integer> list = new ArrayList<>();
        // When
        list.add(20);
        // Then
        assertEquals(list.get(0), 20);
        assertEquals(list.size(), 1);
    }

    @Test
    public void testArrayListGetWithInt() {
        // Given
        List<Integer> list = new ArrayList<>();
        list.add(20);
        // When
        Integer fromGet = list.get(0);
        // Then
        assertEquals(fromGet, 20);
    }

    @Test
    public void testArrayListAddWithIntPlusIndex() {
        // Given
        List<Integer> list = new ArrayList<>();
        // When
        list.add(0, 5);
        // Then
        assertEquals(list.get(0), 5);
    }

    @Test
    public void testArrayListGetWithString() {
        // Given
        List<String> list = new ArrayList<>();
        // When
        list.add("First");
        list.add("Second");
        list.add("Third");
        // Then
        assertTrue(list.get(2).equalsIgnoreCase("third"));
    }

    @Test
    public void testName() {
        // Given
        // When
        // Then
    }
}
