package com.iu.object2;

public class Method4 {
	
	//info
	//멤버들의 정보를 출력하는 메서드
	public void info(Member [] members) {
		for(int i=0;i<members.length;i++) {
			System.out.println(members[i].name);
			System.out.println(members[i].age);
			System.out.println(members[i].email);
			System.out.println("-----------------");
		}//호출 끝
		
		members = new Member[2]; //호출 끝나면 새로 만든건 같이 삭제
	}
}
