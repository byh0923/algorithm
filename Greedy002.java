package chapter3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 배열의 크기
		int N = sc.nextInt();
		// 더해지는 횟수
		int M = sc.nextInt();
		// 큰 수를 사용할 수 있는 수
		int K = sc.nextInt();
		
		Integer temp[] = new Integer[N];
		
		for(int i=0; i<N; i++) {
			temp[i] = sc.nextInt();
		}
		
		int tot = 0;
		Arrays.sort(temp, Collections.reverseOrder());
		int cnt = 0;

		for(int i=0; i<M; i++) {
			cnt++;
			if(cnt == K+1) {
				System.out.println("ㅇㅇ?");
				tot += temp[1];
				cnt = 0;
			} else {
				tot+= temp[0];
			}
			System.out.println(tot+"/"+cnt);
		}
		
		System.out.println(tot);
	}
}
