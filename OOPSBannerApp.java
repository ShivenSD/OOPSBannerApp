/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 *
 * This use case extends UC5 by implementing a modular approach to generate each
 * letter's pattern through dedicated methods. This enhances code reusability and
 * maintainability by separating pattern generation logic from the main display logic.
 *
 * @author ShivenSD
 * @version 6.0
 */

// Extend the User Story 5 to display the OOPS banner using a modular approach…

// Key Requirements:

// Hint:
// 1. Define methods getOPattern(), getPPattern(), and getSPattern()
//    that return String arrays representing the ASCII art for each letter
// 2. In the main method, call these methods to get the patterns and store them
//    in String arrays
// 3. Use a loop to assemble and print each line of the banner
// Example of method to create O pattern:
// Step 1: Define the method
// Step 2: Then in main method, call getOPattern() to get the O pattern
// Step 3: Finally, use a loop to print each line of the banner

public class OOPSBannerApp {


//Method to generate the O pattern for the banner
public static String[] getOPattern() {
    return new String[] {
        "   ***   ",
        " **   ** ",
        "**     **",
        "**     **",
        "**     **",
        " **   ** ",
        "   ***   "
    };
}
//Method to generate the P pattern for the banner
public static String[] getPPattern() {
    return new String[] {
        "*****   ",
        "**   ** ",
        "**    **",
        "**   ** ",
        "*****   ",
        "**      ",
        "**      "
    };
}
//Method to generate the S pattern for the banner
public static String[] getSPattern() {
    return new String[] {
        " ***** ",
        "**   **",
        "**      ",
        " ***** ",
        "     **",
        "**   **",
        " ***** "
    };
}
    // Main method to run the banner display
    public static void main(String[] args) {
        // Define a String array to hold the lines of the OOPS banner
        // Each line represents a row in the banner for the letters O, O, P, S
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            // Print each line of the banner by concatenating the corresponding lines
            // from the O, O, P, S patterns with spaces in between
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
}
}
