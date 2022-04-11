public class InOrder
{
	private int numOne;
	private int numTwo;
	private int numThree;
	
	public InOrder()
	{
		// complete default constructor
		numOne = 0;
    numTwo = 0;
    numThree = 0;
	}
	
	public InOrder(int n1, int n2, int n3)
	{
		// complete initialization constructor
		numOne = n1;
    numTwo = n2;
    numThree = n3;
	}
	
	public void setNumOne(int n1)
	{
		// complete modifier method for numOne
		numOne = n1;
	}
	
	// add modifier method for numTwo
	public void setNumTwo(int n2)
  {
    numTwo = n2;
  }
	// add modifier method for numThree
	public void setNumThree(int n3)
  {
    numThree = n3;
  }
	public int getNumOne()
	{
		// complete accessor method for numOne
    return numOne;
	}
	
	// add accessor method for numTwo
	public int getNumTwo()
  {
    return numTwo;
  }
	// add accessor method for numThree
		public int getNumThree()
  {
    return numThree;
  }
	// add method that returns a boolean indicating that the 
	// instance variables are in order or not 
	// i.e. numOne is the smallest, numThree is the largest
	public boolean smallToLarge(int x, int y, int z)
  {
    boolean tof;
    if ((x <= y) && (y <=z)) {
      tof = true;
    } else {
      System.out.println(x + " <= " + y + " <= " + z + " is");
      tof = false;
    }
    return tof;
  }
	// add a VOID method to put the instance variables in order
  // numOne = lowest value, numTwo = middle value, numThree = highest value	
  public void correctOrd(int numOne, int numTwo, int numThree){
    int middleVal = 0;
    int lowestVal = 0;
    int highestVal = 0;
    if ((numTwo > numOne) && (numTwo < numThree))
    {
      middleVal = numTwo;
      lowestVal = numOne;
      highestVal = numThree;
    } 
    else if ((numTwo < numOne) && (numTwo > numThree))
    {
      middleVal = numTwo;
      lowestVal = numThree;
      highestVal = numOne; 
    }
    
    else if ((numOne > numTwo) && (numOne < numThree))
    {
      middleVal = numOne;
      lowestVal = numTwo;
      highestVal = numThree;
    } 
    else if ((numOne < numTwo) && (numOne > numThree))
    {
      middleVal = numOne;
      lowestVal = numThree;
      highestVal = numTwo; 
    }

    else if ((numThree > numOne) && (numThree < numTwo))
    {
      middleVal = numThree;
      lowestVal = numOne;
      highestVal = numTwo;
    } 
    else if ((numThree > numTwo) && (numThree < numOne))
    {
      middleVal = numThree;
      lowestVal = numTwo;
      highestVal = numOne; 
    }
    System.out.println("The correct order is " + lowestVal + " <= " + middleVal + " <= " + highestVal);
} 
	
	
	public String toString()
	{
		return "" + numOne + " " + numTwo + " " + numThree;
	}
}

