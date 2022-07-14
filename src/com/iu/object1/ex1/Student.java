package com.iu.object1.ex1;

public class Student { //이렇게 할겁니다 선언만 하는거지 실제로 실행하는 기능은 아님
	
	//멤버변수(instance 변수)
	private String name; //private : 같은 클래스 내에서만 사용이 가능
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private int avg;

//	set변수명 : 변수명 첫글자 대문자
//	데이터를 private 변수에 대입하는 메서드
//	리턴타입 void : 매개변수
//
//	get변수명 : 변수명 첫글자 대문자
//	데이터를 private 변수에 반환하는 메서드
//	리턴타입 : 반환할변수의 데이터타입
//	매개변수X
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setNum(int num) {
		if(0<num) {
			this.num=num;
		}
	}
	public int getNum() {
		return this.num;
	}
	
	public void setKor(int kor) {
		this.kor=this.checkPoint(kor);
	}
	public int getKor() {
		return this.kor;
	}
	
	public void setEng(int eng) {
		this.eng=this.checkPoint(eng);
	}
	public int getEng() {
		return this.eng;
	}
	
	public void setMath(int math) {
		this.math=checkPoint(math);
	}
	public int getMath() {
		return this.math;
	}
	
	public int getTotal() {
		return this.total;
	}
	
	public int getAvg() {
		return this.avg;
	}
	
	
	private int checkPoint(int point) {
		if(point < 0 || point > 100) {
			return 0;
		}
		return point;
	}
	
	

	
	
	//메서드 선언
	public void setTotal() {
		this.total = this.kor + this.eng + this.math; //this : 만들어진 객체(자기자신)의 주소를 담고 있는 참조변수
//		total = kor + eng + math; // this 생략가능
		this.setAvg();
	}
	
	private void setAvg() { //private : 같은 클래스 내에서만 사용이 가능
		this.avg = this.total/3;
	}
}
