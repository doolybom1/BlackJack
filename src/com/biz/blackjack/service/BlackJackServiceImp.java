package com.biz.blackjack.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.biz.blackjack.domain.CardVO;

public class BlackJackServiceImp implements BlackJackService {

	List<CardVO> handList;

	public BlackJackServiceImp() {
		handList = new ArrayList<CardVO>();
	}

	// getCard() method에서 return 한 카드를 받아와서 handList에 넣기
	@Override
	public void cardReceive(CardVO card) {
		handList.add(card);
	}

	// 받은 카드를 표시
	public String receiveCardToString() {
		String hand = "";
		int nSize = handList.size();
		for (int i = 0; i < nSize; i++) {
			hand += handList.get(i) + " ";
		}
		return hand;
	}

	// 카드 숫자 값 계산하기 (CardVO 클래스의 getCardValue() 호출)
	@Override
	public int getSumValue() {
		int valueSum = 0;
		int nSize = handList.size();
		for (int i = 0; i < nSize; i++) {
			CardVO gCard = handList.get(i);
			int cardValue = gCard.getCardValue();
			valueSum += cardValue;
		}
		return valueSum;
	}
}
