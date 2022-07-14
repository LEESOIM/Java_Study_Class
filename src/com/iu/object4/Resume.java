package com.iu.object4;

public class Resume {
	//Data 담는 클래스 : 사람의 데이터를 담는 역할만 한다
	//이력서 : 이름, 전화번호, 나이, 주소
	
	String name;
	String phone;
	int age;
	String address;
	
	boolean check; //이력서 합격 여부

	
	//생성자(Constructor) 메서드
	//접근지정자 클래스명과동일한이름([매개변수 선언]) {}
	public Resume() {
		System.out.println("Resume Object 생성");
	}
}
