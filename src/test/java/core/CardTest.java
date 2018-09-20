package core;

import junit.framework.TestCase;

public class CardTest extends TestCase {
	
	public void testgetVal(){
		Card card1 = new Card(1,5);
		Card card2 = new Card(1,13);
		assertEquals(5, card1.getVal());
		assertEquals(10, card2.getVal());
	}
	
	public void testToString() {
		Card card1 = new Card(1,13);
		Card card2 = new Card(2, 2);
		assertEquals("HK", card1.toString());
		assertEquals("D2", card2.toString());
	}
	
	public void testAceVal() {
		Card card = new Card(1,1);
		assertEquals(1, card.getVal());
	}
	
	public void testFaceVal() {
		Card jack = new Card(1, 11);
		Card queen = new Card(1, 12);
		Card king = new Card(1, 13);
		
		assertEquals(10, jack.getVal());
		assertEquals(10, queen.getVal());
		assertEquals(10, king.getVal());
		
	}
}
