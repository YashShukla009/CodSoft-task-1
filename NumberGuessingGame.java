import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int totalRounds = 3;
        int totalScore = 0;
        System.out.println("Let's play the Number guessing game");
      
for(int round=1;round<=totalRounds;round++){
    System.out.println("\nRound"+round+"begins");
    int randomNumber= rd.nextInt(100)+1;
    int maxAttempts= 5;
    boolean hasGussedCorrectly = false;
    int attempts = 0;
    while (attempts<maxAttempts){
        System.out.println("Enter your guess (1 to 100):");
        int guess = sc.nextInt();
           attempts++;
           if(guess==randomNumber){
            System.out.println("Yayy!you guessed the correct number");
            totalScore+=maxAttempts-attempts+1;
            hasGussedCorrectly=true;
            break;
           }
           else if (guess<randomNumber){
            System.out.println("your guess is too low.");
           }
           else{
            System.out.println("your guess is to high.");
           }
           System.out.println("Attempts left:"+(maxAttempts-attempts));
        }
        if(!hasGussedCorrectly){
            System.out.println("Better luck next time.the correct number was"+randomNumber);
        }

    }
       System.out.println("\nGame over!!your total score:"+totalScore);
        
        
    }

}    