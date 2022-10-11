package study;

//두개의 수를 전달받아 나누기 하는 프로그램 작성
import java.util.Scanner;
class RuntimeErrorTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("첫번째 수를 입력==>");
		a = sc.nextInt();
		System.out.print("두번째 수를 입력==>");
		b = sc.nextInt();
		int div = a/b;
		System.out.println("나누기 결과 :" + div);
	}
}

/*
C:\javaStudy\day0817>java RuntimeErrorTest
첫번째 수를 입력==>5
두번째 수를 입력==>0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at RuntimeErrorTest.main(RuntimeErrorTest.java:13)

==> 프로그램 실행중에 발생하는 오류입니다.
==> 예외처리를 하여 문제를 해결할 수 있어요

*/


