package com.iu.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest {
	
	//title, host, 통장번호, 잔액 입력받아서 리턴
	public Account makeAccount() { //리턴하려고 하는 데이터타입을 써야한다
		Scanner sc = new Scanner(System.in); 
		Account account = new Account(); //타입이 달라서 배열 X -> 클래스
		account.title = "자유입출금";
		account.host = "이소임";
		account.numbers = "123456-789456";
		account.balance = 99999999999999L;
		
		return account;
	}

	
	
	//호출시 숫자를 받아서 그 숫자만큼 랜덤한 수를 뽑아서 리턴
	public int [] makeRandom2(int count) {
		Random random = new Random();
		int [] nums = new int [count]; // 여러개 값을 담을 수 있는 배열을 사용한다
		
		for(int i=0;i<count;i++) {
//			int num = random.nextInt(50);
//			nums[i]=num;
			nums[i] = random.nextInt(50);
		}
		return nums;
	}
	
	
	
	public int makeRandom() { //리턴하려고 하는 데이터타입을 써야한다
		Random random = new Random();
		int num = random.nextInt(50);
		
		//return 리턴하려는 Data
		return num; //리턴하는 데이터는 1개만 가능
	}
	

	
	public void info() {
		System.out.println("실행 후 그냥 종료");
	}

}
