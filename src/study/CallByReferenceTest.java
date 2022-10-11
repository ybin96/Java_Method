package study;

class CallByReferenceTest 
{
	public static void increase(int []arr){
		arr[0] = arr[0] + 1;
		System.out.println(arr[0]); //11
	}

	public static void main(String[] args) 
	{
		int []data = {10,20,30};
		increase(data);
		System.out.println(data[0]); //11
	}
}
