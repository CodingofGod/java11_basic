package org.kh.app2;
//반복문 : for, while, do~while~
public class Loop1 {
	public static void main(String[] args) {
		/* 조건식이 참 일때 동안만 반복수행한다.
		  for (ⓐ초기식;ⓑ조건식;ⓒ증감식){ ⓓ반복해야할문장; }
		  ⓐ-> ⓑ -> ⓒ -> ⓓ
		 */
		int n = 0;
		for(int i=0;i<10;i++) { //0 1 2 3 4 5 6 7 8 9 10
			n = n + 1;			//1 2 3 4 5 6 7 8 9 10
		}
		System.out.println("n="+n);
		
		int[] nums = {80,95,75,60,100,65,70,90,85,55}; //배열 0부터 시작 연속 적인 기억
				//80: nums[0] 95: nums[1]
				//index(순번) : 0~9
				//nums[10] : 없는데 요구하는 에러
				//
		String names[] = {"강","김","이","박","유","오","배","장","계","정"};
		int total = 0;
		int max=0, min=nums[0];
		
		System.out.println("이름\t점수\t학점\t판정");
		
		for(int i=0;i<10;i++) {
			total += nums[i]; // tot = tot + nums[i];
			System.out.print(names[i]+"\t");
			System.out.print(nums[i]+"\t");
			
			if(nums[i]>=90) {
				System.out.print("A\t");
			} else if (nums[i]>=80) {
				System.out.print("B\t");
			} else if (nums[i]>=70) {
				System.out.print("C\t");
			} else if (nums[i]>=70) {
				System.out.print("D\t");
			} else {
				System.out.print("F\t");
			}
			if(nums[i]>=70) {
				System.out.println("합격\n");
			} else {
				System.out.println("불합격\n");
			}

			
			 if(nums[i]>max) max=nums[i];
			 if(nums[i]<min) min=nums[i];

				
		}
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+(total/10.0f));
		System.out.println("최대 점수 : "+ max);
		System.out.println("최소 점수 : "+ min);
	}
}			
		
		//평균, 학점, 최대, 최소	, 총점
