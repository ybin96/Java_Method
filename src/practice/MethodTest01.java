package practice;

class MethodTest01 
{
	public static void sayHello(){				//메소드의 정의
		System.out.println("수린아 안녕");
		System.out.println("수린아 안녕");
		System.out.println("수린아 안녕");
		return;
	}
	public static void main(String[] args) 
	{
		sayHello();								//메소드의 호출
		String title = "쌍용교육센터";
		System.out.println(title);		
		sayHello();								//메소드의 호출
		int year = 2022;
		System.out.println(year);
		sayHello();								//메소드의 호출

	}
}
