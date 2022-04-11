import java.util.Scanner;
public class Deal
{
	//instance variables (DO NOT ADD ANY MORE)
	private int prizeLoc;
	private int userGuess;
	
	//constructor
	public Deal()
	{
		prizeLoc = randomNum();
    userGuess = randomNum();
	}
	
	//modifier method for userGuess (should call random number method)
	public void setUserGuess(int initguess)
  {
    userGuess = initguess;
  }
	
	//modifier method for prizeLoc (should call random number method)
	public void setPrizeLoc(int initPrizeLoc)
  {
    prizeLoc = initPrizeLoc;
  }
	
	//accessor method for userGuess
	public int getUserGuess()
  {
    return userGuess;
  }
	
	//accessor method for prizeLoc
	public int getPrizeLoc()
  {
    return prizeLoc;
  }
	
	//method to generate random number between 1 & 3
	public int randomNum()
  {
    int ranNum = (int)(Math.random() * (3)) + 1;
    return ranNum;
  }
	
	//method to reveal the door
	public int revDoor(){
    int doorRev = 0;
    do
    {
      doorRev = randomNum();
    }while((doorRev == prizeLoc) || (doorRev == userGuess));
    return doorRev;
  }
	
	//method to update user's guess
		public int newGuess(){
    int guessNew = 0;
    do
    {
      guessNew = randomNum();
    }while((guessNew == userGuess) || (guessNew == revDoor()));
    return guessNew;
  }
	
	//toString method
	public String toString()
	{
		return "user guess:" + userGuess + " prizeLoc:" + prizeLoc;
	}
}
