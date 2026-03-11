/*
 * ================================================================
 * MAIN CLASS – TrainConsistMgmnt
 * ================================================================
 *
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 *
 * Description:
 * This class prevents invalid passenger bogies from being
 * created by enforcing capacity rules. If a bogie has
 * zero or negative capacity, a custom exception is thrown.
 *
 * At this stage, the application:
 * - Defines a custom exception InvalidCapacityException
 * - Validates capacity inside the Bogie constructor
 * - Throws exception when rules are violated
 * - Ensures invalid bogies are never added to the train
 *
 * This maps fail-fast validation using custom exceptions.
 *
 * @author Developer
 * @version 14.0
 */
package com.tcmapp;

// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

public class TrainConsistMgmnt {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        // Constructor with validation
        Bogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("============================================================\n");

        try {
            // Valid bogie
            Bogie sleeper = new Bogie("Sleeper", 72);
            System.out.println("Created Bogie: " + sleeper);

            // Invalid bogie (capacity <= 0)
            Bogie faulty = new Bogie("Cargo", -4);
            System.out.println("Created Bogie: " + faulty);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}
