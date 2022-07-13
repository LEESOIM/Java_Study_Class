package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {

//		Student st = new Student();
//		
//		st.name="ㅇㅅㅇ";
//		st.num=1;
//		st.kor=80;
//		st.eng=90;
//		st.math=100;
//		st.total=st.kor+st.eng+st.math;
//		st.avg=st.total/3;
//		
//		System.out.println("Num\tName\t국어\t영어\t수학\tTotal\tAvg");
//		System.out.println(st.num+"\t"+st.num+"\t"+st.kor+"\t"+st.eng+"\t"+st.math+"\t"+st.total+"\t"+st.avg);
		
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		Student st = null; //st는 Student 타입
		for(int i=0;i<3;i++) {
			st = new Student(); //객체 3개 만들어짐
			System.out.println("이름 입력");
			st.name=sc.next(); //name은 String 타입
			students[i]=st; //같은 Student 타입을 넣는다
		}
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name);
		}
		
		System.out.println(st.name);
	}

}
