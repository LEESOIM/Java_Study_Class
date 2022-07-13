package com.iu.object3;

public class Count {
	//Method OverLoading
	//같은 이름의 메서드를 여러개 만드는것
	//매개변수의 갯수나, 타입의 구성이 달라야 함
	
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void hap(int num1, double num2) {
		System.out.println(num1*num2);
	}
	
	public void hap(int num1, int num2, int num3) {
		System.out.println();
	}
	
//	public void hap(int num2, int num1) {  중복선언
//	}
}
