package com.iu.object4;

public class Car {
	
	static String company="쌍용"; //한번 선언한걸 바꿀 필요가 없을때 static 사용
	String brand;
	String color;
	boolean gear; //true 오토, false 수동
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("Gear : "+this.gear);
		System.out.println();
	}
	
	public Car() {//생성자도 메서드기 때문에 오버로딩 가능
		this("Green"); //this() 생성자 내에서 다른 생성자를 호출 할 때 사용
		
		//빈생성자를 만들어서 기본색을 지정하고
		//다른색을 넣고 싶을때 또 다른 생성자를 만들어 매개변수로 색을 지정한다
	}
	
	//멤버변수 초기화 및 객체 생성시 호출하고 싶을때
	public Car(String color) {
		this("아반떼", color);
//		this.company="현대";
//		this.brand="싼타페";
//		this.color=color;
//		this.gear=true;
	}
	
	
	//갈색:지역변수명
	//파랑:멤버변수명
	//지역변수와 멤버변수를 구분할때 멤버변수에 this를 쓴다
	
	public Car(String brand, String color) {
		this.company="현대";
		this.brand=brand;
		this.color=color;
		this.gear=true;
	}

	
	//Instance 초기화 블럭 {}
//	{
//		this.company="기아";
//		this.brand="쏘렌토";
//		this.color="Black";
//		this.gear=false;
//	}
	
	
	
}
