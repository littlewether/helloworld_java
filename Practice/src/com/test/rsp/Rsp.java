package com.test.rsp;

import java.util.Scanner;

public class Rsp {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Never Stop 가위바위보 게임!");
		
		for(int i=1;i<=100;i++) {
			System.out.println("무엇을 내시겠어여?");
			System.out.println("가위 : 1, 바위 : 2, 보 : 3");
			System.out.println("숫자를 입력해주세요");
			int per = input.nextInt();
			
			int com = (int) (Math.random() * 3 + 1);
			
			if(per==1) {
				System.out.println("	가위!");
			} else if(per==2) {
				System.out.println("	바위!");
			} else if(per==3) {
				System.out.println("	보!");
			}
				
			if(com==1) {
				System.out.println("#컴퓨터 : 	가위");
			} else if(com==2) {
				System.out.println("#컴퓨터 : 	바위");
			} else if(com==3) {
				System.out.println("#컴퓨터 : 	보");
			}
				
			if((per==1)&&(com==1)||(per==2)&&(com==2)||(per==3)&&(com==3)) {
				System.out.println("\n비겼습니다!\n");
			} else if((per==1)&&(com==2)||(per==2)&&(com==3)||(per==3)||(com==1)) {
				System.out.println("\n졌어여..\n");
			}else if((per==1)&&(com==3)||(per==2)&&(com==1)||(per==3)&&(com==2)) {
				System.out.println("\n이겼습니다!\n");
			}
		}
	}
}
