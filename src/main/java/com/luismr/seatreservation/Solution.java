package com.luismr.seatreservation;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {
    public static int[] solution(int N, int K, int[] seat) {
        // Use NavigableSet instead of TreeSet for the minimum functionality we need
        NavigableSet<Integer> availableSeats = new TreeSet<>();
        Set<Integer> reservedSeats = new HashSet<>();
        
        // Initially add all seats as available using Stream
        IntStream.rangeClosed(1, N).forEach(availableSeats::add);
        
        List<Integer> result = new ArrayList<>();
        
        // Process each operation using Stream
        IntStream.range(0, K).forEach(i -> {
            if (seat[i] == 0) {
                // According to problem statement, there is always an unreserved seat available
                // when seat[i] = 0, so availableSeats cannot be empty here
                int smallestSeat = availableSeats.first();
                availableSeats.remove(smallestSeat);
                reservedSeats.add(smallestSeat);
                result.add(smallestSeat);
            } else {
                // Cancel reservation
                int seatToCancel = seat[i];
                if (reservedSeats.contains(seatToCancel)) {
                    reservedSeats.remove(seatToCancel);
                    availableSeats.add(seatToCancel);
                }
            }
        });
        
        // Convert List to array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
} 