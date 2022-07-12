package com.iu.object1;

public class ObjectMain {

	public static void main(String[] args) {
		
//		자바는 메모리 영역이 크게 3가지로 구분
//		1. Method - main Method : 로딩(실행)파일
//			Method 안에 선언되는 변수 : 클래스변수
//		2. Stack - main Method가 Stack에 차곡차곡 쌓인다 First In Last Out(LIFO)	
//			Stack 안에 선언되는 변수 : {지역변수}
//		3. Heap - new 라고 선언된 부분이 연속으로 만들어짐
//			Heap 안에 선언되는 변수 : 인스턴스변수 new
		
//		기타) 참조변수 : 변수값이 객체의 주소값을 담고 있는 변수
		
		
		System.out.println("프로그램 시작");
		//Object 생성
		//클래스명(대문자) 변수명(소문자) = new 클래스명(); -> new:힙에 새로 만들어라
		//데이터타입 변수명
		Monster monster = new Monster(); //Monster -> int,long과 같은 사용자가 만든 데이터타입
										//class의 역할 : 데이터를 담아서 운반
		System.out.println(monster); //힙 영역에 있는 실제 데이터의 스택 메모리 주소값
		
		//멤버변수 접근
		//변수명.멤버변수명
		System.out.println(monster.name); //레퍼런스의 초기값은 null
		System.out.println(monster.level);
		System.out.println(monster.hp);
		
		monster.name="오크";//몬스터를 가르키는 주소에 가서 
		monster.level=5;
		monster.hp=100;
		
		System.out.println(monster.name); 
		System.out.println(monster.level);
		System.out.println(monster.hp);
		
		//------------------------------------------------------------
		
		Monster monster2 = new Monster(); 
		monster2.name="오크";
		monster2.level=5;
		monster2.hp=100;
		System.out.println(monster==monster2); //데이터가 같아도 주소값이 다르기 때문에 false
		
		
		Weapon sword = new Weapon();
		sword.name="단검";
		sword.damage=10;
		sword.inchant=1;
		
		monster.weapon = sword; //같은 타입끼리 담을수있다
		
		//몬스터가 들고 있는 단검의 이름
		System.out.println(monster.weapon.name);
		System.out.println(monster2.weapon.name);//monster2의 weapon에는 값이 없다 
		System.out.println("프로그램 종료");
	}

}
