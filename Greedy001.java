package chapter3;

import java.util.Scanner;

public class Greedy001 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int coin[] = {500, 100, 50, 10};
		
		int N = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<coin.length; i++) {
			count += N/coin[i];
			N %= coin[i];
		}
		
		System.out.println(count);
	}
}
