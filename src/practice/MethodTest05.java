package practice;

class MethodTest05 
{
	//매개변수를 dan를 받아 해당하는 구구단을 출력하는 메소드를 정의
	public static void gugudan(int dan){
		System.out.println(" *** " + dan + "단 ***");
		for(int i=1; i<= 9; i++){
			System.out.println(dan + "*" + i + "="+ (dan*i));
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		gugudan(2);
		gugudan(5);
	}
}
