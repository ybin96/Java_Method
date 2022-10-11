package study;

class FactorialTest
{
	public static int getFactorial(int n){
		int result = 1;
		for(int i=n; i>=1; i--)
		{
			result *= i;
		}
		return result;
	}

	public static void main(String[] args) 
	{
		int a = 5;
		System.out.println(getFactorial(a));
		System.out.println(getFactorial(5));
	}
}
