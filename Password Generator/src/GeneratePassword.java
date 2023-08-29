import java.util.*;
public class GeneratePassword {

    public static StringBuilder finishedProduct;

    public static void createPassword(){

        finishedProduct = new StringBuilder();
        Random charIndex = new Random();

        String charBank = CharacterBank.createCharacterBank(PasswordRequirements.useUppercase, PasswordRequirements.useLowercase, PasswordRequirements.useNumbers, PasswordRequirements.useSpecialCharacters);

        for(int i = 0; i < PasswordRequirements.passwordLength; i++){
            finishedProduct.append(charBank.charAt(charIndex.nextInt(charBank.length())));
        }

        String completedPassword = finishedProduct.toString();
        System.out.println("Below is your generated password: " );
        System.out.println(completedPassword);
        System.out.println();

    }
}
