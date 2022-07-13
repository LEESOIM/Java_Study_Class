package com.iu.object1.ex1;

import java.util.Scanner;

import com.iu.object3.Account;

public class StudentController {

	//start 메서드 선언
	public void start() {
		
		Student [] students = null;
		Student student = null;
		boolean check = true;
		
		while(check) {
			
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 정보 조회");
			System.out.println("3.학생 정보 검색");
			System.out.println("4.학생 정보 삭제");
			System.out.println("5.학생 정보 추가");
			System.out.println("6.프로그램 종료");
			
			//객체 생성 
			//클래스명 참조변수명 = new 생성자();
			StudentService ss = new StudentService();
			StudentView sv = new StudentView();
			Scanner sc = new Scanner(System.in);
			int select = sc.nextInt();
			
				if(select==1) {
					
					System.out.println(">>학생 정보 입력");
					students = ss.makeStudents(); //멤버메서드 호출 : 참조변수명.멤버메서드명()

				} else if(select==2) {
					
					System.out.println(">>학생 정보 조회");
					sv.view(students); //(인자값) : 메서드를 호출할때 매개변수에 보내는 실제 값(매개변수에 대입하는 값)
					
				} else if(select==3) {
					System.out.println(">>학생 정보 검색");
					
					student = ss.findStudent(students);//students에 들어있는 배열을 보내라
					if(student!=null) {
						sv.view(student);//student에 들어있는 값을 보내라
					}else {
						sv.view("학생 정보 없음");
					}
					
				} else if(select==4) {
					System.out.println(">>학생 정보 삭제");
				} else if(select==5) {
					System.out.println(">>학생 정보 추가");
				} else {
					System.out.println(">>프로그램 종료");
					break;
				}
				System.out.println("--------------");
		}
		
	}
}
