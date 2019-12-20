package com.biz.blackjack.zfortesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Deck3 {

	Random rnd;
	String[] card = new String[] { "A", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "K",
			"Q", "J" };
	String[] figure = new String[] { "diamond", "heart", "Spade", "clover" };

	List<String> cardList;
	//User_DealerVO sum;
	
	public Deck3() {
		rnd = new Random();
		cardList = new ArrayList<String>();
	}

	// 카드 섞는 부분
	public void shuffle() {
		String fc = null;
		
		System.out.println(Integer.valueOf(card[0]));
		for (int i = 0; i < figure.length; i++) {
			for (int j = 0; j < card.length; j++) {
				fc = figure[i] + card[j];
				int a = Integer.valueOf(card[j]);
				System.out.println(a);
				//System.out.println(fc);
				cardList.add(fc);
			}
		}		
		
		Collections.shuffle(cardList);
		System.out.println(cardList);
	}
//	public void cardValue() {
//		BlackJackServiceImp cardV = new BlackJackServiceImp();
//		int total = 0;
//		
//			switch(s) {
//			case "A": total += 1; break;
//			case "two": total += 2; break;
//			case "three": total += 3; break;
//			case "four": total += 4; break;
//			case "five": total += 5; break;
//			case "six": total += 6; break;
//			case "seven": total += 7; break;
//			case "eight": total += 8; break;
//			case "nine": total += 9; break;
//			case "ten": total += 10; break;
//			case "K": total += 10; break;
//			case "Q": total += 10; break;
//			case "J": total += 10; break;
//			
//		}
		
	}

