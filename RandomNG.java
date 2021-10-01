
//import the needed resources to conduct program
import java.util.*;
import java.util.Random;
import java.util.Scanner;


public class RandomNG {
	
	
	private int iterations = 0;
	
	int lowGuess = 0;
	int highGuess = 99;
	private int randNum;
	
	
	
	
	
	
	
	public int rand(int max) {
		
		Random random = new Random();
		randNum = random.nextInt(max);
		
		return randNum;
	}
	
	public void resetCount() {
		//initialize to 0
		iterations = 0;
	}
	
	public int getCount() {
		
		// store/return thr value
		return iterations;
		
	}
	
	public void Counting() {
		
		//increment the count
		iterations++;
		
		
	}
	
	public boolean inputValidation(int nextGuess) {
		
		// for when the user enter the right random 
		//number than this boolean statement returns true
		if(nextGuess == randNum) {
			
			System.out.println("Congradulations, you have guessed correctly!");
			return true;
		}
		
		//user input error 
		if(nextGuess> highGuess || nextGuess <lowGuess) {
			
			System.out.println("Error!!!: You need to guess a number in between " + 
			lowGuess+ " and " + highGuess);
		}
		
		else if (nextGuess < randNum) {
			
			lowGuess = nextGuess;
			
			System.out.println("Your guess is too low");
			
			
		}
		
		else if (nextGuess > randNum) {
			
			
			highGuess = nextGuess;
			System.out.println("Your guess is too high");
			
			
		}
		
		
		
		
		
		return false;
		
		
	}
	
}

