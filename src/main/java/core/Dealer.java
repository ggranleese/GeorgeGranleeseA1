package core;

public class Dealer{
	
	Deck dealerDeck;
	int dealerScore;
	
	public Dealer(Deck d) {
		dealerDeck = d;
		
	}
	
	public void newRound() {
		for(int i=0; i<dealerDeck.getCardsRemaining()-1; i++) {
			dealerDeck.removeAt(i);
		}
		dealerScore = 0;
	}
	
	public int getScore() {
		dealerScore = 0;
		for(int i=0; i<dealerDeck.getCardsRemaining(); i++) {
			dealerScore += dealerDeck.getCard(i).getVal();
		}
		return(dealerScore);
	}
	
	public void hit(Deck gameDeck) {
		if(dealerScore<21) {
			dealerDeck.add(gameDeck.dealCard());
		}
	}
	
	public int stand() {
		return dealerScore;
	}
	
	public boolean checkBJ() {
		if(dealerDeck.getCardsRemaining() > 0) {
			Card card1 = dealerDeck.getCard(0);
			Card card2 = dealerDeck.getCard(1);
			
			if(card1.getVal() + card2.getVal() == 21) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkBus() {
		if(dealerScore > 21) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean doesDealerHit() {
		if(dealerScore <=16) {
			return true;
		}else {
			return false;
		}
	}
	
	public Deck getDealerDeck() {
		return dealerDeck;
	}

}







