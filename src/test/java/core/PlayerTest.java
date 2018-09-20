package core;

import junit.framework.TestCase;

public class PlayerTest extends TestCase {
	
	public void testNewRound(){
		Player player = new Player();
		player.newRound();
		assertEquals(0, player.getScore());
	}
	
	public void testAddCard(){
		Player player = new Player();
		Card card = new Card(1,1);
		player.newRound();
		player.add(card);
		assertTrue(player.getScore() != 0);
	}
	
	public void testBlackjack() {
		Player player = new Player();
		player.newRound();
		Card card1 = new Card(1,10);
		Card card2 = new Card(1,1);
		player.add(card1);
		player.add(card2);
		assertEquals(true, player.checkBJ());
		assertEquals(21, player.getScore());
	}
	
	public void testHit() {
		Player player = new Player();
		player.newRound();
		Card card1 = new Card(1,5);
		Card card2 = new Card(1,4);
		player.add(card1);
		player.add(card2);
		int scoreCheck = player.getScore();
		player.hit();
		assertTrue(player.getScore() > scoreCheck);
	}
	
	public void testStand(){
		Player player = new Player();
		player.newRound();
		Card card1 = new Card(1,5);
		Card card2 = new Card(1,4);
		player.add(card1);
		player.add(card2);
		int scoreCheck = player.getScore();
		player.stand();
		assertEquals(scoreCheck, player.getScore());
	}
}
