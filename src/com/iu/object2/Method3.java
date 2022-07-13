package com.iu.object2;

public class Method3 {

	//sal 메서드 선언
	public void sal(int salary) {//매개변수 : 데이터를 받기 위해 선언
		System.out.println("월급 계산");
		System.out.println(salary*0.967); //호출 끝
		
		salary=20; //20은 호출이 끝나면 같이 사라짐(스택에 있는 지역변수)
	}
	
	
	
	
	public void hap(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	
	
	
	public void info(String name, int age, String email) {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("이메일 : "+email);
		System.out.println("---------------");
	}
	
	
	
	public void info2(Member member) {
		System.out.println("이름 : "+member.name);
		System.out.println("나이 : "+member.age);
		System.out.println("이메일 : "+member.email);
		System.out.println("번호 : "+member.phone);
		
		member.age=100; //같은 주소의 힙에 있는 멤버변수
		
	}
}
