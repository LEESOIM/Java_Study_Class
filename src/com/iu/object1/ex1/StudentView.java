package com.iu.object1.ex1;


public class StudentView {
	
	//viewAll 메서드
	//학생들의 모든 정보를 받아서 출력
	public void view(Student [] students) { //학생들의 정보를 배열로 받는다는 뜻
		System.out.println("Name\tNum\t국어\t영어\t수학\tTotal\tAvg");
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].getName()+"\t"+students[i].getNum()+"\t"+students[i].getKor()+"\t"+students[i].getEng()+"\t"+students[i].getMath()+"\t"+students[i].getTotal()+"\t"+students[i].getAvg());
			
		}
	}
	
	
	
	//viewMessage
	//문자열을 받아서 그 문자열을 출력
	public void view(String message) {
		System.out.println(message);
	}
		
	
	//viewOne
	//학생 한명의 정보를 받아서 모든 정보 출력
	public void view(Student student) {
		System.out.println("Name\tNum\t국어\t영어\t수학\tTotal\tAvg");
		System.out.println(student.getName()+"\t"+student.getNum()+"\t"+student.getKor()+"\t"+student.getEng()+"\t"+student.getMath()+"\t"+student.getTotal()+"\t"+student.getAvg());
	}
		
}
