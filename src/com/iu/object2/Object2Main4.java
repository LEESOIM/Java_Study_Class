package com.iu.object2;

public class Object2Main4 {

	public static void main(String[] args) {

		Member member = new Member();
		member.name="ㅇㅅㅇ";
		member.age=10;
		member.email="ten@naver.com";
		
		Member member2 = new Member();
		member2.name="ㅇㄷㅈ";
		member2.age=20;
		member2.email="twenty@naver.com";
		
		Member member3 = new Member();
		member3.name="ㅊㅇㅅ";
		member3.age=30;
		member3.email="thirty@naver.com";
		
		Member [] members = new Member[3];
		members[0] = member;
		members[1] = member2;
		members[2] = member3;
		
		
		Method4 mt4 = new Method4();
		mt4.info(members);//메서드 호출
		
		System.out.println(members.length);//기존에 있는 배열 값이 출력
		
	}

}
