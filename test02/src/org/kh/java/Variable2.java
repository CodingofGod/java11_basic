package org.kh.java;

public class Variable2 {
	public static void main(String[] args) {
		byte b = 10;	//선언(O), 초기화(o)
		short s = 20;
		int i;	//선언(O), 초기화(x) =>
		//초기화 하지 않은 상태그대로 출력시 Null pointer 오류를 일으킴
		long l;
		i = 30; //초기화
		l = 40; //초기화
		System.out.println("b="+b);
		System.out.println("s="+s);
		System.out.println("i="+i);
		System.out.println("l="+l);
		//b = 130; Overflow
		//b = -130; Underflow

	}

}
