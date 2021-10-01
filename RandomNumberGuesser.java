


/**
 * 
 * @author Chris TArk
 * 
 * This program is design to create a game consisting of guessing a right number.
 * 
 *
 */
import java.util.Scanner;
import java.util.*;
import java.util.Random;
public class RandomNumberGuesser {

	
	
	
	public static void main(String[] args) {      //header
		
	
		//reading input with new scanner
				Scanner input = new Scanner(System.in);
		
		
		
		
		
		//i tried to do a do loop but It kept giving me a logical error
		
		String response;
		do {
		//variables 
		
		int lowGuess = 0;
		int highGuess = 99;
		int nextGuess;
		int currentG;
		
		
		
		RandomNG wow = new RandomNG();
		int randNum = wow.rand(1+highGuess);
		
		wow.resetCount();
		
		
		
		// it says that there will be at most 7 guess from the user but in case 
		// I'll write a while loop, this will allow the user to have as many 
		// guess until the right
		// number is found
		while (true) {
	
		// the program will start with the iteration being 0 asking for the first guess
			
			if(wow.getCount() == 0) 
			System.out.println("Enter your first guess");
			
			
			//when the iteration increases to 1 then the program will ask for the second guess
				else 
					System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
					//read guesses
					nextGuess = input.nextInt();
				
			
				
			
				
				//counting the number of users guesses
				wow.Counting();
				
				currentG = wow.getCount();
				System.out.println("Number of guess is "+ currentG);
		
				
			//
			if(wow.inputValidation(nextGuess)) {
				
				break;
		
			}
			
			else {
			
				if (nextGuess >= highGuess || nextGuess <= lowGuess) {
					
					continue;
				}
				else if (nextGuess > randNum) {
					
					highGuess = nextGuess;
				}
				
				else if (nextGuess < randNum) {
					
					lowGuess = nextGuess;
				}
			}
			
		
		}
			
		
		System.out.println("Try again? (yes or no)");
		
		Scanner hi = new Scanner(System.in);
		response = hi.nextLine();
		
		
				
		
		
		
		}while(response.equalsIgnoreCase("yes"));
	
		
	}
}




