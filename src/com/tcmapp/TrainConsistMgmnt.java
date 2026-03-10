/*
 * ================================================================
 * MAIN CLASS – TrainConsistMgmnt
 * ================================================================
 *
 * Use Case 6: Map Bogie to Capacity
 *
 * Description:
 * This class demonstrates how to associate bogie types
 * with their seating or load capacities using HashMap.
 *
 * At this stage, the application:
 * - Stores bogie types as keys
 * - Maps each bogie to its capacity
 * - Displays bogie-capacity details
 *
 * This maps key-value relationships using HashMap.
 *
 * @author Developer
 * @version 6.0
 */
package com.tcmapp;

import java.util.HashMap;
import java.util.Map;

public class TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("==================================================\n");

        // Create a HashMap to map bogie type to capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // ---- CREATE (Add bogie-capacity pairs) ----
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 120);
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);

        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}
