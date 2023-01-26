/**
 * @author Kirin Sharma
 *
 */

public class Gem {

	private int monetaryValue; // The monetary value of the gem
	private int gemX; // The x-coordinate of the gem
	private int gemY; // The y-coordinate of the gem
	
	/**
	 * Constructs a gem with a value of 1 and default coordinates
	 */
	public Gem()
	{
		monetaryValue = 1;
		gemX = 0;
		gemY = 0;
	} // end constructor
	
	/**
	 * @param value the value to set the gem to
	 * @param xCoord the x coordinate to assign the gem
	 * @param yCoord the y coordinate to assign the gem
	 */
	public Gem(int value, int xCoord, int yCoord)
	{
		monetaryValue = value;
		gemX = xCoord;
		gemY = yCoord;
	} // end constructor
	
	/**
	 * Gets the monetary value of the current gem
	 * @return the value of the current gem
	 */
	public int getGemValue()
	{
		return monetaryValue;
	} // end getGemValue
	
	/**
	 * Gets the x coordinate of the current gem
	 * @return the x value of the current gem
	 */
	public int getGemX() 
	{
		return gemX;
	} // end getGemX
	
	/**
	 * Gets the y coordinate of the current gem
	 * @return the y value of the current gem
	 */
	public int getGemY()
	{
		return gemY;
	} // end getGemY
	
} // end class
