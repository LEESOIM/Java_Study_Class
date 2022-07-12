package com.iu.object2;

public class AnimalSound {
	
	public void dogSound() {
		System.out.println("댕댕");
//		catSound(); ds 중괄호 끝나기 전에 cs 시작->cs 중괄호 끝나기 전에 ds 시작->...무한반복 StackOverflow 
	}
	
	public void catSound() {
		System.out.println("냥냥");
//		dogSound();
	}
	
	public void tigerSound() {
		System.out.println("어흥");
	}
}
