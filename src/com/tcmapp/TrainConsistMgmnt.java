/*
 * ================================================================
 * MAIN CLASS – UseCase3TrainConsistMgmnt
 * ================================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This class ensures that duplicate bogie IDs are not
 * added into the train formation using HashSet.
 *
 * At this stage, the application:
 * - Stores bogie IDs
 * - Prevents duplicates automatically
 * - Displays unique bogie identifiers
 *
 * This maps uniqueness validation using Set.
 *
 * @author Developer
 * @version 3.0
 */
package com.tcmapp;

import java.util.HashSet;
import java.util.Set;

public class TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("===========================================\n");

        // Create a Set to hold unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // ---- CREATE (Add bogie IDs) ----
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG104");

        // Attempt to add duplicates
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogieIDs + "\n");

        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.\n");

        System.out.println("UC3 uniqueness validation completed...");
    }
}

