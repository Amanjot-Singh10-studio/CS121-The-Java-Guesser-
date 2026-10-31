import java.util.*; 

public class Guesser { 
	public static void main(String[] args){ 
		new Guesser(); 
	} 
	public Guesser() { 
	   Scanner input = new Scanner(System.in); 
	   int choice = -1; 
	   while (choice !=0) { 
		System.out.println(); 
		System.out.println("0) Exit");
		System.out.println("1) Human Guesser"); 
		System.out.println("2) Computer Guesser"); 
		System.out.println("Please enter 0-2: "); 
		choice = input.nextInt(); 

		if (choice == 1) { 
		   humanGuesser(input); 
		} 
		else if (choice == 2) { 
		   computerGuesser(input); 
		} 
		else if (choice == 0) { 
		   System.out.println("Thanks for Playing Goodbye!"); 
		} 
		else { 
		   System.out.println("Invalid choice!"); 
		} 
	} 
} 

public void humanGuesser(Scanner input){ 
	int number = (int)(Math.random() * 100) + 1; 
	int guess = 0; 
	int turns = 0; 
	System.out.println("Human guesser"); 
	while (guess != number) { 
		turns++; 
		System.out.print(turns + ") Please enter a number: "); 
		guess = input.nextInt(); 
		if (guess > number) { 
			System.out.println("Too high.."); 
		} 
		else if (guess < number) { 
			System.out.println("Too low.."); 
		} 
		else { 
			System.out.println("Got it!"); 
			System.out.println("Very good!"); 
		} 
	} 
} 
public void computerGuesser(Scanner input) { 
	int low = 1; 
	int high = 100; 
	int turns = 0; 
	boolean keepGoing = true; 
	System.out.println("Computer guesser"); 
	while (keepGoing && low <= high) { 
	       int guess = (low + high) / 2; 
       	       turns++; 
	       System.out.println(turns + ") I guess " + guess); 
	       System.out.print("Too (H)igh, too (L)ow, or (C)orrect? "); 
               String response = input.next().toLowerCase(); 
	       if (response.equals("h")) { 
		   high = guess -1; 
    	       } 
	       else if (response.equals("l")) { 
		   low = guess + 1; 
	       } 
	       else if (response.equals("c")) { 
	           System.out.println("Got it!"); 
    		   keepGoing = false; 
	       } 
	       else { 
		   System.out.println("Invalid response!"); 
    		   turns--; 
	       } 
	} 
	
	if (low > high) { 
	    System.out.println("Answers do not match!"); 
    	} 
    }
} 
