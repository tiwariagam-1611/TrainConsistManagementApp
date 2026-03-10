/*
 * ================================================================
 * MAIN CLASS – TrainConsistMgmnt
 * ================================================================
 *
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * This class demonstrates how to maintain an ordered
 * train consist using ArrayList. It supports insertion
 * at specific positions and removal of bogies while
 * preserving order.
 *
 * At this stage, the application:
 * - Stores bogies in order
 * - Inserts bogies at given positions
 * - Removes bogies from first and last positions
 * - Displays the updated ordered consist
 *
 * This maps ordered list operations using List.
 *
 * @author Developer
 * @version 4.0
 */
package com.tcmapp;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("===========================================\n");

        // Create a List to hold ordered bogies
        List<String> trainConsist = new ArrayList<>();
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist + "\n");

        // ---- INSERT at specific position ----
        trainConsist.add(2, "Pantry Car");
        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist + "\n");

        // ---- REMOVE first and last bogie ----
        trainConsist.remove(0); // remove first
        trainConsist.remove(trainConsist.size() - 1); // remove last
        System.out.println("After Removing First and Last Bogie:");
        System.out.println(trainConsist + "\n");

        System.out.println("UC4 ordered consist operations completed...");
    }
}
