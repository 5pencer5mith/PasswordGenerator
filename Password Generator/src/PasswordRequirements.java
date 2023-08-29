import java.util.Scanner;
public class PasswordRequirements {

    public static boolean useUppercase = false;
    public static boolean useLowercase = false;
    public static boolean useNumbers = false;
    public static boolean useSpecialCharacters = false;
    public static int passwordLength;

    public static void questionsForUser(){

        Scanner userInput = new Scanner(System.in);

        System.out.println("How many characters long should this password be?");
        System.out.print("Please enter an integer: ");
        passwordLength = userInput.nextInt();
        System.out.println();

        System.out.println("Can this password include any and all uppercase letters?");
        System.out.print("y/n: ");
        String answerToUppercase = userInput.next();
        if(answerToUppercase.equals("y")){
            useUppercase = true;
        }
        System.out.println();

        System.out.println("Can this password include any and all lowercase letters?");
        System.out.print("y/n: ");
        String answerToLowercase = userInput.next();
        if(answerToLowercase.equals("y")){
            useLowercase = true;
        }
        System.out.println();

        System.out.println("Should this password include numbers?");
        System.out.print("y/n: ");
        String answerToNumbers = userInput.next();
        if(answerToNumbers.equals("y")){
            useNumbers = true;
        }
        System.out.println();

        System.out.println("Can this password include any and all of the following special characters?");
        System.out.println(CharacterBank.specialCharacters);
        System.out.print("y/n: ");
        String answerToSpecialChar = userInput.next();
        if(answerToSpecialChar.equals("y")){
            useSpecialCharacters = true;
        }
        System.out.println();

    }
}
