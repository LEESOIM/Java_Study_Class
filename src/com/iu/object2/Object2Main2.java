package com.iu.object2;

import java.util.Scanner;

public class Object2Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1)메서드를 호출하기 위해서는 먼저 객체 생성!
		AnimalSound as = new AnimalSound();
		
		System.out.println("1.댕댕이 2.냥이 3.호랭이");
		int select = sc.nextInt();
		System.out.println("횟수 입력");
		int count = sc.nextInt();
		
		for(int i=0;i<count;i++) {
			if(select==1) {
				as.dogSound(); // 2)메서드 호출
			}else if(select==2) {
				as.catSound();
			}else {
				as.tigerSound();
			}
		}
		
		


	}

}
