package com.biz.blackjack.exec;

import java.util.Scanner;

import com.biz.blackjack.service.BlackJackService;
import com.biz.blackjack.service.BlackJackServiceImp;
import com.biz.blackjack.service.Deck;

public class BlackJackEx {
	public static void main(String[] args) {

		Deck d = new Deck();
		d.creatCard();
		
		BlackJackService dealer = new BlackJackServiceImp();
		BlackJackService user = new BlackJackServiceImp();

		user.cardReceive(d.getCard());
		dealer.cardReceive(d.getCard());

		user.cardReceive(d.getCard());
		dealer.cardReceive(d.getCard());

		
		while (true) {
			int users = user.getSumValue();
			int dealers = dealer.getSumValue();
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("현재 유저카드:" + user.receiveCardToString());
			System.out.println("유저카드 합계:" + user.getSumValue());
			System.out.println("현재 딜러카드:" + dealer.receiveCardToString());
			System.out.println("딜러카드 합계:" + dealer.getSumValue());
			System.out.println("Hit[H] and Stay[S]");

			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("H")) {
				user.cardReceive(d.getCard());
				if (dealers <= 16) {
					dealer.cardReceive(d.getCard());
				}
			} else if(input.equalsIgnoreCase("S")){
				if (users > 21 && dealers > 21) {
					System.out.println("버스트로 딜러승리");
				} else if (users == dealers) {
					System.out.println("무승부");
				} else if (users > 21 || (dealers < 21 && users < 21 && dealers > users)) {
					System.out.println("딜러승리");
				} else if (users > dealers || dealers > 21) {
					System.out.println("유저승리");
				} 
				break;
			} else {
				System.out.println("H 와 S 둘중 하나의 값만을 입력해주세요");
				System.out.println();
			}
		}
	}
}
