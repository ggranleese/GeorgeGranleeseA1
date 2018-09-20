package core;

import junit.framework.TestCase;

public class GameConsoleTest extends TestCase{

	public void testDealCards() {
		GameConsole game = new GameConsole();
		game.dealCards();
		assertTrue(game.player.getScore() != 0);
		assertTrue(game.dealer.getScore() != 0);
	}
	
	public void testWinner() {
		GameConsole game = new GameConsole();
		game.player.getPlayerDeck().add(new Card(1,10));
		game.player.getPlayerDeck().add(new Card(2,10));
		game.dealer.getDealerDeck().add(new Card(1,11));
		game.dealer.getDealerDeck().add(new Card(1,7));
		
		game.player.stand();
		game.dealer.stand();
		assertEquals("PLAYER WINS", game.checkWinner());
	}
}
