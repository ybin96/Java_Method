package study;

class CallByValueTest 
{	
	public static void increase(int n){
		n = n + 1;
		System.out.println(n);				
	}

	public static void main(String[] args) 
	{
		int a = 5;
		increase(a);
		System.out.println(a);
	}
}
