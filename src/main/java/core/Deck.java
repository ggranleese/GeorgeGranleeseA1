package core;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private ArrayList<Card> cards;
	
	
	public Deck() {
		cards = new ArrayList<Card>();
	}
	
	public void populate() {
		while(cards.size()<52) {
			for(int i=1; i<=4; i++) {
				for (int j=1; j<=13; j++) {
					cards.add(new Card(i,j));
				}
			}
		}
	}
	
	public int getCardsRemaining() {
		return(cards.size());
	}
	
	public void add(Card c) {
		cards.add(c);
	}
	
	public void remove(Card c) {
		cards.remove(c);
	}
	
	public void removeAt(int i) {
		cards.remove(i);
	}
	
	public Card getCard(int i) {
		return(cards.get(i));
	}
	
	public Card dealCard() {
		Card deal = cards.get(0);
		cards.remove(deal);
		return(deal);
	}
	
	public String toString() {
		String toString = "";
		for(int i=0; i<cards.size(); i++) {
			toString += cards.get(i).toString();
			toString += "\n";
		}
		
		return(toString);
	}
	
	public void shuffle(){
		ArrayList<Card> hold = new ArrayList<Card>();
		Random randomizer = new Random();
		
		for(int i=0; i<52; i++) {
			boolean doubles = false;
			int newIndex = randomizer.nextInt(52);
			
			for(int j=0; j<hold.size(); j++) {
				if(hold.get(j) == cards.get(newIndex)) {
					doubles = true;
				}
			}
			
			if(doubles == false) {
				
				hold.add(cards.get(newIndex));
			
				
			}else {
				i--;
			}
		}
		
		cards = hold;
		
	}

}
