package com.iu.object1.ex1;


public class StudentView {
	
	//viewAll메서드
	//학생들의 모든 정보를 받아서 출력
	public void view(Student [] students) { //학생들의 정보를 배열로 받는다는 뜻
		System.out.println("Name\tNum\t국어\t영어\t수학\tTotal\tAvg");
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name+"\t"+students[i].num+"\t"+students[i].kor+"\t"+students[i].eng+"\t"+students[i].math+"\t"+students[i].total+"\t"+students[i].avg);
			
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
		System.out.println(student.name+"\t"+student.num+"\t"+student.kor+"\t"+student.eng+"\t"+student.math+"\t"+student.total+"\t"+student.avg);
	}
		
}
