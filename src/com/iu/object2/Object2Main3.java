package com.iu.object2;


public class Object2Main3 {

	public static void main(String[] args) {

		//1)메서드를 호출하기 위해서는 먼저 객체 생성!
		Method3 ms = new Method3();
		
		//월급 입력
		int salary = 5000000;
		ms.sal(salary); //(인자값) : 메서드를 호출할때 매개변수에 보내는 실제 값(매개변수에 대입하는 값)
						//호출 끝
		System.out.println(salary); //5000000
									//20은 호출이 끝나면 같이 사라짐(스택에 있는 지역변수)
		
		ms.hap(10, 20);
		

		
		ms.info("soim", 30, "cutesoim@naver.com");
		
		
		
		//1)메서드를 호출하기 위해서는 먼저 객체 생성!
		Member member = new Member(); //member : 주소만 담는 참조변수!(4바이트)
		member.name="ㅇㅅㅇ";
		member.age=20;
		member.email="@naver.com";
		member.phone="010-1234-5678";
		ms.info2(member); //member에 들어있는 주소를 info2에 보낸다->같은 주소가 된다
		
		System.out.println(member.age); //같은 주소기 때문에 100 호출 가능
		
	}
}
