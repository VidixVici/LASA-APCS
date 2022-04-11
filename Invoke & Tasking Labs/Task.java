// name: Zachary Harbert
// purpose: experience the thrill of methods

public class Task 
{

	// method favorite(): returns ( ( ( (16 * 65 ) + 12 ) * 72 ) / 68 ) - 1
	public static int favorite() 
	{
		int nbr1 = (( ( ( (16 * 65 ) + 12 ) * 72 ) / 68 ) - 1);
		return nbr1; // change method body to produce correct answer
	}


	// method wasted(): prints line that is number of wasted gallons of water 
	public static void wasted( double dpm, int day ) 
	{
		double gallons = ((((dpm * 60) * 24) * day) / 15140);
    System.out.println("A faucet with " + dpm + " drips per minute over " + day + " days will waste " + (int)(gallons + 0.5) + " gallons of water.");
    return;
	}

	// method count(): returns estimated number of beans in jar
	public static double count( double a, double b, int mL ) 
	{
		double beans;
    beans = mL;
    beans = beans / (5 * Math.PI * a * ((b *b )/24));
    beans = beans * .698;
		return beans; // change method body to produce correct answer
	}    
}
