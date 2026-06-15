import java.util.Random;
import java.util.Scanner;

public class AccountGenerator
{

    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();

        /*input */
        System.out.print("Enter your first name: ");
        String userFirstName = scnr.nextLine();
        System.out.print("Enter your last name: ");
        String userLastName = scnr.nextLine();

        /*Converts user first and last name to lower case */
        userFirstName = userFirstName.toLowerCase();
        userLastName = userLastName.toLowerCase();

        /*grab specific characters */
        char firstLetter = userFirstName.charAt(0);
        String firstFiveLastName = userLastName.substring(0, 5);

        /*Grab Random Int */
        int randNum = randGen.nextInt(90) + 10;

        /*output */
        String username = firstLetter + firstFiveLastName + randNum;
        System.out.print("Username: " + username);


        scnr.close();
    }


}