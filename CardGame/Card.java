public class Card implements Comparable<Object> {
  /**
  * Set instance variables as follows;
  *   variable "name" of type string
  *   variable suit of type string
  *   variable "value" of type primitive integer
  * Note: use the correct access specifier
  */
  private String name, suit;
  private int value; 
  
  /**
  * Card Constuctor - default
  * Creates a default card object with;
  *   name set to "default"
  *   suit set to "default"
  *   value set to 0
  * @param none
  */
  public Card() {
    name = "default";
    suit = "default";
    value = 0;
  }
  
  /**
  * Card Constuctor - initializing
  * Creates a default card object with;
  *   name set to "default"
  *   suit set to "default"
  *   value set to 0
  * @param  name a string with name of card
  * @param  suit a string with name of suit
  * @param  value an integer with the value of the card
  */

  public Card(String n, String s, int v) {
    value = v;
    name = n;
    suit = s;
  }


  /**
  * Accessor Methods for each instance variable
  */

  public String getName() {
    return name;
  }

  public int getValue() {
    return value;
  }

  public String getSuit() {
    return suit;
  }

  /**
  * Mutator Methods for each instance variable
  */

  public void setName(String n) {
    name = n;
  }

  public void setSuit(String s) {
    suit = s;
  }

  public void setValue(int v) {
    value = v;
  }



  /**
  * sortRank - Helper function to give rank of card, weighted
  *            by suit. 
  *                diamonds 0-12, hearts 13-25, 
  *                spades 26 - 38, clubs 39 - 51
  *  So you simply need to add a wight to value of this card object
  *                diamonds: value + 0
  *                hearts: value + 13
  *                spades: value + 26
  *                clubs: value + 39
  */



  private int sortRank() {  
    int amt = 0;
    switch (suit) {
      case "hearts":
        amt = 12;
        break;
      case "spades":
        amt = 26;
        break;
      case "clubs":
        amt = 39;
        break;
    }
    return value + amt;
  }


  /**
  * compareTo - Override the compareTo() method default
  * 
  */

  public int compareTo(Object obj)  {     // ** You have to fix this method declaration
    if (sortRank() > ((Card)obj).sortRank()) {
      return 1;
    }
    else if (sortRank() == ((Card)obj).sortRank()) {
      return 0;
    }
    return -1;
  }

  /**
  * equals - Override the equals() method default
  *  for indexOf() to work on an array of cards we 
  *   need to define what it means for two cards to 
  *   be equal.  We use indexOf() to find the 2 of 
  *   clubs in the CardGame class.
  */
   
  public boolean equals(Object obj) {
    Card input = (Card)obj;
    if (input.getName().equals(name) && input.getSuit().equals(suit) && input.getValue() == value) {
      return true;
    }
    return false; 
  }


  /**
  * toString - Override the toString method default
  * 
  */

  public String toString() {
    if (name.equals("K")||name.equals("Q")||name.equals("J")||name.equals("A")||name.equals("T")) {
      return suit.charAt(0)+name+"("+value+")";
    }
    return suit.charAt(0)+""+value+"("+value+")";
  }


}
