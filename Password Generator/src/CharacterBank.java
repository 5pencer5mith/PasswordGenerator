public class CharacterBank {

    public static String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    public static String numbers = "1234567890";
    public static String specialCharacters  = "~!@#$%^&*()_-+=?";

    public static StringBuilder charBank;

    public static String createCharacterBank(boolean useUpperCase, boolean useLowerCase, boolean useNumbers, boolean useSpecialCharacters){

        charBank = new StringBuilder();

        if(useUpperCase){
            charBank.append(upperCase);
        }

        if(useLowerCase){
            charBank.append(lowerCase);
        }

        if(useNumbers){
            charBank.append(numbers);
        }

        if(useSpecialCharacters){
            charBank.append(specialCharacters);
        }

        return charBank.toString();
    }
}
