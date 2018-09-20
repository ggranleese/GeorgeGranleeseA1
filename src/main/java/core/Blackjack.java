package core;

import java.util.Scanner;

public class Blackjack {
	
	public static void main(String args[]) {
		System.out.println("BLACKJACK \n\n");
		while(true) {
			System.out.println("Would you like to use (F)ile or (C)onsole input: ");
			Scanner input = new Scanner(System.in);
			String choice = "";
			if(input.hasNext()) {
				choice = input.nextLine();
			}
			
			
			if(choice.equals("f") || choice.equals("F")) {
				GameFileInput game = new GameFileInput();
				game.dealCards();
				
			}else if(choice.equals("c") || choice.equals("C")) {
				GameConsole game = new GameConsole();
				game.dealCards();
				
			}
		}
	}
}
