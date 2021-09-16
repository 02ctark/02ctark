
import java.lang.Math;
import java.util.Scanner;

public class SphereVolume { 
	
	
public static void main(String[] args) { 
	
	Scanner x = new Scanner(System.in);
	double diameter;
	double radius;
	int volume;
	
	//Print the purpose of the program 
	// and Print a prompt asking for the diameter of a sphere
	System.out.println("Let's find the volume of this sphere!\n" + 
	"Enter the diameter of the sphere:");
	
	//read the diameter
	diameter = x.nextDouble();
	
	//arithmetics
	radius = diameter/2.0;

	//calculate volume
	volume = (int) ((4.0/3.0)*(Math.PI)*Math.pow(radius, 3));
	
	//print the volume
	System.out.println("The volume of the sphere is " + volume + " cubic meters");
	
	} 

} 
