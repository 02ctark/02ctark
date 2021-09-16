//
// Week 1
// 	Wifi Diagnosis
//
import java.util.Scanner;


public class Assignment1{
	
	
	
	public static void main(String[] arg) {
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
	
		
		//first question
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
		System.out.println("First step: reboot your computer\n" + "Are you able to connect with the internet? (yes or no)");
		//user input
		String input = keyboard.nextLine();
		
		//if statement to end the program or send to the next question
		if (input.equals("yes")) {
			
			System.out.println("Rebooting your computer seemed to work!");
			return;
		} else {
			
			//second question
			System.out.println("Second step: reboot your router");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			input = keyboard.nextLine();
			
		}
		
		if (input.equals("yes")) {
			
			System.out.println("Rebooting your router seems to work!");
			return;
		} else {
			
			//third question
			System.out.println("Third step: make sure the cables to your router are plugged in firmly and \nyour router is getting power");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			input = keyboard.nextLine();
			
		}
		
		if(input.equals("yes")) {
			
			System.out.println("Checking your cables seemed to work!");
			return;
		} else {
			
			//fourth question
			System.out.println("Fourth step: move your computer closer to your router");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			input = keyboard.nextLine();
			
		}
		
		if (input.equals("yes")) {
			
			System.out.println("Moving your computer seemed to fix the problem!");
			return;
		} else {
			
			// final statement
			System.out.println("Fifth step: contact your ISP");
			System.out.println("Make sure your ISP is hooked up to your router.");
			
			
		}
		
		
		
	}
}