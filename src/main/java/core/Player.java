package core;

public class Player {
	
	Deck playerDeck;
	int playerScore;
	boolean stand;
	
	public Player(Deck d) {
		playerDeck = d;
		stand = false;
	}
	
	public void newRound() {
		for(int i=0; i<playerDeck.getCardsRemaining()-1; i++) {
			playerDeck.removeAt(i);
		}
		playerScore = 0;
		
	}
	
	public int getScore() {
		playerScore = 0;
		for(int i=0; i<playerDeck.getCardsRemaining(); i++){
			playerScore += playerDeck.getCard(i).getVal();
		}
		return (playerScore);
	}

	
	public void hit(Deck gameDeck) {
		if(playerScore<21) {
			playerDeck.add(gameDeck.dealCard());
		}
	}
	
	public void stand() {
		stand = true;
	}
	
	public boolean checkBJ() {
		if(playerDeck.getCardsRemaining() > 0) {
			Card card1 = playerDeck.getCard(0);
			Card card2 = playerDeck.getCard(1);
			
			if(card1.getVal() + card2.getVal() == 21) {
				return true;
			}
			
		}
		return false;
		
	}
	
	public boolean checkBust() {
		if(playerScore > 21) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public Deck getPlayerDeck() {
		return playerDeck;
	}

}
