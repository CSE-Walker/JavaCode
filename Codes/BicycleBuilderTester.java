/*
 * Written by Daniya Walker
 */
//DO NOT ALTER-----------------------
public class BicycleBuilderTester {

	public static void main(String[] args)
	{
		System.out.println("---------------------------------\nWelcome to the Bicycle Builder Tester!\n---------------------------------");
		//Default Bike
		System.out.println("First we will create a \"Default\" Bicycle");
		Bicycle b01 = new Bicycle();
		System.out.println("Printing the Bicycle's data");
		System.out.println("Bicycle's make: "+b01.getMake());
		System.out.println("Bicycle's front wheel: Diameter "+b01.getFrontWheel().getDiameter()+" Width: "+b01.getFrontWheel().getWidth());
		System.out.println("Bicycle's back wheel: Diameter "+b01.getBackWheel().getDiameter()+" Width: "+b01.getBackWheel().getWidth());
		System.out.println("Bicycle's frame: Size: "+b01.getFrame().getSize()+" Type: "+b01.getFrame().getType());
		System.out.println("\nTesting the toString method");
		System.out.println(b01);
		
		//Setting wrong properties
		System.out.println("\nSetting invalid values for the default bike's wheels and frame");
		b01.setBackWheel(new Wheel(0,0));
		b01.setFrontWheel(new Wheel(10000,10000));
		b01.setFrame(new Frame(0.0, "hexagon"));
		System.out.println(b01);
		
		//Parameter Bike
		System.out.println("\nCreating another bike using the parameterized constructor");
		Bicycle b02 = new Bicycle("Big Wheel", new Wheel(55.0,2.5), new Wheel(18.0,2.0),new Frame(60.0, "Penny-Farthing"));
		System.out.println(b02);
		
		System.out.println("\nCreating another bike using the parameterized constructor with invalid values");
		Bicycle b03 = new Bicycle(null, new Wheel(555.0,-2.5), new Wheel(-18.0,22.0),new Frame(-60.0, "dirt"));
		System.out.println(b03);
		
		//Equals
		System.out.println("\nChecking the \"equals\" method");
		System.out.println("Does the first and third bicycles have different memory addresses? "+(b01!=b03));
		System.out.println("Does the first and third bicycles have the same properties? "+b01.equals(b03));
		System.out.println("\n---------------------------------\nTests Complete! Goodbye!\n---------------------------------");
	}
	
}
//-------------------------------------