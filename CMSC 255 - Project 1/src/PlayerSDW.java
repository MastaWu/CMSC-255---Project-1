
public class PlayerSDW {
	
	// Declare your instance variables here of the appropriate types: myName,
		// myDie1, myDie2, myDie3, and myScore
		
		String myName;

		int myScore;
	
		DieSDW myDie1, myDie2, myDie3;
		
		// Write the PlayerXYZ constructor that takes a single String as it's only
		// parameter. This parameter must be stored in the instance variable myName.
		// You will also need to instantiate the 3 Die objects and set the player's
		// score to 0.
		
		public PlayerSDW(String x){
			
			myName = x;
			
			myDie1 = new DieSDW();
			
			myDie2 = new DieSDW();
			
			myDie3 = new DieSDW();
			
			myScore = 0;
			
			
		}
		
		// Write the rollDice() method. This should use the rollDie() method of each
		// of the Die objects to produce a faceValue for each die. This method
		// returns nothing.
		
		public void rollDice(){
			
			myDie1.roll();
			myDie2.roll();
			myDie3.roll();
			
		}
		
		// Provide a getDieValue() method that accepts an int which represents one
		// of the 3 dice (1 - 3) the player has rolled. Return the appropriate face
		// value for the die requested.

		public int getDieValue(int dice){
			
			switch(dice){
			
				case 1: myDie1.getFaceValue();
						break;
				case 2: myDie2.getFaceValue();
						break;
				case 3: myDie3.getFaceValue();
			
			}
			
			return 0;
						
		}
		
		// Write the getter and setter methods for each of the instance variables. Do
		// not use these methods to add score to the standing or current scores, only
		// to set them.
		
		public String getMyName() {
			return myName;
		}

		public void setMyName(String myName) {
			this.myName = myName;
		}

		public int getMyScore() {
			return myScore;
		}

		public void setMyScore(int myScore) {
			this.myScore = myScore;
		}
		
		// Create the showDice() method which prints out the current player's current
		// dice roll.
		
		
		// Create the diceTotal() method that returns the sum of the faces of the
		// current player's dice.
		
		// Finish the toString() method which prints out the Player's name and his
		// score in parenthesis following his name. Use the getDieValue() method to
		// get the faceValue of any dice.
		public String toString()
		{
			String result = new String();

			// write your code here
			
			return result;
		}
		
}
