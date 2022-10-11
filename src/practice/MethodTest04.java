package practice;

class MethodTest04 
{
	// 매개변수로 두개의 정수를 전달받아 더하기 한 결과를 출력하는 메소드를 정의합니다.
	// 완성하면 "1"
	
	public static void add(int a, int b){
		int result = a + b;
		System.out.println("더하기 결과:" + result);
	}

	public static void main(String[] args) 
	{
		add(10,20);
		add(100,200);
	}
}
