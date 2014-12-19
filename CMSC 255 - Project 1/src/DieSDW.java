
public class DieSDW {
	
	public int MIN = 1;
	public int MAX = 6;
	private static int faceValue;
	
	public DieSDW()
	{
		faceValue = 1;
	}

	public int roll()
	{
		faceValue = (int)(Math.random() * MAX) + 1;
		
		return faceValue;
	}
	
	public void setFaceValue(int value)
	{
		if(value > 0 && value < 7){
		
		faceValue = value;
		
		}
	}

	public int getFaceValue()
	{
		return faceValue;
	}

	public String toString()
	{
		String result = Integer.toString(faceValue);
		
		return result;
	}
	
}
