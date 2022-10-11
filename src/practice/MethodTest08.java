package practice;

class MethodTest08 
{
	//실수형 배열 2개를 매개변수로 전달받아서 
	//그 배열의 요소가 동일한지 판별하는 메소드를 정의하고 호출해 봅니다.
	public static void equalArray(double []a, double[]b){
		boolean flag = true;
		if(a.length != b.length){
			flag = false;
		}else{
			for(int i=0; i<a.length; i++){
				if(a[i] != b[i]){
					flag = false;
					break;
				}
			}
		}

		if(flag == true){
			System.out.println("두개의 배열의 요소는 같아요");
		}else{
			System.out.println("두개의 배열의 요소는 달라요");
		}
	}

	public static void main(String[] args) 
	{
		double []data1 = {2.5, 2.7, 2.0};
		double []data2 = {2.5, 2.7, 2.1};
		equalArray(data1, data2);
	}
}
