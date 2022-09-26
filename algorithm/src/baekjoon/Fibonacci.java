package baekjoon;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// 피보나치
		Scanner scan = new Scanner(System.in); //스캐너

        int input = scan.nextInt();
        
        System.out.println(fibonacci(input));
       
}
	//재귀함수 
	static int fibonacci(int input) { //피보나치 함수 생성
		if(input == 0) {  //0이 될떄까지 반복
			return 0;
		}else if(input ==1) { //1이 될떄까지 반복
			return 1;
		}
		return fibonacci(input -1) + fibonacci(input -2);
	}
  }