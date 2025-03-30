package com.luismr.seatreservation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class SolutionTest {
    
    @Test
    void testSolution() {
        // Test case 1: Basic reservation
        int[] result1 = Solution.solution(3, 2, new int[]{0, 0});
        assertArrayEquals(new int[]{1, 2}, result1);
        
        // Test case 2: Reservation and cancellation
        int[] result2 = Solution.solution(3, 3, new int[]{0, 0, 1});
        assertArrayEquals(new int[]{1, 2}, result2);
        
        // Test case 3: Multiple cancellations
        int[] result3 = Solution.solution(4, 5, new int[]{0, 0, 0, 0, 1});
        assertArrayEquals(new int[]{1, 2, 3, 4}, result3);
    }
} 