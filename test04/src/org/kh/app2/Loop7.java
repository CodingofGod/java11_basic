package org.kh.app2;

import java.util.Random;

public class Loop7 {
	public static void main(String[] args) {
		int min=1, max=45;
		Random r = new Random();
		int val = r.nextInt(max + min) + min;
		System.out.println();
		
		for(int a=0;a<6;a++) {
			int ho = r.nextInt(max + min) + min;
			System.out.print(ho+"\t");
		}
	}

}
