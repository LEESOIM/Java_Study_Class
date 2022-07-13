package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentController {

	//start 메서드 선언
	public void start() {
		
		boolean check=true;
		while(check) {
			
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 정보 조회");
			System.out.println("3.학생 정보 검색");
			System.out.println("4.학생 정보 삭제");
			System.out.println("5.학생 정보 추가");
			System.out.println("6.프로그램 종료");
			
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			
				if(select==1) {
					System.out.println("1.학생 정보 입력");
				} else if(select==2) {
					System.out.println("2.학생 정보 조회");
				} else if(select==3) {
					System.out.println("3.학생 정보 검색");
				} else if(select==4) {
					System.out.println("4.학생 정보 삭제");
				} else if(select==5) {
					System.out.println("5.학생 정보 추가");
				} else {
					System.out.println("6.프로그램 종료");
					break;
				}
				System.out.println("--------------");
		}
		
	}
}
