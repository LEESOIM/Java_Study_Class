package com.iu.object1.ex1;

import java.util.Scanner;

import javax.security.auth.Subject;

import com.iu.object3.Account;

public class StudentService {
	
	Scanner sc;
	public StudentService() {
		sc = new Scanner(System.in);
	}
	

	//학생수를 입력 받고
	//학생수만큼 정보를 입력 받고
	//학생들을 리턴
	public Student [] makeStudents() { //리턴하려고 하는 데이터타입을 써야한다
										//학생들을 모아놓은 배열로 리턴하라
		
		System.out.println("학생수 입력");
		int count = sc.nextInt();
		Student [] students = new Student[count]; //학생 한명 한명의 정보를 담을 배열 생성
		
		for(int i=0;i<students.length;i++) {
			
			Student student = new Student(); //학생정보 객체생성
			
			System.out.println(i+1+"번째 학생 이름 입력");
			student.name=sc.next();
			System.out.println(i+1+"번째 학생 번호 입력");
			student.num=sc.nextInt();
			System.out.println(i+1+"번째 학생 국어 점수");
			student.kor=sc.nextInt();
			System.out.println(i+1+"번째 학생 영어 점수");
			student.eng=sc.nextInt();
			System.out.println(i+1+"번째 학생 수학 점수");
			student.math=sc.nextInt();
			
//			student.total=student.kor+student.eng+student.math;
//			student.avg=student.total/3;
			student.setTotal();
			
			students[i]=student;
			
//			System.out.println("Name\tNum\tTotal\tAvg");
//			System.out.println(student.name+"\t"+student.num+"\t"+student.total+"\t"+student.avg);
		}
		
		return students;
	}

	
	
	//검색하고 싶은 학생의 번호를 입력 받아서
	//같은 번호의 학생을 찾아서 그 학생 한명을 리턴
	//없으면 null을 리턴
	public Student findStudent(Student [] students) {//매개변수로 학생들의 배열을 받아와라

		System.out.println("학생 번호 입력");
		int num = sc.nextInt();
		Student student=null; //리턴하려는 학생
		
		for(int i=0;i<students.length;i++) {
			if(students[i].num==num) {
				student=students[i];
				return student;
			}
		}
		return student; //null
	}
	
	
	
	//addStudent
	//학생들의 정보를 받아서
	//학생 한명 추가
	//추가된 학생정보 리턴
	public Student [] addStudent(Student [] students) {
		
		Student [] stuCopys = new Student[students.length+1];
		
		for(int i=0; i<students.length;i++) {
			stuCopys[i]=students[i];
		}
		
		Student student = new Student(); //학생정보 객체생성
		
		System.out.println("추가 학생 이름 입력");
		student.name=sc.next();
		System.out.println("추가 학생 번호 입력");
		student.num=sc.nextInt();
		System.out.println("추가 학생 국어 점수");
		student.kor=sc.nextInt();
		System.out.println("추가 학생 영어 점수");
		student.eng=sc.nextInt();
		System.out.println("추가 학생 수학 점수");
		student.math=sc.nextInt();
		student.setTotal();
		
		stuCopys[students.length]=student;
		students=stuCopys;
		
		return students;
		
	}
	
}
