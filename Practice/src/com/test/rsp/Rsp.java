package com.test.rsp;

import java.util.Scanner;

public class Rsp {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Never Stop ���������� ����!");
		
		for(int i=1;i<=100;i++) {
			System.out.println("������ ���ðھ?");
			System.out.println("���� : 1, ���� : 2, �� : 3");
			System.out.println("���ڸ� �Է����ּ���");
			int per = input.nextInt();
			
			int com = (int) (Math.random() * 3 + 1);
			
			if(per==1) {
				System.out.println("	����!");
			} else if(per==2) {
				System.out.println("	����!");
			} else if(per==3) {
				System.out.println("	��!");
			}
				
			if(com==1) {
				System.out.println("#��ǻ�� : 	����");
			} else if(com==2) {
				System.out.println("#��ǻ�� : 	����");
			} else if(com==3) {
				System.out.println("#��ǻ�� : 	��");
			}
				
			if((per==1)&&(com==1)||(per==2)&&(com==2)||(per==3)&&(com==3)) {
				System.out.println("\n�����ϴ�!\n");
			} else if((per==1)&&(com==2)||(per==2)&&(com==3)||(per==3)||(com==1)) {
				System.out.println("\n���..\n");
			}else if((per==1)&&(com==3)||(per==2)&&(com==1)||(per==3)&&(com==2)) {
				System.out.println("\n�̰���ϴ�!\n");
			}
		}
	}
}
