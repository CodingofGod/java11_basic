package org.kh.app2;
//do~while~ :조건이 만족하지 않더라도 1회 이상 실행을 보장하는 문장
public class Loop5 {
	public static void main(String[] args) {
		int a = 0;
		while(a>10) {
			a++;
			System.out.println(a);
		}
		
		do {
			System.out.println("a="+a);
		} while(a>10);
		
		//역 for문
		for(int wo=10;wo>0;wo--) {
			System.out.println("wo="+wo);
		}
		
		int b = 0;
		for(;;) {	//무한 루프
			b++;
			System.out.println("b="+b);
			if(b>=10) break;
		}
		//카운트 변수  
		int tot = 0;
		for(int j=0;j<=100;j++) {
			if(j%2==1) continue;
			tot+=j;
		}
		System.out.println("tot : "+tot);
		
		int hap = 0;
		for(int k=0;k<=100;k+=2) {
			hap+=k;
		}
		System.out.println("hap : "+hap);
	}

}
