import java.util.*;    // required to use ArrayList

public class CardPlayer  extends Player{
  private ArrayList<Card> hand = new ArrayList<Card>();
  private ArrayList<Card> takenCards;

  public CardPlayer() {
    super("",0);
    this.takenCards = new ArrayList<Card>();
  }

  public CardPlayer(String name, int score, ArrayList<Card> hand) {
    super(name, score);
    this.hand = new ArrayList<Card>();
    this.hand.addAll(hand);
    this.takenCards = new ArrayList<Card>();
  }

  public ArrayList<Card> getHand() {
    return hand;
  }

  public void setHand(ArrayList<Card> hand) {
    this.hand.clear();
    this.hand.addAll(hand);
  }

  public void addCard(Card card) {
    hand.add(card);
  }

  public Card playCard(int index) {
    return hand.remove(index);
  }

  public void setTakenCards(ArrayList<Card> input) {
    takenCards.clear();
    takenCards.addAll(input);
  }

  public void addAll(ArrayList<Card> input) {
    hand.addAll(input);
  }

  public ArrayList<Card> getTakenCards() {
    return takenCards;
  }

  public Card maxValueCard(ArrayList<Card> input) {
    Card highest =  new Card();
    for (int i = 0; i < input.size(); i++) {
      if (input.get(i).getValue() > highest.getValue()) {
        highest.setName(input.get(i).getName());
        highest.setSuit(input.get(i).getSuit());
        highest.setValue(input.get(i).getValue());
      }
    }
    return highest;
  }

  public void addTakenCards(ArrayList<Card> input) {
    takenCards.addAll(input);
  }

  public Card chooseCard(ArrayList<Card> round, ArrayList<Card> game) {
    for (Card card : hand) {
      //If they have the 2 of spades imediately play it
      if (card.getSuit() == "clubs" && card.getValue() == 2) {
        return hand.remove(hand.indexOf(card));
      }
    }
    if (round.isEmpty() && !game.isEmpty()) {
      //If this is the first turn in the round then play any random card
      return hand.remove((int)(Math.random() * hand.size()));
    }
    else {
      ArrayList<Integer> suitSet = new ArrayList<Integer>();
      ArrayList<Integer> heart = new ArrayList<Integer>();
      for (Card card : hand) {
        if (card.getSuit().equals(round.get(0).getSuit())) {
          suitSet.add(hand.indexOf(card));
        }
        else if (card.getSuit().equals("hearts")) {
          heart.add(hand.indexOf(card));
        }
      }
      if (!suitSet.isEmpty()) {
        int index = (int)(Math.random() * suitSet.size());
        return hand.remove((int)suitSet.get(index));
      }
      else if(!heart.isEmpty()) {
        int index = (int)(Math.random() * heart.size());
        return hand.remove((int)heart.get(index));
      }
      else {
        return hand.remove((int)(Math.random() * hand.size()));
      }
    }
  }

  public String toString() {
    Collections.sort(hand);
    //System.out.println("B");
    String temp = "";
    for (Card thing : hand) {
      temp += thing.toString() + ", ";
    }
    if (!temp.isBlank()) {
      temp = temp.substring(0, temp.length()-2);
    }
    return super.toString() + " [" + temp + "]";
  }
}
