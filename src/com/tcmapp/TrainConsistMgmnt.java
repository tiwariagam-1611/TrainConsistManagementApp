/*
 * ================================================================
 * MAIN CLASS – TrainConsistMgmnt
 * ================================================================
 *
 * Use Case 10: Count Total Seats
 *
 * Description:
 * This class demonstrates how to calculate the total
 * seating capacity of all bogies combined using Java
 * Stream API and aggregation.
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Maps bogie capacities
 * - Sums capacities to get total seats
 * - Displays the total seating capacity
 *
 * This maps aggregation using Streams.
 *
 * @author Developer
 * @version 10.0
 */
package com.tcmapp;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(" UC10 - Count Total Seats ");
        System.out.println("==================================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ---- AGGREGATE total capacity ----
        int totalSeats = bogies.stream()
                               .mapToInt(b -> b.capacity)
                               .sum();

        System.out.println("\nTotal Seats in Train Formation: " + totalSeats);

        System.out.println("\nUC10 seat counting completed...");
    }
}
