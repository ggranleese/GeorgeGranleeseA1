package core;

import junit.framework.TestCase;

public class PlayerTest extends TestCase {
	
	public void testNewRound(){
		Player player = new Player(new Deck());
		player.newRound();
		assertEquals(0, player.getScore());
	}
	
	public void testAddCard(){
		Player player = new Player(new Deck());
		Card card = new Card(1,1);
		player.newRound();
		player.getPlayerDeck().add(card);
		assertTrue(player.getScore() != 0);
	}
	
	public void testBlackjack() {
		Player player = new Player(new Deck());
		player.newRound();
		Card card1 = new Card(1,10);
		Card card2 = new Card(1,1);
		player.getPlayerDeck().add(card1);
		player.getPlayerDeck().add(card2);
		assertEquals(true, player.checkBJ());
		assertEquals(21, player.getScore());
	}
	
	public void testHit() {
		Player player = new Player(new Deck());
		player.newRound();
		Deck deck = new Deck();
		deck.add(new Card(2,5));
		Card card1 = new Card(1,5);
		Card card2 = new Card(1,4);
		player.getPlayerDeck().add(card1);
		player.getPlayerDeck().add(card2);
		int scoreCheck = player.getScore();
		player.hit(deck);
		assertTrue(player.getScore() > scoreCheck);
	}
	
	public void testHitRepeat() {
		Player player = new Player(new Deck());
		player.newRound();
		Deck deck = new Deck();
		deck.add(new Card(2,5));
		deck.add(new Card(2,3));
		Card card1 = new Card(1,5);
		Card card2 = new Card(1,4);
		player.getPlayerDeck().add(card1);
		player.getPlayerDeck().add(card2);
		int scoreCheck1 = player.getScore();
		player.hit(deck);
		int scoreCheck2 = player.getScore();
		player.hit(deck);
		int scoreCheck3 = player.getScore();
		assertTrue(scoreCheck1 < scoreCheck2 && scoreCheck2 < scoreCheck3);
	}
	
	public void testStand(){
		Player player = new Player(new Deck());
		player.newRound();
		Card card1 = new Card(1,5);
		Card card2 = new Card(1,4);
		player.getPlayerDeck().add(card1);
		player.getPlayerDeck().add(card2);
		int scoreCheck = player.getScore();
		player.stand();
		assertEquals(scoreCheck, player.getScore());
	}
}
