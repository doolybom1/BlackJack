package com.biz.blackjack.zfortesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/*
 * 조커를 제외한 카드 총 52장
 * 처음 시작할때 카드 2장을 유저와 딜러에게 
 */
public class Card6 {

	Random rnd;
	String[] shape = new String[] { "heart", "space", "clover", "dia" };
	String[] kjq = new String[] { "K", "J", "Q" }; // 11,12,13
	List<String> card = new ArrayList<String>();
	//User user = new User();
	int tempSum = 0;

	// 초기 카드2장 뒤섞어서 주기
	public void mingle() {
		rnd = new Random();
		String nCard = "";
		String kjqCard = "";
		int shapeLocate = 0;
		int num = 0;

		for (int i = 0; i < 2; i++) {
			num = rnd.nextInt(12) + 2;
			shapeLocate = rnd.nextInt(shape.length);
			nCard = shape[shapeLocate] + num;
			if (num == 11) {
				kjqCard = kjq[0];
				nCard = kjqCard + shape[shapeLocate];
				num = 10;
			} else if (num == 12) {
				kjqCard = kjq[1];
				nCard = kjqCard + shape[shapeLocate];
				num = 10;
			} else if (num == 13) {
				kjqCard = kjq[2];
				nCard = kjqCard + shape[shapeLocate];
				num = 10;
			}
			tempSum += num;

			card.add(nCard);

		}
		int nSize = card.size();
		for (int i = 0; i < nSize; i++) {
			String vo = card.get(i);
			System.out.print("[" + vo + "]" + " ");
		}
	}

}
