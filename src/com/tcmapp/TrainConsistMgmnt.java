/*
 * ================================================================
 * MAIN CLASS – TrainConsistMgmnt
 * ================================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * This class filters passenger bogies based on seating
 * capacity using Java Stream API.
 *
 * At this stage, the application:
 * - Creates a list of bogies
 * - Converts list into stream
 * - Applies filter condition
 * - Collects filtered result
 * - Displays qualifying bogies
 *
 * This maps functional filtering using Streams.
 *
 * @author Developer
 * @version 8.0
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

        System.out.println("===========================================");
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("===========================================\n");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // ---- FILTER using Streams ----
        List<Bogie> filteredBogies = bogies.stream()
                                           .filter(b -> b.capacity > 10)
                                           .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 10):");
        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

        System.out.println("\nUC8 filtering completed...");
    }
}
