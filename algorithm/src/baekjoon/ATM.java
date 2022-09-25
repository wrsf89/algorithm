package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// ATM
        
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt(); //사람 수 입력
		int people[] = new int[input]; //사람수 배열 선언
		int sum = 0; //누적시간 담을 변수
		int min = 0; // 최소시간 담을 변수 
		for(int i =0; i < people.length; i++) {
			people[i] = scan.nextInt();
		}
		Arrays.sort(people); //오름차순 정렬
		for(int j = 0; j <people.length; j++) {
			 min += sum + people[j];
			 sum += people[j]; //누적시간 추가
		}
		System.out.println(min);
	}

}
