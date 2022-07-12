package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		//StudentController의 start 메서드 호출
		StudentController stu = new StudentController();
		stu.start();

		
		System.out.println("프로그램 종료");
	}

}
