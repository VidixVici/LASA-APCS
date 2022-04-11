public class GCD
{
	//instance variables - DO NOT ADD ANY MORE INSTANCE VARIABLES
	private int numerator;
	private int denominator;
	
	//default constructor
	public GCD()
  {
    numerator = 0;
    denominator = 0;
  }
	
	//initialization constructor
	public GCD(int initNum, int initDen)
  {
    numerator = initNum;
    denominator = initDen;
  }
	
	//modifier method for numerator
	public void setNum(int numSet)
  {
    numerator = numSet;
  }
	
	//modifier method for denominator
	public void setDen(int denSet)
  {
    denominator = denSet;
  }
	
	//accessor method for numerator
	public int getNum()
  {
    return numerator;
  }
	
	//accessor method for denominator
	public int getDen()
  {
    return denominator;
  }
	
	//method to determine gcd
	public int determineGCD()
  {
    int gcdNum = numerator * denominator;
    int num1 = numerator;
    int num2 = denominator;
    int lcm = 1;
    while(true) {
      if( lcm % num1 == 0 && lcm % num2 == 0 ) {
        break;
      }
      ++lcm;
    }
    int gcd = gcdNum / lcm;
    return gcd;
  }
	
	//method to determine lowest term of numerator
	public int dtm()
  {
    int dtm = numerator / determineGCD();
    return dtm;
  }
	
	//method to determine lowest term of denominator
	public int dtd()
  {
    int dtd = denominator / determineGCD();
    return dtd;
  }
	
	//toString() method (only return the GCD value)
	public String toString()
  {
    return ("The GCD is: " + determineGCD());
  }
}