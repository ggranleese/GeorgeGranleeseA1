package core;

import junit.framework.TestCase;

public class DeckTest extends TestCase{
	
	public void testPopulateDeck(){
		Deck deck = new Deck();
		deck.populate();
		assertEquals(52, deck.getCardsRemaining());
	}
	
	public void testAddCard() {
		Deck deck = new Deck();
		Card card = new Card(1,1);
		deck.add(card);
		assertEquals(1, deck.getCardsRemaining());
	}
	
	public void testRemoveCard() {
		Deck deck = new Deck();
		Card card = new Card(1,1);
		deck.add(card);
		deck.remove(card);
		assertEquals(0, deck.getCardsRemaining());
	}
	
	public void testDealCard() {
		Deck deck = new Deck();
		deck.populate();
		assertEquals("HA", deck.dealCard().toString());
	}

	public void testToString() {
		Deck deck = new Deck();
		Card card = new Card(1,1);
		deck.add(card);
		assertEquals("HA\n", deck.toString());
	}

	
}
