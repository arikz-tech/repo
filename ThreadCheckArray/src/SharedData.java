import java.util.ArrayList;

/**
 * @author Rostik
 * class to that holds shered data
 */
public class SharedData 
{
	/**
	 * list of Integers
	 */
	private ArrayList<Integer> array;
	/**
	 * array indicating winnig idexes
	 */
	private boolean [] winArray;
	/**
	 * indicator 
	 */
	private boolean flag;
	/**
	 * number of elements in the list
	 */
	private final int b;
	
	/**
	 * @param array - list of integers
	 * @param b - list size
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/**
	 * function to pull the win array
	 * @return array with boolean varibles
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * function to set win array
	 * @param winArray - array containig varibels indicaes the winning of losing
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * function to pull the array
	 * @return the list of integers
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * function to pull the number of elements in the list
	 * @return number of elements in the list(int)
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * function to pull flag
	 * @return flag indicator(boolean)
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * function to set the flag
	 * @param new flag indicator( boolean)
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
