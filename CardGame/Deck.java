import java.util.ArrayList;
import java.util.*;
public class Deck {
  public static final String[] NAMES = {"2","3","4","5","6","7","8","9","T","J","Q","K","A"};
  public static final String[] SUITS = {"clubs", "spades", "hearts", "diamonds"};
  public static final int[] RANKS = {2,3,4,5,6,7,8,9,10,11,12,13,14};
  private ArrayList<Card> deck;
  
  public Deck() {
    initializeDeck();
  }

  public void initializeDeck() {
    deck = new ArrayList<Card>();
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 13; j++) {
        deck.add(new Card(NAMES[j],SUITS[i],RANKS[j]));
      }
    }
  }

  public void shuffle() {
    Collections.shuffle(deck);
  }

  public void shuffle2() {
    ArrayList<Card> temp = new ArrayList<Card>();
    int ammount = (int)(Math.random()*9)+2;
    for (int i = ammount; i >= 0; i--) {
      temp.add(deck.remove(ammount-i));
    }
    int index = (int)(Math.random()*(52-ammount))+1;
    deck.addAll(index, temp);
  }

  public Card getCard(int index) {
    return deck.get(index);
  }

  public ArrayList<Card> getDeck() {
    return deck;
  }

  public void setDeck(ArrayList<Card> input) {
    deck.clear();
    deck.addAll(input);
  }

  public Card dealTopCard() {
    return deck.get(deck.size()-1);
  }

  public void addCard(Card input) {
    deck.add(input);
  }
  
  public Deck topCards(int index){
    Deck sub = new Deck();
    for(int i = 1; i < index; i++) {
      sub.addCard(deck.get(deck.size()-i));
    }
    return sub;
  }

  public String toString() {
    String d = "";
    for (int i = 0; i < deck.size(); i++) {
      d += deck.get(i).toString();
    }
    return "deck -> " + d;
  }
}