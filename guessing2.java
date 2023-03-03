/* Project:  Lab 4: Guessing Game 
* Class: guessing
* Author:   Aria Jannat
* Date: March 18, 2022
* Generates a random number between 1 - 50 and plays a game for the user to guess it.
* I was not able to figure out the statstics portion, I commented out what I had
* but there was an error when I would call my stat(); method. I could not figure it out.
* */

import java.util.Scanner;
import java.util.* ;

public class guessing2 {
	
	public static void intro() {
		
		System.out.println("This program allows you to play a guessing game.\n"
				+ "I will think of a number between 1 and 50\n"
				+ "and will allow you to guess until you get it.\n"
				+ "For each guess, I will tell you whether the\n"
				+ "right answer is higher or lower than your guess.");
		
	}

	
	
	public static void playAgain() {
		Scanner console = new Scanner (System.in);
		
		System.out.println("Do you want to play again?");
		
        String again;
        again = console.nextLine();
        
        char firstLetter;
        firstLetter = again.charAt(0);
        
        System.out.println();
        
        while (firstLetter == 'Y' || firstLetter == 'y') {
       
     
        	//playGame
        	
    		Random guess = new Random();
    		int guessNum = guess.nextInt(50)+1;
    		//System.out.println(guessNum);
    		System.out.println("");
    		System.out.println("I'm thinking of a number...");
    		
    		System.out.println("Your Guess? ");
    		int userGuess = console.nextInt();
    		
    		int guessCount = 0; 
    		int games = 0;
    		int totalGuesses = 0;
    		int totalGames = 0;
    		totalGames = totalGames +1 ;
    		int maxGuesses = 0;

    		
    		while (userGuess != guessNum) {
    		
    		if (userGuess>guessNum) {
    			System.out.println("lower");
    		userGuess = console.nextInt(); 
    		guessCount++;
    		}
    		
    		else if (userGuess<guessNum) {
    		System.out.println("higher");
    		userGuess = console.nextInt();
    		guessCount++;
    		}
    		totalGuesses += guessCount;
    		
    		}
    		guessCount++;
    		System.out.println("You got it right in "+ guessCount + " guesses!");
    			
    		games++;
    		totalGames += games;
    		maxGuesses = Math.max(maxGuesses, guessCount);
        	//playgame
        	System.out.println("Do you want to play again?");
            //again = console.nextLine();
        	Scanner consoleAgain = new Scanner (System.in);
        	again = consoleAgain.nextLine();
            firstLetter = again.charAt(0);
           
          
        	
        }
	}
	

	
	
	public static void main(String[] args) {
		
		intro();
		
		Scanner console = new Scanner (System.in);

		
		Random guess = new Random();
		int guessNum = guess.nextInt(50)+1;
		//System.out.println(guessNum);
		System.out.println("");
		System.out.println("I'm thinking of a number...");
		
		System.out.println("Your Guess? ");
		int userGuess = console.nextInt();
		
		int guessCount = 0; 
		int games = 0;
		int totalGuesses = 0;
		int totalGames = 0;
		int maxGuesses = 0;

		
		while (userGuess != guessNum) {
		
		if (userGuess>guessNum) {
			System.out.println("lower");
		userGuess = console.nextInt(); 
		guessCount++;
		}
		
		else if (userGuess<guessNum) {
		System.out.println("higher");
		userGuess = console.nextInt();
		guessCount++;
		}
		totalGuesses += guessCount;
		
		}
		guessCount++;
		System.out.println("You got it right in "+ guessCount + " guesses!");
			
		games++;
		totalGames += games;
		maxGuesses = Math.max(maxGuesses, guessCount);
		
		playAgain();
		
		System.out.println("Game statistics:");
        System.out.println("Overall results:");
        System.out.println("   total games = " + totalGames);
        System.out.println("   total guesses = " + totalGuesses);
        System.out.println("   guesses/game = " + (totalGuesses / totalGames));
        System.out.println("   max guesses = " + maxGuesses);
		//^ there was error message when I'd try to call this
        
        
        
        
		


	
	}
	}

