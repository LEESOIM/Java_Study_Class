package com.iu.object4;

public class Object4Main1 {

	public static void main(String[] args) {

		Resume re = new Resume(); //객체 만들때 딱 한번 호출되는 특수한 메서드
		
		Car car1 = new Car();
//		car1.brand = "토레스";
		car1.info();
		
		Car car2 = new Car("Black");
		car2.info();
		
		Car car3 = new Car("투싼", "Gray");
		car3.info();
		
	}
}





//	1. 멤버변수 선언과 동시에 초기화     : 활용도 하
//	2. 객체 생성 후 멤버변수에 값을 대입 : 활용도 하
//	3. 생성자에서 초기화                : 활용도 중
//	4. instance block                  : 활용도 하
//	5. Getter / Setter 메서드           : 활용도 상
//
//	실행순서
//	1 -> 4 -> 3 -> 2,5