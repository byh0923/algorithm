package chapter3;

import java.util.Scanner;

/** 
1. N���� 1�� ����.
2. N�� K�� ������.
 * */
public class Greedy004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N  = sc.nextInt();
		int K = sc.nextInt();
		
		int count = 0;
		
		while(N!=1) {
			if(N % K == 0) {
				N /= K;
				count++;
			} else {
				N--;
				count++;
			}
		}
		
		System.out.println(count);
	}
}
