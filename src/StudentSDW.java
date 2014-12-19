
public class StudentSDW {
	
	// declare the remaining required instance variables here.
		private String myName;
		
		private int classID;
		/* ? */
		
		public StudentSDW(String name, int classNum){
			
			myName = name;
			classID = classNum;
			
		}
		
		public String getMyName() {
			return myName;
		}

		public void setMyName(String myName) {
			this.myName = myName;
		}

		public int getClassID() {
			return classID;
		}

		public void setClassID(int classID) {
			this.classID = classID;
		}


		
		public String toString(){
			
			String result = new String("Name: " + myName + "\nClass ID: " + classID);
			// Format the output necessary to properly print out your class info
			// and return the formatted text.
			
			return result;
		}
		
}
