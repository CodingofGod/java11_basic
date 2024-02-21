package org.kh.app;

import java.util.Scanner;

//조건문 다단계 if와 
public class Conditino4{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력[0-100] :");
		int point = scan.nextInt();	
		String result;
		
		if(point >= 97) {
			result = "A++";
		} else if(point >= 93) {
			result = "A0";
		} else if(point >= 90) {
			result = "A-";
		} else if(point >= 87) {
			result = "B++";
		} else if(point >= 83) {
			result = "B0";
		} else if(point >= 80) {
			result = "B-";
		} else if(point >= 77) {
			result = "C++";
		} else if(point >= 73) {
			result = "B0";
		} else if(point >= 70) {
			result = "B-";
		} else if(point >= 67) {
			result = "C++";
		} else {
			result = "F";
		}
		 
		case = "A++";
			remakr = "우수상";
			break;
		
		System.out.println("당신의 점수는 "+point+" 입니다");
		System.out.println("당신의 학점은 "+result+" 입니다");
		System.out.println("당신의 시상내역 : "+remakr);
					
		 //점수를 키보드로 입력 받아 판정과 학점 그리고, 시상내용을 쓰시오,
		 //학점(result)은 점수(point)가
		 // 97~100이면 'A++', 93~96이면 'A0', 90~92이면, 'A-', 
		 //87~89이면, 'B++', 83~86이면 'B0', 80~82이면, 'B-',
		 //77~79이면, 'C++', 73~76이면 'C0', 70~72이면, 'C-',
		 //67~69이면, 'D++', 63~66이면 'D0', 60~62이면, 'D-',
		 //60미만이면, 'F'로 하되, 다단계 if와 if/elseif/else 문 활용
		 //시상내용은 학점이 A++이면, '학업우수상', 'A0'이면, '노력상',
		 //'A-' 이면, '아차상'으로 하고, 나머지는 ''으로 하되, switch~case~문 활용
		
	}
}