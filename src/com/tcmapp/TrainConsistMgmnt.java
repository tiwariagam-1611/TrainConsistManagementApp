/*
 * ================================================================
 * MAIN CLASS – TrainConsistMgmnt
 * ================================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This class demonstrates how to maintain insertion
 * order of bogies while preventing duplicates using
 * LinkedHashSet.
 *
 * At this stage, the application:
 * - Stores bogies in insertion order
 * - Removes duplicates automatically
 * - Displays the final train formation
 *
 * This maps ordered uniqueness validation using LinkedHashSet.
 *
 * @author Developer
 * @version 5.0
 */
package com.tcmapp;

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("===========================================\n");

        // Create a LinkedHashSet to preserve insertion order
        Set<String> trainFormation = new LinkedHashSet<>();

        // ---- CREATE (Add bogies) ----
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to add duplicates
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");

        System.out.println("Final Train Formation:");
        System.out.println(trainFormation + "\n");

        System.out.println("Note:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.\n");

        System.out.println("UC5 formation setup completed...");
    }
}
