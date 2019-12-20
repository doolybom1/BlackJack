package com.biz.blackjack.domain;

public class CardVO {

	private char symbol; // 23456789tkJQ
	private char schd; // SCHD

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public char getSchd() {
		return schd;
	}

	public void setSchd(char schd) {
		this.schd = schd;
	}

	// 카드 합계 계산할때 호출됨
	public int getCardValue() {
		if (symbol == 'T') {
			return 10;
		} else if (symbol == 'J') {
			return 10;
		} else if (symbol == 'Q') {
			return 10;
		} else if (symbol == 'K') {
			return 10;
		} else if (symbol == 'A') {
				return 1;
		} else {
			return Integer.valueOf(symbol+"");
		}
	}

	@Override
	public String toString() {
		return this.schd +""+ this.symbol ;
	}
	
	

}
