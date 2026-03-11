/*
 * ================================================================
 * MAIN CLASS – TrainConsistMgmnt
 * ================================================================
 *
 * Use Case 13: Performance Comparison (Loops vs Streams)
 *
 * Description:
 * This class compares the performance of loop-based
 * filtering versus stream-based filtering using
 * System.nanoTime() for precise benchmarking.
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Filters bogies using traditional loops
 * - Filters bogies using Streams
 * - Measures execution time for both approaches
 * - Displays results for comparison
 *
 * This maps performance benchmarking using nanoTime().
 *
 * @author Developer
 * @version 13.0
 */
package com.tcmapp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistMgmnt {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("==================================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // ---- LOOP-BASED FILTERING ----
        long loopStart = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 50) {
                loopFiltered.add(b);
            }
        }
        long loopEnd = System.nanoTime();
        long loopDuration = loopEnd - loopStart;

        // ---- STREAM-BASED FILTERING ----
        long streamStart = System.nanoTime();
        List<Bogie> streamFiltered = bogies.stream()
                                           .filter(b -> b.capacity > 50)
                                           .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        long streamDuration = streamEnd - streamStart;

        // ---- RESULTS ----
        System.out.println("Loop Execution Time (ns): " + loopDuration);
        System.out.println("Stream Execution Time (ns): " + streamDuration);

        System.out.println("\nUC13 performance benchmarking completed...");
    }
}
