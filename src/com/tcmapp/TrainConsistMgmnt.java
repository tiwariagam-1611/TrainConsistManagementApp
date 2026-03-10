/*
 * ================================================================
 * MAIN CLASS – TrainConsistMgmnt
 * ================================================================
 *
 * Use Case 11: Validate Train ID & Cargo Codes (Regex)
 *
 * Description:
 * This class validates Train IDs and Cargo Codes using
 * Regular Expressions (Regex). It ensures that only
 * correctly formatted values are accepted before further
 * processing.
 *
 * At this stage, the application:
 * - Accepts Train ID and Cargo Code inputs
 * - Validates formats using Regex
 * - Displays whether inputs are valid or invalid
 *
 * This maps input validation using Pattern and Matcher.
 *
 * @author Developer
 * @version 11.0
 */
package com.tcmapp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainConsistMgmnt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println(" UC11 - Validate Train ID and Cargo Code ");
        System.out.println("===========================================\n");

        Scanner sc = new Scanner(System.in);

        // Regex for Train ID: TRN- followed by 4 digits
        String trainIdPattern = "^TRN-\\d{4}$";

        // Regex for Cargo Code: PET- followed by two uppercase letters
        String cargoCodePattern = "^PET-[A-Z]{2}$";

        // Input from user
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // Validate Train ID
        Pattern trainPattern = Pattern.compile(trainIdPattern);
        Matcher trainMatcher = trainPattern.matcher(trainId);
        boolean trainValid = trainMatcher.matches();

        // Validate Cargo Code
        Pattern cargoPattern = Pattern.compile(cargoCodePattern);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);
        boolean cargoValid = cargoMatcher.matches();

        // Display results
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + trainValid);
        System.out.println("Cargo Code Valid: " + cargoValid);

        System.out.println("\nUC11 validation completed...");
        sc.close();
    }
}
