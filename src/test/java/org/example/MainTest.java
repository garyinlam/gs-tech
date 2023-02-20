package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void medianMerged_ValidInput_ReturnCorrect(){
        assertEquals(3, Main.medianMerged(new int[] {1,2,3}, new int[] {4,5}));
        assertEquals(3.5, Main.medianMerged(new int[] {1,2,3}, new int[] {4,5,6}));

    }
}