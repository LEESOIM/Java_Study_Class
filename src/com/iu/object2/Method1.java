package com.iu.object2;

public class Method1 {

	//멤버 변수 선언
	//	접근지정자 [그외지정자] 데이터타입 변수명;
	
	//멤버 메서드 선언 
	//	접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){
	//		실행할 코드 작성
	//	}
	
	//접근지정자 : public
	//그외지정자 : 생략 [대괄호 안은 옵션]
	//리턴타입 : void(리턴할 게 없다)
	//메서드명 : 개발자가 생성, 첫글자는 소문자로 시작
	//매개변수 : 생략
	public void test() {
		System.out.println("Test Method 실행");
		int num=10;
		System.out.println(num);
	}
	
}


