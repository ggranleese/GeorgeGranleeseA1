package core;

import java.io.File;
import java.util.Scanner;

public class GameFileInput extends GameConsole{
	
	Dealer dealer;
	Player player;
	Deck gameDeck;
	
	public GameFileInput() {
		dealer = new Dealer(new Deck());
		player = new Player(new Deck());
		gameDeck = new Deck();
		readFile();
		dealCards();
		
	}
	
	
	public void readFile() {
		System.out.println("Please enter the file you wish to use: ");
		String filePath = takeUserInput();
		Scanner file = null;
		String readFile = "";
		String[] cards;
		
		try {
			file = new Scanner(new File(filePath));
		}catch(Exception e) {
			System.out.println("ERROR: FILE NOT FOUND");
		}
		
		while(file.hasNext()){
			readFile += (file.next() + " ");
		}
		
		cards = readFile.split(" ");
		
		for(int i=0; i<cards.length; i++) {
			
			if(cards[i].startsWith("H")){
				
				if(cards[i].endsWith("A")) {
					gameDeck.add(new Card(1,1));
					
				}else if(cards[i].endsWith("2")) {
					gameDeck.add(new Card(1,2));
					
				}else if(cards[i].endsWith("3")) {
					gameDeck.add(new Card(1,3));
					
				}else if(cards[i].endsWith("4")) {
					gameDeck.add(new Card(1,4));
					
				}else if(cards[i].endsWith("5")) {
					gameDeck.add(new Card(1,5));
					
				}else if(cards[i].endsWith("6")) {
					gameDeck.add(new Card(1,6));
					
				}else if(cards[i].endsWith("6")) {
					gameDeck.add(new Card(1,6));
					
				}else if(cards[i].endsWith("7")) {
					gameDeck.add(new Card(1,7));
					
				}else if(cards[i].endsWith("8")) {
					gameDeck.add(new Card(1,8));
					
				}else if(cards[i].endsWith("9")) {
					gameDeck.add(new Card(1,9));
					
				}else if(cards[i].endsWith("10")) {
					gameDeck.add(new Card(1,10));
					
				}else if(cards[i].endsWith("J")) {
					gameDeck.add(new Card(1,11));
					
				}else if(cards[i].endsWith("Q")) {
					gameDeck.add(new Card(1,12));
					
				}else if(cards[i].endsWith("K")) {
					gameDeck.add(new Card(1,13));
					
				}
				
			}else if(cards[i].startsWith("D")) {
				
				if(cards[i].endsWith("A")) {
					gameDeck.add(new Card(2,1));
					
				}else if(cards[i].endsWith("2")) {
					gameDeck.add(new Card(2,2));
					
				}else if(cards[i].endsWith("3")) {
					gameDeck.add(new Card(2,3));
					
				}else if(cards[i].endsWith("4")) {
					gameDeck.add(new Card(2,4));
					
				}else if(cards[i].endsWith("5")) {
					gameDeck.add(new Card(2,5));
					
				}else if(cards[i].endsWith("6")) {
					gameDeck.add(new Card(2,6));
					
				}else if(cards[i].endsWith("6")) {
					gameDeck.add(new Card(2,6));
					
				}else if(cards[i].endsWith("7")) {
					gameDeck.add(new Card(2,7));
					
				}else if(cards[i].endsWith("8")) {
					gameDeck.add(new Card(2,8));
					
				}else if(cards[i].endsWith("9")) {
					gameDeck.add(new Card(2,9));
					
				}else if(cards[i].endsWith("10")) {
					gameDeck.add(new Card(2,10));
					
				}else if(cards[i].endsWith("J")) {
					gameDeck.add(new Card(2,11));
					
				}else if(cards[i].endsWith("Q")) {
					gameDeck.add(new Card(2,12));
					
				}else if(cards[i].endsWith("K")) {
					gameDeck.add(new Card(2,13));
					
				}
				
			}else if(cards[i].startsWith("S")) {
				
				if(cards[i].endsWith("A")) {
					gameDeck.add(new Card(3,1));
					
				}else if(cards[i].endsWith("2")) {
					gameDeck.add(new Card(3,2));
					
				}else if(cards[i].endsWith("3")) {
					gameDeck.add(new Card(3,3));
					
				}else if(cards[i].endsWith("4")) {
					gameDeck.add(new Card(3,4));
					
				}else if(cards[i].endsWith("5")) {
					gameDeck.add(new Card(3,5));
					
				}else if(cards[i].endsWith("6")) {
					gameDeck.add(new Card(3,6));
					
				}else if(cards[i].endsWith("6")) {
					gameDeck.add(new Card(3,6));
					
				}else if(cards[i].endsWith("7")) {
					gameDeck.add(new Card(3,7));
					
				}else if(cards[i].endsWith("8")) {
					gameDeck.add(new Card(3,8));
					
				}else if(cards[i].endsWith("9")) {
					gameDeck.add(new Card(3,9));
					
				}else if(cards[i].endsWith("10")) {
					gameDeck.add(new Card(3,10));
					
				}else if(cards[i].endsWith("J")) {
					gameDeck.add(new Card(3,11));
					
				}else if(cards[i].endsWith("Q")) {
					gameDeck.add(new Card(3,12));
					
				}else if(cards[i].endsWith("K")) {
					gameDeck.add(new Card(3,13));
					
				}
			}else{
				
				if(cards[i].endsWith("A")) {
					gameDeck.add(new Card(4,1));
					
				}else if(cards[i].endsWith("2")) {
					gameDeck.add(new Card(4,2));
					
				}else if(cards[i].endsWith("3")) {
					gameDeck.add(new Card(4,3));
					
				}else if(cards[i].endsWith("4")) {
					gameDeck.add(new Card(4,4));
					
				}else if(cards[i].endsWith("5")) {
					gameDeck.add(new Card(4,5));
					
				}else if(cards[i].endsWith("6")) {
					gameDeck.add(new Card(4,6));
					
				}else if(cards[i].endsWith("6")) {
					gameDeck.add(new Card(4,6));
					
				}else if(cards[i].endsWith("7")) {
					gameDeck.add(new Card(4,7));
					
				}else if(cards[i].endsWith("8")) {
					gameDeck.add(new Card(4,8));
					
				}else if(cards[i].endsWith("9")) {
					gameDeck.add(new Card(4,9));
					
				}else if(cards[i].endsWith("10")) {
					gameDeck.add(new Card(4,10));
					
				}else if(cards[i].endsWith("J")) {
					gameDeck.add(new Card(4,11));
					
				}else if(cards[i].endsWith("Q")) {
					gameDeck.add(new Card(4,12));
					
				}else if(cards[i].endsWith("K")) {
					gameDeck.add(new Card(4,13));
					
				}
			}
				
			
		}
		
	}
	

}

