package org.kh.app2;
//중첩 for문을 활용한 별 찍기
public class starPrint {
	public static void main(String[] args) {
		/*
		 
		     *
		    ***
		   *****
		  *******
		
		 
		 */
	
		for(int i=0;i<5;i++) { // 0	  1    2    3 =4
			for(int j=0;j<10;j++) {// 0~5 = 6
				System.out.print("*");
			}
			System.out.println();
	    
		}
	
		for(int a=0; a < 7; a++) {
			for(int b=0; b < a; b++) {
				System.out.print("*");
			}	
			System.out.println();
		}

		
		for(int z=6; z >= 0; z--) {
			for(int x=0; x < z; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
}
}


	
	
