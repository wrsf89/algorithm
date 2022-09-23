package baekjoon;

import java.util.Scanner;

public class BreakEvenPoint {

	public static void main(String[] args) {
		// 손익분기점
		Scanner scan  = new Scanner(System.in);  //스캐너

		int fixed = scan.nextInt(); //고정비용 입력		
		int varIable = scan.nextInt(); //가변비용 입력 
		int cost = scan.nextInt(); // 상품가격 입력
		int brp = 0; //손익분기점 담기위한 변수
		
	    if(varIable >= cost) { //상품 1개의 가변비용이 상품가격보다 비싸거나 같으면 무조건 손해
	    	System.out.println(-1);
	    }else {
	    	brp = fixed / (cost - varIable); //손익분기점의 매출개수 구하는 공식
	    	System.out.println(brp + 1); //시작되는부분 구해야하기 떄문에 +1
	    }
		   
		
	
	}

}
