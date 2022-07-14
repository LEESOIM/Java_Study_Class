package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		Student st = new Student(); //객체가 한개만 만들어짐!!
		
		for(int i=0;i<students.length;i++) {
			System.out.println("이름 입력");
			st.setName(sc.next());
			students[i]=st; //같은 Student 타입을 넣는다
			System.out.println(students[i].getName()); //-> 3개의 값을 같은 주소에 담기 때문에 값이 바뀜
		}
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].getName());
		} //하나의 데이터만 담을 수 있다
		
		System.out.println("프로그램 종료");
	}

}
