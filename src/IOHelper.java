/**
 * Assists with tasks related to Input/Output
 * <p>
 * This class provides helper methods for common tasks regarding I/O of data
 *
 * @author Phil O'Connell (pxo4@psu.edu)
 */
public class IOHelper {
    /**
     * Checks that given string is "Y" or "N"
     *
     * @param str string to be checked
     * @return true if string is "Y" or "N"
     */
    public static boolean isValidYorN(String str) {
        return ("N".equals(str) || "Y".equals(str));
    }

    public static String fullName(String firstName, String middleName, String lastName) {
        if ((middleName == null) || middleName.isEmpty()) {
            return String.format("%s %s", firstName, lastName);
        } else {
            return String.format("%s %s. %s", firstName, middleName.charAt(0), lastName);
        }
    }

    public static boolean inRange(int value, int start, int end) {
        if (value < start || value > end) {
            return false;
        } else {
            return true;
        }
    }

    public static Integer tryParseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

}
