package codingTest;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// str 타입의 문자열 0번째 문자를 char타입으로 변환하고  숫자로 변경한 값을 대입
		// char to int에서 숫자를 넘기는 경우 '0'을 해야 한다. (아스키코드값을 넘기기 때문)
		long result = str.charAt(0)-'0';
		// 자료형 타입 확인
		Typetester ts = new Typetester();
		ts.prinType(result);
		//System.out.println("str.charAt(0)-'0' : " + result);
		// 2번째 값이랑 비교 해야 하니간 i는 1부터 시작
		for(int i = 1; i < str.length(); i++) {
			// 두 번째 문자를 숫자로 변경한 값을 대입
			int num = str.charAt(i)-'0';
			// 두 수중에서 하나라도 '0' 혹은 '1'인 경우, 곱하기 보다 더하기 수행
			if(num <= 1 || result <= 1) {
				result += num;
				System.out.println(result);
			}else {
				result *= num;
				System.out.println(result);
			}
		}
		System.out.println(result);
	}

}

class Typetester{
	// 오버로딩(overloading) : 가ㅓㅌ은 이름의 메서드를 여러개 선언한다. 
	public void prinType(byte x) {
		System.out.println( x + " is an byte");
	}
	
	public void prinType(int x) {
		System.out.println( x + " is an int");
	}
	
	public void prinType(long x) {
		System.out.println( x + " is an long");
	}
	
	public void prinType(double x) {
		System.out.println( x + " is an double");
	}
	
	public void prinType(char x) {
		System.out.println( x + " is an char");
	}
	
	public void prinType(String x) {
		System.out.println( x + " is an String");
	}
	
	
}