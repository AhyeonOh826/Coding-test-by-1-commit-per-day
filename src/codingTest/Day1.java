package codingTest;


public class Day1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 그리디 알고리즘
		// 거슬러 줘야 할 동전의 최소 개수
		
		// 거슬러 줘야 할 돈
		int n = 2050;
		// 카운트
		int count = 0;
		// 큰 단위의 화폐부터 차례대로 확인 하기
		int[] coinArray = {500,100,50,10};
		
		// 배열 만큼 돌린다
		for(int i = 0; i < coinArray.length ; i++) {
			// 거슬러 줘야 할 돈/동전=개수 
			count += n / coinArray[i]; //4
			// 거슬러 줘야 할 돈/동전=개수 후 나머지 값 사용
			n %= coinArray[i];// 50
		}
		// 총 동전 개수
		System.out.println(count);
	}

}
