package com.biz.blackjack.zfortesting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Card3 {

	Random rnd;
	String[] card = new String[] { "A", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "K",
			"Q", "J" };
	List<String> duplCardDelete;
	String[] figure = new String[] { "diamond", "heart", "Spade", "clover" };
	List<String> duplFigureDelete;
	
	public Card3() {
		rnd = new Random();
		duplCardDelete = new ArrayList<String>();
		duplFigureDelete = new ArrayList<String>();
	}

	public void shuffle() {
		int UcardShuffle = 0;
		int UfigureShuffle = 0;
		int rndValue = 13;
		
		int DcardShuffle = 0;
		int DfigureShuffle = 0;
		int rndValue2 = 3;
		
		
		Collections.addAll(duplCardDelete, card);
		Collections.addAll(duplFigureDelete,figure);
		System.out.print(duplFigureDelete);
		System.out.println(duplCardDelete);
		
		
		int nSize2 = duplFigureDelete.size();
		int nSize = duplCardDelete.size();
		for(int i = 0 ; i < nSize2 ; i++) {
			DcardShuffle = rnd.nextInt(rndValue2);
			System.out.print(duplFigureDelete.get(DcardShuffle));
			duplFigureDelete.remove(DcardShuffle);
			System.out.println(duplFigureDelete);
			for(int j = 0 ; j < nSize+1 ;j++) {
				UcardShuffle = rnd.nextInt(rndValue);
				System.out.print(duplCardDelete.get(UcardShuffle));
				duplCardDelete.remove(UcardShuffle);
				System.out.println(duplCardDelete);
				nSize--;
				rndValue--;
				j=0;
			}
			Collections.addAll(duplCardDelete, card);
			nSize2--;
			rndValue2--;
			i = 0;
		}
		
//		Collections.addAll(duplCardDelete, card);
//		System.out.println(duplCardDelete);
//		int nSize = duplCardDelete.size();
//		for (int i = 0; i < nSize; i++) {
//			UcardShuffle = rnd.nextInt(rndValue);
//			System.out.println(UcardShuffle);
//			duplCardDelete.remove(UcardShuffle);
//			System.out.println(duplCardDelete);
//			nSize--;
//			rndValue--;
//			i = 0;
//		}
//		System.out.println();
//		
//		Collections.addAll(duplFigureDelete,figure);
//		System.out.println(duplFigureDelete);
//		int nSize2 = duplFigureDelete.size();
//		for(int j = 0 ; j < nSize2 ;j++) {
//			DcardShuffle = rnd.nextInt(rndValue2);
//			System.out.println(DcardShuffle);
//			duplFigureDelete.remove(DcardShuffle);
//			System.out.println(duplFigureDelete);
//			nSize2--;
//			rndValue2--;
//			j = 0;
//		}
		
	}
}
