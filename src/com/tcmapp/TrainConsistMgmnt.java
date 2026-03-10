/*
 * ================================================================
 * MAIN CLASS – TrainConsistMgmnt
 * ================================================================
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * This class validates goods bogies against safety rules
 * using Java Streams and lambda expressions. It ensures
 * that cylindrical bogies only carry petroleum, preventing
 * unsafe cargo assignments.
 *
 * At this stage, the application:
 * - Creates a list of goods bogies
 * - Converts list into stream
 * - Applies safety rules using allMatch()
 * - Displays whether train formation is compliant
 *
 * This maps safety compliance using Streams and conditional logic.
 *
 * @author Developer
 * @version 12.0
 */
package com.tcmapp;

import java.util.ArrayList;
import java.util.List;

public class TrainConsistMgmnt {

    // Inner GoodsBogie class to model goods bogies
    static class GoodsBogie {
        String type;   // e.g., Cylindrical, Box, Flatbed
        String cargo;  // e.g., Petroleum, Coal, Grain

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("==================================================\n");

        // Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        bogies.add(new GoodsBogie("Box", "Coal"));              // valid
        bogies.add(new GoodsBogie("Flatbed", "Grain"));         // valid
        bogies.add(new GoodsBogie("Cylindrical", "Coal"));      // invalid

        System.out.println("All Goods Bogies:");
        for (GoodsBogie b : bogies) {
            System.out.println(b);
        }

        // ---- SAFETY COMPLIANCE CHECK ----
        boolean isSafe = bogies.stream().allMatch(b ->
                !(b.type.equals("Cylindrical") && !b.cargo.equals("Petroleum"))
        );

        System.out.println("\nSafety Compliance Result:");
        System.out.println("Train Formation Safe: " + isSafe);

        System.out.println("\nUC12 safety compliance check completed...");
    }
}
