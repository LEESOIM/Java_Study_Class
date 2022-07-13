package com.iu.object2;

public class Method4 {
	
	//info
	//멤버들의 정보를 출력하는 메서드
	public void info(Member [] members) {//매개변수 : 데이터를 받아옴
		for(int i=0;i<members.length;i++) {
			System.out.println(members[i].name);
			System.out.println(members[i].age);
			System.out.println(members[i].email);
			System.out.println("-----------------");
		}//호출 끝
		
		members = new Member[2]; //출력문 없이 호출 끝났기 때문에 반영 안됨(사라짐)
	}
}
