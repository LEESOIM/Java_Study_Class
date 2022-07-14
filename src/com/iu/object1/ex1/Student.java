package com.iu.object1.ex1;

public class Student { //이렇게 할겁니다 선언만 하는거지 실제로 실행하는 기능은 아님
	
	//멤버변수(instance 변수)
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	int avg;
	
	//갈색:지역변수명
	//파랑:멤버변수명
	//this.멤버변수명 -> 지역변수가 된다
	
	//메서드 선언
	public void setTotal() {
		this.total = this.kor + this.eng + this.math; //this : 만들어진 객체(자기자신)의 주소를 담고 있는 참조변수
//		total = kor + eng + math; // this 생략가능
		this.setAvg();
	}
	
	public void setAvg() {
		this.avg = this.total/3;
	}
}
