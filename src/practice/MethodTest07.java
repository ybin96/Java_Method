package practice;

class MethodTest07 
{
	//정수형 배열을 매개변수로 전달받아 총합을 구하여 출력하는 메소드를 정의
	public static void sum(int []arr  ){
		int total = 0;
		for(int i=0; i<arr.length; i++){
			total += arr[i];
		}
		System.out.println("배열의 총합 : " + total);
	}

	public static void main(String[] args) 
	{
		int []a = {10,20,30,40,50};
		sum(a);
	}
}
