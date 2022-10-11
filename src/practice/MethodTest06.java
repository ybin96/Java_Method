package practice;

class  MethodTest06
{
	//임의의 수 N을 전달받아 1에서 N까지의 합을 누적하여 출력하는 메소드를 만들고 호출해 봅니다.
	//완성하면 "1"

	public static void sum(int n){
		int total = 0;
		for(int i=1; i<=n ; i++){
			total += i;
		}
		System.out.println("1에서 " + n + "까지의 합은 " + total + "입니다.");
	}


	public static void main(String[] args) 
	{
		sum(3);
		sum(5);
		sum(10);
	}
}
