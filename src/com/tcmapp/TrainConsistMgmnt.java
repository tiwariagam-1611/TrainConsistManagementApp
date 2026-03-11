/*
 * ================================================================
 * MAIN CLASS – TrainConsistMgmnt
 * ================================================================
 *
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 *
 * Description:
 * This class demonstrates runtime safety validation for
 * cargo assignment. If unsafe cargo is assigned to a bogie,
 * a custom runtime exception is thrown, caught, and handled
 * gracefully with logging in a finally block.
 *
 * At this stage, the application:
 * - Defines a custom runtime exception CargoSafetyException
 * - Validates cargo assignment rules dynamically
 * - Uses try-catch-finally for safe handling
 * - Ensures application continues after failure
 *
 * This maps runtime safety handling using structured exceptions.
 *
 * @author Developer
 * @version 15.0
 */
package com.tcmapp;

public class TrainConsistMgmnt {

    // ---- CUSTOM RUNTIME EXCEPTION ----
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // Goods Bogie model
    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // Assign cargo with safety validation
        void assignCargo(String cargo) {
            try {
                // Rule: Rectangular bogie cannot carry petroleum
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully -> " + cargo);
                System.out.println("Cargo validation completed for " + shape + " bogie");
            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Cargo validation completed for " + shape + " bogie");
            } finally {
                System.out.println("UC15 runtime handling completed...");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("=============================================\n");

        // Valid assignment
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        cylindrical.assignCargo("Petroleum");

        System.out.println();

        // Invalid assignment
        GoodsBogie rectangular = new GoodsBogie("Rectangular");
        rectangular.assignCargo("Petroleum");
    }
}
