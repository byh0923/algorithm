package chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[][] = new int[N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int minArr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			int minNum = arr[i][0];
			for(int j=0; j<M; j++) {
				if(minNum > arr[i][j]) {
					minNum = arr[i][j];
				}
				minArr[i] = minNum;
			}
		}
		
		
		Arrays.sort(minArr);
		
		int max = 0;
		max = minArr[minArr.length-1];
		
		System.out.println(max);
			
		
	}
}
