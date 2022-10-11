package study;

// 리턴값이 없도록
// 리턴값이 있도록

class FactorialTest02
{
	public static void getFactorial(int n){
		int result = 1;
		for(int i=n; i>=1; i--)
		{
			result *= i;
		}
		System.out.println(result);
	}

	public static void main(String[] args) 
	{
		int a = 5;
		getFactorial(a);
		getFactorial(5);
	}
}
