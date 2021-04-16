package codingTest;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1이 될때까지 최소 횟수 값(최대한 빠르게)
		int n = 27;
		int k = 3;
		
		// 횟수
		int cntResult = 0;
		// 나눌 값
		int target;
		
		// n이 k보다 크면
		while(n > k) {
			
			 //n이 k로 나누어 떨어지는 수가 될 때가지 뺴기
			 // 항상 k의 배수가 된다
			 target = (n / k) * k;
			 System.out.println("target : " + target); 
			 
			 // n이 k보다 작을 때(더 이상 나눌 수 없을 때)반복문탈출 
			 cntResult += ( n- target); 
			 System.out.println("cntResult : " + cntResult);
			 
			 n = target; 
			 System.out.println("n : " + n);
					
			// n이 k보다 크면 break
			if(n < k) {
				break;
			}else {
				// 1씩 증감
				cntResult++;
				// 
				n /= k;
				System.out.println("횟수1 : "+cntResult);
				System.out.println("n /= k : "+ n);
			}
		};
		cntResult += (n - 1);
		System.out.println("횟수2 : "+cntResult);
	}

}
