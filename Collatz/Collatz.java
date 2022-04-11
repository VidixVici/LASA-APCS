// If you are doing this correctly your code should not be more then 125 lines
// (including comments & blank lines separating the methods).
public class Collatz {
	// instance variables (aka members, fields)
  private int startNum;
   // default constructor
  public Collatz(){
    startNum = 0;
  }
   // initialization constructor
  public Collatz(int initStartNum){
    startNum = initStartNum;
  }
   // Add a method called steps() that returns the number of steps 
   // that are required for the starting number to reach 1.
   public int steps(){
    int steps = 1;
    int x = startNum;
    while(x != 1){
      if(x % 2 == 0){
        x /= 2;
      }
      else{
        x *= 3;
        x++;
      }
      steps++;
    }
    return steps;
   }
   // Add a method called sequence() that returns an array of the sequence of
   // numbers from the starting number to 1. Use your steps() function to 
   // determine how the size of your array.
    public int[] sequence(){
     int l = steps();
     int[] sequence = new int [l];
     sequence[0] = startNum;
     for(int i = 1; i < sequence.length ; i++){
       if(i != 0 && (sequence[i - 1] % 2 == 0)){
         sequence[i] = sequence[i-1] / 2;
       }
       else if(i != 0 && (sequence[i - 1] % 2 != 0)){
         sequence[i] = (sequence[i-1] * 3) + 1;
       }
     }
     return sequence;
   }
   // Add a method called maxValue() that returns the maximum value in the sequence.
   // Iterate through the values returned by a call to sequence().
  public int maxValue()
  {
    int[] sequence = sequence();
    int maxValue = Integer.MIN_VALUE;
    for(int i = 0; i < sequence.length; i++){
      if(maxValue <= sequence[i]){
        maxValue = sequence[i];
      }
    }
    return maxValue;
  }
   // A method called minOddValue() that returns the minimum value of all the odd numbers, 
   // except for 1, in the sequence. Iterate through the values returned by a call to sequence().
  public int minOddValue(){
    int[] sequence = sequence();
    int minOddValue = Integer.MAX_VALUE;
    for(int i = 0; i < sequence.length; i++){
      if((minOddValue >= sequence[i]) && (sequence[i] % 2 != 0)){
        if(sequence[i] != 1){
          minOddValue = sequence[i];
        }
      }
    }
    return minOddValue;
  }
   // Add a method called oddValues() that returns an array of all the odd numbers in the sequence. 
   // Iterate through the values returned by a call to sequence().  
  public int[] oddValues(){
    int[] sequence = sequence();
    int oddCounter = 0;
    for(int i = 0; i < sequence.length; i++){
      if((sequence[i] % 2 != 0)){
          oddCounter++;
      }
    }
    int[] sequenceOdd = new int [oddCounter];
    int x = 0;
    for(int l = 0; l < sequence.length; l++){
      if((sequence[l] != 0) && (sequence[l] % 2 != 0))
      {
        sequenceOdd[x] = sequence[l];
        x++;
      }
    }
    return sequenceOdd;
  }
   // Add a method called sumValues() that returns the sum of all the values in the sequence.
   // Iterate through the values returned by a call to sequence().
   public int sumValues(){
     int sumValues = 0;
     int[] sequence = sequence();
      for(int i = 0; i < sequence.length; i++){
          sumValues += sequence[i];
    }
     return sumValues;
   }
   // Add a toString() method that returns ...    Starting number # takes # steps
   public String toString(){

     return("Starting Number " + startNum + " takes " + steps() + " steps") ;
   }
}

