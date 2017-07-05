import java.util.Scanner;

public class PigLatinTranslator {

    public static void askForWord() {
        Scanner scan = new Scanner(System.in);
        String userInput = "";
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String choice = "";

        //Here is the while loop for the continue statement
        while(!"n".equals(choice)){
        System.out.println("Please enter a word you wish not to understand");
        userInput = scan.nextLine().toLowerCase();

        //this for loop gets the letter
        for (int i = 0; i < userInput.length(); i++) {

                    char letter = userInput.charAt(i);

                    //this for loop check the vowel
                    for (int j = 0; j < vowels.length; j++) {

                        if (vowels[j] == letter) {

                            if (i == 0) {
                                System.out.println(userInput + "way");

                            } else {
                                String test = userInput.substring(0, i);
                                String outPut = userInput.substring(i, userInput.length());
                                outPut = outPut + test + "ay";
                                System.out.println(outPut);
                            }
                            userInput = "";
                        }
                    }
                }
                scan = new Scanner(System.in);
                System.out.println("Would you like to continue? y/n");
                choice = scan.nextLine();
        }
        System.out.println("Goodbye!");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to not understanding the English language\n");
        //here I am calling the method, askForWord
        askForWord();
    }
}
