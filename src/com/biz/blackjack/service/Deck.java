package com.biz.blackjack.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import com.biz.blackjack.domain.CardVO;

public class Deck {

	CardVO[] cards = new CardVO[52];
	int locate;
	
	// 각각의 배열 요소 초기화
	public Deck() {
		for (int i = 0; i < cards.length; i++) {
			cards[i] = new CardVO(); 			
		}
	}

	// 카드 만들고 shuffleCards method 호출 
	public void creatCard() {
		String symbols = "A23456789TJQK";
		String schd = "SCHD";
		int index = 0;

		for (int i = 0; i < schd.length(); i++) {
			for (int j = 0; j < symbols.length(); j++) {
				CardVO allCard = new CardVO();
				allCard.setSchd(schd.charAt(i));
				allCard.setSymbol(symbols.charAt(j));
				cards[index] = allCard;
				index++;
			}
		}
		this.shuffleCards();
	}
	
	// 카드 뒤섞기 method
	public void shuffleCards() {	
		// shuffle method 사용을 위해서 배열을 List로 변환
		Collections.shuffle(Arrays.asList(cards));
	}
	
	
//	for(CardVO vo : cards) {
//		System.out.print(vo +":");
//	}System.out.println();
	
	
	// 배열 위치를 하나씩 이동하면서 카드 얻기
	public CardVO getCard() {
		CardVO card = cards[locate];
		locate++;
		return card;
	}	
	
}
