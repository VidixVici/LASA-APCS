// Test you Collatz object
import java.util.Scanner;
import java.util.Arrays;

// DealRunner
public class Main{
	public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.print("Starting Number ");
  int num = scan.nextInt();
  Collatz collatz = new Collatz(num);
  System.out.println(collatz);
  int steps = collatz.steps();
  System.out.printf("Number of steps %d%n", steps);
  System.out.printf("Maximum value %d%n", collatz.maxValue());
  System.out.printf("Minimum odd value %d%n", collatz.minOddValue());
  int[] oddVal = collatz.oddValues();
  System.out.println("Odd values " + Arrays.toString(oddVal));
   System.out.printf("Sum of all values %d%n", collatz.sumValues());
   int[] list = collatz.sequence();
   for(int i = 1; i <= steps; i++){
     System.out.printf("step %d %d%n", i, list[i - 1]);
   }
  }
}