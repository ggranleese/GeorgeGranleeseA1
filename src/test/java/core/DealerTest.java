package core;

import junit.framework.TestCase;

public class DealerTest extends TestCase {

	public void testDealerHits() {
		Deck deck = new Deck();
		deck.populate();
		Dealer dealer = new Dealer(new Deck());
		dealer.newRound();
		dealer.hit(deck);
		dealer.hit(deck);
		assertEquals(true, dealer.doesDealerHit());
	}
	
	public void testDealerStands() {
		Deck deck = new Deck();
		deck.add(new Card(1,10));
		deck.add(new Card(1,7));
		Dealer dealer = new Dealer(new Deck());
		dealer.newRound();
		dealer.hit(deck);
		dealer.hit(deck);
		assertEquals(false, dealer.doesDealerHit());
	}
	
	public void testBlackjack(){
		Dealer dealer = new Dealer(new Deck());
		dealer.newRound();
		Card card1 = new Card(1,10);
		Card card2 = new Card(1,1);
		dealer.getDealerDeck().add(card1);
		dealer.getDealerDeck().add(card2);
		assertEquals(true, dealer.checkBJ());
		assertEquals(21, dealer.getScore());
	}
}
