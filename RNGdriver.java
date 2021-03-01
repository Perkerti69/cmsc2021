
/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: (Random Number Generator program)
 * Due: 2/28/2021
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Perkerti Koirala
*/

import java.util.Scanner;


public class RNGdriver {
public static void main(String[] args){
		
		try (Scanner scr = new Scanner(System.in)) {
			

			int nextGuess;
			int highGuess = 100, lowGuess = 0;
		
			int randNum;
			randNum = RNG.rand();
			
			System.out.println("Enter your first guess ");
			nextGuess = scr.nextInt();
			
			while( nextGuess!=randNum )
			{
				
				if ((int)RNG.getCount()/2 != 0)
					
					System.out.println("Number of guess is " +(int)RNG.getCount()/2);
			
			while(!RNG.inputValidation(nextGuess,lowGuess,highGuess))
			{
				nextGuess = scr.nextInt();
			}
			
			if ( nextGuess>randNum ) 
			{
				highGuess=nextGuess;
				System.out.println("Your guess is too high"); 
			}
			
			else
				
				if ( nextGuess<randNum ) 
				{
					lowGuess=nextGuess;
					System.out.println("Your guess is too low"); 
				}

			
			if ( nextGuess==randNum ) {
				
				System.out.println("Congratulations, you guessed correctly.");
			    System.out.println("Try again? 1 = Yes and 0 = No :" );
			

				if (scr.nextInt() == 1)
				{
					RNG.resetCount();
			        main(args);
				}
				
			else
				
				System.out.println("Thanks for playing...");
				System.out.println("Programmed by: Perkerti Koirala.");
				System.exit(0);
			
			}
		}
	}
}
}
