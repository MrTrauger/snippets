import java.util.Scanner;
public class WordleGame {

	public static void main(String[] args) {
		
		//determine what the answer should be, coder gets to decide this LOWERCASE ONLY
		String soln = new String ("basic");
		
		System.out.print("Welcome to Wordle! ");
		
		//run the game
		playGame(soln);
		

	}

	/**
	 * You decide how to comment this!
	 * 
	 * @param soln is the right answer
	 */
	private static void playGame(String soln) {
		
		//create a scanner object that is constructed to read the console (aka System.in)
		Scanner gameReader = new Scanner (System.in);
		
		//prompt and allow user to give an input, set a String equal to it (it is the guess)
		System.out.println("Make a guess (lowercase please): ");
		String playerGuess = new String (gameReader.next());

  	/*
		 * This is where all the code you write should be. You can write it all
		 * in here or you can write separate methods to accomplish the task.
		 * My only suggestion is to make methods that cheack each letter individially
		 * and prints out the letter, an X or a ? respectively. 
		 */
		
		
		if ( /* condition that checks if the guess is not the same as the answer */ )
		{
			//prompt user to guess again because they were wrong
			playGame(soln);
		}
		else  /* if you are here, that means the user guessed it correctly */
		{
			//print out success message
			System.out.println("Congrats! You successfully guessed that the word was " + soln + ".");
		}
		
	}

}
