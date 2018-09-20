package core;

import java.util.Scanner;

public class GameConsole {
	Dealer dealer;
	Player player;
	Deck gameDeck;
	
	public GameConsole() {
		dealer = new Dealer(new Deck());
		player = new Player(new Deck());
		gameDeck = new Deck();
		gameDeck.populate();
		gameDeck.shuffle();
	}
	
	
	public String takeUserInput() {
		Scanner input = new Scanner (System.in);
		if(input.hasNext()) {
			return(input.nextLine());
		}
		
		return("ERROR");
	}
	
	public void dealCards() {
		
		for(int i=0; i<2; i++) {
			player.getPlayerDeck().add(gameDeck.dealCard());
			System.out.println(player.getPlayerDeck().getCard(i));;
		}
		System.out.println("Player Score: " + player.getScore());
		
		for(int i=0; i<2; i++) {
			dealer.getDealerDeck().add(gameDeck.dealCard());
			if(!dealer.isCardHidden()) {
				System.out.println(dealer.getDealerDeck().getCard(i));
			}
		}
		
		System.out.println("Dealer Score: " + dealer.getDealerDeck().getCard(0).getVal());
		
		playRound();
		
		
			
		
	}
	
	public void playRound() {
		
		while(true) {
			if(player.getScore() == 21) {
				dealerRound();
				break;
				
			}else if(player.getScore() > 21) {
				System.out.println("\n");
				checkWinner();
				break;
			}else{
				System.out.println("\n (H)it or (S)tand? \n $:");
				String next = takeUserInput();
				if(next.equals("h") || next.equals("H")) {
					
					if(player.getScore()<21) {
						player.hit(gameDeck);
						System.out.println(player.getPlayerDeck().getCard(0));
						System.out.println("\n PlayerScore: " + player.getScore());
						
					}else if(player.getScore() == 21 || player.stand) {
						dealerRound();
						break;
					}
				}else if(next.equals("s") || next.equals("S")) {
					dealerRound();
					break;
				}
			}
			

		}

	}
	
	public void dealerRound(){
		
		if(player.getScore() == 21) {
			for(int i=0; i<dealer.getDealerDeck().getCardsRemaining()-1; i++) {
				System.out.println(dealer.getDealerDeck().getCard(i));
			}
			System.out.println("\n DEALER SCORE: " + dealer.getScore());
			System.out.println("\n");
			System.out.println(checkWinner());
			
		}else{
			System.out.println("\n Dealer Score: " + dealer.getScore());
			while(true) {
				
				if(dealer.doesDealerHit()) {
					dealer.hit(gameDeck);
					System.out.println(dealer.getDealerDeck().getCard(0));
					System.out.println("\nDealer Score: " + dealer.getScore());
				}else {
					System.out.println("\n");
					System.out.println(checkWinner());
					break;
				}
			}
		}
		
		
	}
	
	
	public String checkWinner() {
		if(!player.checkBJ() && !dealer.checkBJ()) {
			
			if(player.getScore() == dealer.getScore()) {
				return("PUSH");
				
			}else if(!player.checkBust() && dealer.checkBust()) {
				return("PLAYER WINS");
				
			}else if(player.checkBust()) {
				return("DEALER WINS");
				
			}else if(player.getScore() > dealer.getScore()) {
				return("PLAYER WINS");
				
			}else if(player.getScore() < dealer.getScore()) {
				return("DEALER WINS");
			}
			
			
			
		}else if(player.checkBJ() && dealer.checkBJ()){
			return("DEALER WINS");
			
		}else if(player.checkBJ() && !dealer.checkBJ()) {
			return("PLAYER WINS");
		}
		
		return ("error");	
	}
}
