package com.iu.object2;

import java.util.Scanner;

public class Object2Main3 {

	public static void main(String[] args) {

		//1)메서드를 호출하기 위해서는 먼저 객체 생성!
		Method3 ms = new Method3();
		int salary = 5000000;
		ms.sal(salary); //인자값 : 메서드를 호출할때 매개변수에 보내는 실제 값
		System.out.println(salary); //20은 호출이 끝나면 같이 사라짐
		
		ms.hap(10, 20);
		

		ms.info("soim", 30, "cutesoim@naver.com");
		
		
		
		Member member = new Member();
		member.naem="ㅇㅅㅇ";
		member.age=20;
		member.email="@naver.com";
		member.phone="010-1234-5678";
		ms.info2(member);
		System.out.println(member.age);
		
	}
}
