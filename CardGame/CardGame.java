import java.util.*;
public class CardGame { 

  private Deck deckOfCards = new Deck();
  private String nameOfGame;
  private ArrayList<CardPlayer> players = new ArrayList<CardPlayer>();
  private int numberOfPlayers;
  private int currentPlayer;

  public CardGame(String game, int numberOf, String[] names, int current) {
    nameOfGame = game;
    numberOfPlayers = numberOf;
    currentPlayer = current;
    for (int i = 0; i < numberOfPlayers; i++) {
      players.add(new CardPlayer());
    }
    for (int i = 0; i < players.size(); i ++) {
      players.get(i).setName(names[i]);
    }
    deckOfCards.initializeDeck();
  }

  public Deck getDeckOfCards() {
    return deckOfCards;
  }

  public CardPlayer getPlayer(int index) {
    return players.get(index);
  }  

  /*public void initializeDeck() {
    for (int i = 0; i < 52; i++) {
      String s = "diamonds";
      String n = i+1%14 + "";
      if (Integer.valueOf(n) > 10) {
        switch (Integer.valueOf(n)) {
          case 11:
            n = "J";
            break;
          case 12:
            n = "Q";
            break;
          case 13:
            n = "K";
            break;
          case 14:
            n = "A";
            break;
        }
      }
      if (i == 13) {
        s = "hearts";
      }
      else if (i == 26) {
        s = "spades";
      }
      else if (i == 39) {
        s = "clubs";
      }
      deckOfCards.addCard(new Card(n, s, i+1%14));
    }
  }*/

  public int getNumberOfPlayers() {
    return numberOfPlayers;
  }

  public int getCurrentPlayer() {
    return currentPlayer;
  }

  public ArrayList<CardPlayer> getPlayers() {
    return players;
  }

  public String getNameOfGame() {
    return nameOfGame;
  }

  public void setDeckOfCards(Deck input) {
    deckOfCards = input;
  }

  public void setCurrentPlayers(int input) {
    currentPlayer = input;
  }

  public void setNumberOfPlayers(int input1) {
    numberOfPlayers = input1;
  }

  public void setPlayers(ArrayList<CardPlayer> input){
    players = input;
  }

  public void setNameOfGame (String input){
    nameOfGame = input;
  }

  
  public void deal(int numOfCardsToDeal, int playerIndex){
    players.get(playerIndex).addAll(deckOfCards.topCards(numOfCardsToDeal).getDeck());
  }

  public void playGame() {
    for(int i = 0; i < numberOfPlayers; i++){
      for(int k = 0; k < players.get(i).getHand().size(); k++){
        if(players.get(i).getHand().get(k).toString().equals("c2(2)")){
          currentPlayer = i;
        }
      }
    }
    ArrayList<Card> game = new ArrayList<Card>();
    ArrayList<Card> round = new ArrayList<Card>();
    int firstPlayer = currentPlayer;
    for(int l = 0; l < 13; l++){
      round.clear();
      for (int i = 0; i < players.size(); i++) {
        Card temp = players.get(currentPlayer).chooseCard(round, game);
        round.add(temp);
        currentPlayer--;
        if (currentPlayer == -1) {
          currentPlayer = players.size()-1;
        }
      }
      int highestNumber = 0, index = 0;
      for(int i = 0; i < round.size(); i++){
        if(round.get(0).getSuit().equals(round.get(i).getSuit()) && round.get(i).getValue() > highestNumber){
          highestNumber = round.get(i).getValue();
          index = i;
          currentPlayer = (index + firstPlayer) % players.size();
        }
      }
      players.get(currentPlayer).addTakenCards(round);
      game.addAll(round);
    }
    Card queen = new Card("Q", "spades", 12);
    for (int i = 0; i < players.size(); i++) {
      CardPlayer current =  players.get(i);
      if (current.getTakenCards().contains(queen)) {
        players.get(i).updateScore(13);
      }
      //System.out.println("T: "+players.get(i).getTakenCards() + " | i: "+i);
      for (int k = 0; k < current.getTakenCards().size(); k++) {
        if (current.getTakenCards().get(k).getSuit().equals("hearts") ) {
          players.get(i).updateScore(1);
        }
      }
    }
  }
  
  public String toString(){
    String names = "";
    for (int i = 0; i < players.size(); i++) {
      names += players.get(i).toString() + "\n";
    }
    return "***"+nameOfGame+"***\n" + names + deckOfCards.toString();
  }
}