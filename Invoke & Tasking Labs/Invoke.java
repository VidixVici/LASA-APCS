// name:  
// purpose: demonstrate further method prowess

public class Invoke 
{
   // method piggyBank(): returns what the change is worth in cents
	public static int piggyBank(int pennies, int nickels, int dimes, int quarters, int halfDollars) {
		int value;
    value = (1 * pennies) + (5  * nickels) + (10 * dimes) + (25 * quarters) + (50 * halfDollars);
		return value;
	}   

	 // method mp3Sizer(): estimates the number of gB needed to store media
	public static int mp3Sizer(int songs, int videos, int photos){
    double value1;
    value1 = (3.04 * songs) + (89.3 * videos) + (1.72 * photos);
    value1 = value1 / 1000;
    int value2 = (int)(value1 + .6);
    return value2;
  }
}