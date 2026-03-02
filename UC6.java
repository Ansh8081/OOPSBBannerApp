/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 *
 * Modular approach to generate ASCII patterns for O, O, P, S
 * using dedicated helper methods.
 */

public class UC6 {

    // Pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "** **",
            "** **",
            "** **",
            "** **",
            "** **",
            " *** "
        };
    }

    // Pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            "***** ",
            "**  **",
            "**  **",
            "***** ",
            "**    ",
            "**    ",
            "**    "
        };
    }

    // Pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " ****",
            "**   ",
            "**   ",
            " *** ",
            "    **",
            "    **",
            "**** "
        };
    }

    // Main method
    public static void main(String[] args) {

        // Get patterns for each character
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print "OOPS"
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + "   "
              + oPattern[i] + "   "
              + pPattern[i] + "   "
              + sPattern[i]
            );
        }
    }
}
