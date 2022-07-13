package com.iu.object2;

public class Object2Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Method1 mt1 = new Method1();
		//객체를 먼저 만들고 멤버변수 사용
		//참조변수명.변수명
		
		//멤버메서드(인스턴스메서드) 사용 == 메서드를 호출한다
		//참조변수명.메서드명()
		mt1.test();
		
		//System.out.println(num); 실행안됨 
		//num은 지역변수 : {}끝나면 메모리에서 삭제
		
		Method2 mt2 = new Method2();
		mt2.info();
		
		System.out.println("프로그램 종료");
	}

}
