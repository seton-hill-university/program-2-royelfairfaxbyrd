//Application: Program 2
//Name: Royel Fairfax-Byrd
//GitHub User: royelfairfaxbyrd
//Date: Sep 23, 2022
//Version: 1.0
//Description: Scanners, If/Else statements, and Switch statements

//Initialize the scanner to allow for user input.
//Ask the user for 3 numbers. Store these numbers in variables to use later.
//Display a main menu of at least 4 actions the user to perform on their first 2 numbers.
//Ask the user for a menu choice.
//Using a switch statement, perform the actions based upon their menu choice.
//Once the switch statement is complete, use an IF / ELSE statement to determine if the result from the actions performed was greater than the third number. Output a response for BOTH greater than and not greater than.

//Import scanner
import java.util.Scanner; 

public class Program2 {

	public static void main(String[] args) {
		
		//Initialize scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Read three integer inputs to use later 
		System.out.println("What's your first number?");
		int num1 = keyboard.nextInt();
		System.out.println("What's your second number?");
		int num2 = keyboard.nextInt();
		System.out.println("What's your third number?");
		int num3 = keyboard.nextInt();
		
		//Main menu display
		System.out.println("\nMain Menu");
		System.out.println("---------");
		System.out.println("1) Add");
		System.out.println("2) Subtract");
		System.out.println("3) Multiply");
		System.out.println("4) Divide");
		System.out.println("5) Exit");
		
		//Read main menu choice input
		System.out.println("\nMenu Choice?");
		int choice = keyboard.nextInt();
		
		//Execute main menu action based off choice input
		//Print whether main menu choice integer is greater, less than, or equal to num3
		switch(choice)
		{
		case 1:
			int sum = num1 + num2;
			System.out.println("\nYour numbers added together equal: " + sum);
			if (sum > num3)
			{
				System.out.println("\n" + sum + " Is greater than " + num3);
			}
			if (sum < num3)
			{
				System.out.println("\n" + sum + " Is less than " + num3);
			}
			if (sum == num3)
			{
				System.out.println("\n" + sum + " Is equal to " + num3);
			}
			break;
		
		case 2:
			int diff = num1 - num2;
			System.out.println("\nYour numbers subtracted from each other equal: " + diff);
			if (diff > num3)
			{
				System.out.println("\n" + diff + " Is greater than " + num3);
			}
			if (diff < num3)
			{
				System.out.println("\n" + diff + " Is less than " + num3);
			}
			if (diff == num3)
			{
				System.out.println("\n" + diff + " Is equal to " + num3);
			}
			break;
		
		case 3:
			int prod = num1 * num2;
			System.out.println("\nYour numbers multiplied equal: " + prod);
			if (prod > num3)
			{
				System.out.println("\n" + prod + " Is greater than " + num3);
			}
			if (prod < num3)
			{
				System.out.println("\n" + prod + " Is less than " + num3);
			}
			if (prod == num3)
			{
				System.out.println("\n" + prod + " Is equal to " + num3);
			}
			break;
		
		case 4:
			int quo = num1 / num2;
			System.out.println("\nYour numbers divided equal: " + quo);
			if (quo > num3)
			{
				System.out.println("\n" + quo + " Is greater than " + num3);
			}
			if (quo < num3)
			{
				System.out.println("\n" + quo + " Is less than " + num3);
			}
			if (quo == num3)
			{
				System.out.println("\n" + quo + " Is equal to " + num3);
			}
			break;
		
		case 5:
			System.out.println("\nThank you, input again soon!");
			break;
			
		default:
				System.out.println("Error: Not in menu");
		}	
	}
}