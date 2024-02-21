package org.kh.java;
public class Variable7 {
	public static void main(String[] args) {
		String name = "강민우";
		//Integer age = 26;
		Integer age = 26;
		String age2 = "26";
		int age3 = Integer.parseInt(age2) + 8;
		Float height = 173.6f;
		String height2 = "173.6";
		float height3 = Float.parseFloat(height2);
		//boolean pass = true;
		Double weight = 69.3;
		System.out.println("age : "+age3);
		System.out.println("name : "+name.getClass().getName());
		System.out.println("age : "+age.getClass().getName());
		System.out.println("height : "+height.getClass().getName());
		System.out.println("weight : "+weight.getClass().getName());
		//primitive type => Wrapper type = boxing
		//Wrapper type => primitive type = noboxing 
	}

}
