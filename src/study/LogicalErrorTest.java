package study;

class LogicalErrorTest 
{
	public static int getFactorial(int n){
		int result = 0;				// 버그
		for(int i=n; i>=1; i--){
			result = result *  i;
		}
		return result;
	}

	public static void main(String[] args) 
	{
		System.out.println(getFactorial(3));
	}
}

