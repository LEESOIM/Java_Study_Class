package com.iu.object2;

public class AnimalSound {
	
	public void dogSound() {
		System.out.println("댕댕");
//		catSound(); dS 중괄호 끝나기 전에 cS 시작->cS 중괄호 끝나기 전에 dS 시작->...무한반복 StackOverflow 
	}
	
	public void catSound() {
		System.out.println("냥냥");
//		dogSound();
	}
	
	public void tigerSound() {
		System.out.println("어흥");
	}
}
