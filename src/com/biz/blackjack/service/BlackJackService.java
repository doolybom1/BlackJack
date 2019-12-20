package com.biz.blackjack.service;

import com.biz.blackjack.domain.CardVO;

public interface BlackJackService {
	// 카드 받아오기
	public void cardReceive(CardVO card);
	
	// 카드 합계 계산하기
	public int getSumValue();
	
	// 받은카드 화면에 표시하기
	public String receiveCardToString();
}
