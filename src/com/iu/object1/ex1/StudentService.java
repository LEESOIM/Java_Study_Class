package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {
	
	Scanner sc;
	public StudentService() {
		sc = new Scanner(System.in);
	}
	

	//학생수를 입력 받고
	//학생수만큼 정보를 입력 받고
	//학생들을 리턴
	public Student [] makeStudents() { //리턴하려고 하는 데이터타입을 써야한다 -> 학생들을 모아놓은 배열로 리턴하라
		
		System.out.println("학생수 입력");
		int count = sc.nextInt();
		Student [] students = new Student[count]; //학생 한명 한명의 정보를 담을 배열 생성
		
		for(int i=0;i<students.length;i++) {
			
			Student student = new Student(); //학생정보 객체생성
			
			System.out.println(i+1+"번째 학생 이름 입력");
			student.setName(sc.next());
			System.out.println(i+1+"번째 학생 번호 입력");
			student.setNum(sc.nextInt());
			System.out.println(i+1+"번째 학생 국어 점수");
			student.setKor(sc.nextInt());
			System.out.println(i+1+"번째 학생 영어 점수");
			student.setEng(sc.nextInt());
			System.out.println(i+1+"번째 학생 수학 점수");
			student.setMath(sc.nextInt());
			
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
		Student student=null; //리턴하려는 기본값
		
		for(int i=0;i<students.length;i++) {
			if(students[i].getNum()==num) {
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
		student.setName(sc.next());
		System.out.println("추가 학생 번호 입력");
		student.setNum(sc.nextInt());
		System.out.println("추가 학생 국어 점수");
		student.setKor(sc.nextInt());
		System.out.println("추가 학생 영어 점수");
		student.setEng(sc.nextInt());
		System.out.println("추가 학생 수학 점수");
		student.setMath(sc.nextInt());
		student.setTotal();
		
		stuCopys[students.length]=student; //students의 배열길이는 copys의 마지막 인덱스 번호와 같다
		students=stuCopys;
		
		return students;
		
	}
	
	
	
	//removeStudent
	//학생들의 정보를 받아서
	//삭제하려는 학생의 번호를 입력받음
	//번호와 일치하는 학생을 삭제
	//남은 학생정보들을 리턴
	public Student [] removeStudent(Student [] students) {
		
		System.out.println("삭제할 학생 번호");
		int num = sc.nextInt();
		boolean flag=false;
		int i=0;
		for(i=0; i<students.length;i++) {
			if(students[i].getNum()==num) {
				flag=!flag;
				break;
			}
		}if(flag) {
			Student [] stuCopys = new Student[students.length-1];
			
			int index=0;
			for(int j=0;j<students.length;j++) {
				if(j==i) {
					continue; //조건식을 실행하지 말고 바로 증감식으로 넘어가라
				}
				stuCopys[index]=students[j];
				index++;
			}
			
			students = stuCopys;
		}
		return students;
	}
	
}
