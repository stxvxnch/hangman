import java.util.Scanner;

public class Main {
    public static String[] words = {"ant", "baboon", "badger", "bat", "bear","beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog",
            "goat", "goose", "hawk", "lion", "lizard", "llama", "mole",
            "monkey", "moose", "mouse", "mule", "newt", "otter", "owl",
            "panda", "parrot", "pigeon", "python", "rabbit", "ram", "rat",
            "raven","rhino", "salmon", "seal", "shark", "sheep", "skunk",
            "sloth", "snake", "spider", "stork", "swan", "tiger", "toad",
            "trout", "turkey","turtle", "weasel", "whale", "wolf", "wombat", "zebra"};

    public static String[] gallows = {
            "+---+\n" +
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +   //if the user didn't miss any guesses.
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +   //if the user missed one guess.
                    "    |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            "+---+\n" +
                    "|   |\n" +
                    "O   |\n" +    //if the user missed two guesses.
                    "|   |\n" +
                    "    |\n" +
                    "    |\n" +
                    "=========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +   //if the user missed three guesses.
                    "/|   |\n" +
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n"+   //if the user missed four guesses.
                    "     |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +  //if the user missed five guesses.
                    "/    |\n" +
                    "     |\n" +
                    " =========\n",

            " +---+\n" +
                    " |   |\n" +
                    " O   |\n" +
                    "/|\\  |\n" +   //if the user missed six guesses.
                    "/ \\  |\n" +
                    "     |\n" +
                    " =========\n"};

    public static String generatedWord = randomWord();
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int misses = 0;
        int attempt = 6;
        while (attempt > 0){
            
        }

            /*for (int i = 0; i < gallows.length; i ++)
            printPlaceholder();
            checkGuess();
        }*/

    }

    public static String randomWord(){
       String randomWord = words[(int) (Math.random() * words.length)];
       return randomWord;
       /*System.out.println(randomWord);

        System.out.print("Word: ");
        for (int i = 0; i < randomWord.length(); i++){
            System.out.print(" _ ");
        }*/
    }

    public static void printPlaceholder(){
        System.out.println(generatedWord);
        char[] randomWordToChar = generatedWord.toCharArray();
        System.out.print("Word: ");
        for (int i = 0; i < randomWordToChar.length; i++){
            System.out.print(" _ ");
        }
    }

    public static void updatePlaceholder(){

        if (checkGuess() == true){

        }
    }

    public static char guess(){
        char guess = scan.next().charAt(0);
        return guess;
    }

    public static boolean checkGuess(){
        System.out.print("Guess: ");

        char guess = guess();

        char[] generatedWordArray = generatedWord.toCharArray();

        for (int i = 0; i < generatedWord.length(); i++){
            if (guess == generatedWordArray[i]){
                System.out.println("found");
                return true;
            }
        }

        return false;

    }

/*    public static boolean checkGuess(char letter){
        if (l)
    }*/
}

