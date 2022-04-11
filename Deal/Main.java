//import Scanner
import java.lang.Math;
import java.util.Scanner;

// DealRunner
public class Main
{
	public static void main(String[] args)
	{
		//instantiate Scanner object
    Scanner scan = new Scanner(System.in);
		
		//prompt the user for the number of simulations to run
		System.out.println("Simulations to run");
		
		//assign input to variable
		int numOfSim = scan.nextInt();
		
		//declare variables to store stopping condition for loop, prize loc, user guess,
		  //door revealed, the new guess, and wins by changing
		int doorRev = 0;
    int newGuess = 0;
    int wins = 0;
		String swap = "";
		//loop through the number of simulations
		for (int simsDone = 1; simsDone < numOfSim + 1; simsDone++) {
  //System.out.println(simsDone); to test count

		
			//instantiate a Deal object inside the loop
			Deal deal = new Deal();
			
			//get the user's guess and assign to a variable 
			int uGuess = deal.getUserGuess();
			
			//get the prize location and assign to a variable
			int pLoc = deal.getPrizeLoc();
			
			//get the door which is revealed and assign to a variable
			int revealed = deal.revDoor();
			
			//get the new guess and assign to a variable
			int newG = deal.newGuess();
			
		
			if(newG == pLoc){
        swap = "true";
      }
      else{
        swap = "false";
      }
			
			//determine if the new guess matches the prize location
			if(newG == pLoc){
			
			
			//increment the win count by changing
				wins++;
				
      }
			//output the variables for each simulation
      System.out.println(deal.toString() + " revealed:" + revealed + " new guess:" + newG + " win if switching:" + swap + " if not switching:" + swap);
		}

		//output the probability of winning/not winning by switching
    double x = wins;
    double y = numOfSim;
    System.out.println(wins);
    System.out.println(numOfSim);
		double probability = x / y;
    double probability2 = 1 - probability;
		System.out.println("Probability of winning if you switch = " + probability);
    System.out.println("Probability of winning if you do not switch = " + probability2);
	}
}