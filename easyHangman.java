import java.util.Arrays;
import java.util.Scanner;

public class easyHangman {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int attempt = 6;
        
        String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
        "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
        "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
        "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
        "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
        "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
        "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
        "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
        "wombat", "zebra"};

        String randomWord = words[(int) (Math.random() * words.length)];
        char[] randomWordArray = randomWord.toCharArray();
        int arrayLength = randomWordArray.length;
        char[] copied = Arrays.copyOf(randomWordArray, arrayLength);

        for (int i = 0; i < copied.length; i++){
            copied[i] = '_';
        }
        //System.out.println(randomWord);
        System.out.println(copied);

        while (attempt > 0){
            System.out.println("Attemps: " + attempt);
            System.out.print("Guess: ");
            char letter = scan.next().charAt(0);

            boolean foundLetter = false;
            for (int i = 0; i < randomWordArray.length; i++){
                if (letter == randomWordArray[i]){
                    copied[i] = letter;
                    foundLetter = true;
                    //System.out.print(randomWordArray[i]);
                }
            }

            if (!foundLetter){
                attempt--;
            }

            System.out.println();
            System.out.println(copied);

            boolean wordsAreTheSame = Arrays.equals(copied, randomWordArray);
            if (wordsAreTheSame){
                System.out.println("Good job! You guessed the Word and WON");
                break;
            }
        }

        if (attempt == 0){
            System.out.println("Sorry you lose! Next time will be better");
        }


    }
}
