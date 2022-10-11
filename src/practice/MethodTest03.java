package practice;

class MethodTest03 
{
	public static void sayHello(String  name, int n ){	// 메소드 호출시에 전달되는 값을 받기 위한 변수==> 매개변수
		for(int i=1; i<=n ; i++){
			System.out.println(name+"아 안녕");
		}		
		return;
	}
	public static void main(String[] args) 
	{
		sayHello("수린",10);		//메소드 호출할 때 전달하는 값을 "인수"라고 합니다.
		String title = "쌍용교육센터";
		System.out.println(title);		
		sayHello("고운",2);								//메소드의 호출
		int year = 2022;
		System.out.println(year);
		sayHello("은선",5);								//메소드의 호출

	}
}
