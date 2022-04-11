import java.util.*;
public class CardPlayerLevel1 extends CardPlayer {

  public CardPlayerLevel1(String name, int score, ArrayList<Card> hand) {
    super(name, score, hand);
  }

  public Card chooseCard(ArrayList<Card> round, ArrayList<Card> game) {
    ArrayList<Card> hand = new ArrayList<Card>(getHand());
    for (Card card : hand) {
      //If they have the 2 of spades imediately play it
      if (card.getSuit() == "clubs" && card.getValue() == 2) {
        return playCard(hand.indexOf(card));
      }
    }
    if (round.isEmpty() && !game.isEmpty()) {
      //If this is the first turn in the round then play any random card
      return playCard((int)(Math.random() * hand.size()));
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
        return playCard((int)suitSet.get(index));
      }
      for (int i = 0; i < hand.size(); i++) {
        if (hand.get(i).getSuit().equals("spades") && hand.get(i).getValue() == 12) {
          return playCard(i);
        }
      }
      if(!heart.isEmpty()) {
        int index = 0;
        for (int i = 0; i < heart.size(); i++) {
          int highest = 0;
          if (hand.get((int)heart.get(i)).getValue() > highest) {
            highest = hand.get((int)heart.get(i)).getValue();
            index = i;
          }
        }
        return playCard((int)heart.get(index));
      }
      else {
        return playCard((int)(Math.random() * hand.size()));
      }
    }
  }
}
