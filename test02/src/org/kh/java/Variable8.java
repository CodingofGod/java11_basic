package org.kh.java;
public class Variable8 {
	public static void main(String[] args) {
		//가변 할당 (동적 할당) : 자료형과 무관하게 해당하는 리터럴(값)에 의해 자료형이 자유롭게 변형되는 할당 방법
		var unm1 = 29.456; //<-리터럴
		var unm2 = 26;
		var unm3 = 'k';
		var unm4 = "강민우";
		var unm5 = true;
		unm1 = 67;
		System.out.println("unm1 : "+unm1);
		System.out.println("unm2 : "+unm2);
		System.out.println("unm3 : "+unm3);
		System.out.println("unm4 : "+unm4);
		System.out.println("unm5 : "+unm5);
	}

}
