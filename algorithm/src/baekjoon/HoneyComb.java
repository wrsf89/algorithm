package baekjoon;

import java.util.Scanner;

public class HoneyComb {

	public static void main(String[] args) {
		//벌집
		// 1 (6증가)-> 7 (12증가)-> 19 (18증가)-> 37 (24증가)-> 61
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt(); // 방 입력 변수
		int count = 1; // 방 갯수 카운트 변수
		int cycle = 6; // 6씩증가를 하기위한 변수
		for (int i = 1; i <= 1000000000; i++) {			
			count += cycle;
			if(input <= count) {
				System.out.println(i+1);
				break;
			}else {
				cycle +=6;
			}
			
		}

	}

}
