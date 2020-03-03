import java.util.Scanner;

public class Main {
    static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int startRange = 12;
        int endRange = 15;

        boolean finished = false;
        while (!finished) {

            /*
             * Repeatedly prompt the user for an integer, until it's valid and in
             * range.
             */
            Integer intObj;
            do {
                System.out.print("Enter an integer between " + startRange + " and " + endRange + ": ");
                String userIntegerInput = keyboard.nextLine();
                intObj = IOHelper.tryParseInt(userIntegerInput);
            } while ((intObj == null) || !IOHelper.inRange(intObj, startRange, endRange));

            /*
             * Repeatedly prompt the user until they enter "Y" or "N".
             * That answer will determine if we're finished.
             */
            String userYorN;
            do {
                System.out.print("Continue? (Y/N) ");
                userYorN = keyboard.nextLine();
            } while (!IOHelper.isValidYorN(userYorN));

            finished = "N".equals(userYorN);
        }
    }

}
