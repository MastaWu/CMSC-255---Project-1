import java.util.*;


public class DiceGameSDW {
	
	
	
	public static void main(String[]args){
		
		
		
		StudentSDW student = new StudentSDW("Stephen Wu", 256);
		
		startGame();
		
	}
	
	public static void startGame()
	{
		
		Scanner scan = new Scanner(System.in);
		
		// Instantiate 3 PlayerXYZ objects and ask the user for each player's
		// name. Then set the player objects' names using the user's input. 2 of
		// the PlayerXYZ objects should be the players, one should be the bar.
		String player1Name = scan.nextLine();
		
		PlayerSDW player1 = new PlayerSDW(player1Name);
		
		String player2Name = scan.nextLine();
		
		PlayerSDW player2 = new PlayerSDW(player2Name);
		
		PlayerSDW bar = new PlayerSDW("Bar");
		// Loop until the current player types "quit" (without the quotes). If
		// this condition is met, the program should end.

		// Otherwise, the program should loop, set the new current bar, then allow
		// Player 1 and Player 2 a chance to get as close to the bar as possible.
		
		String currentInput = scan.nextLine();
		
		// Do not forget to program the loop exit conditional! DO NOT REPLACE
		// true in the while statement below. The exit conditional must happen
		// in the body of the while loop.
		while(!currentInput.toLowerCase().equals("quit"))
		{
			// In this loop, players will take turns rolling dice and attempting
			// to get as close to the bar as possible.
			
			// If a player's roll is closest to the bar, the player's score is
			// increased by 1.

			// If a player rolls a score that equals the bar, that player's score
			// is increased by 2.

			// If both player's scores equals the bar, neither wins.
			
			// Do not forget to set the current bar. (See game rules in the
			// assignment for more information).
			
			// Use the getPlayerInput() method for user input. The only options
			// are roll (to roll their dice) or quit (to quit the game).
			
			getPlayerInput(currentInput);
			
			currentInput = scan.nextLine();
			
		}
	}

	// Write a method named getPlayerInput() that checks for player input. It
	// should loop until you receive a roll, or quit result. Return the result
	// of the user input as a String. Use a while loop.
	
	public static String getPlayerInput(String x){
		
		String result = "";
		
		if(x.toLowerCase().equals("roll") || x.toLowerCase().equals("quit")){
		
		return result;
		
		}
		
		return result;
		
	}
	
}
