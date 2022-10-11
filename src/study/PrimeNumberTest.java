package study;

class PrimeNumberTest 
{
	public static boolean isPrimeNumber(int n){
		boolean flag = false;
		int cnt = 0;
		for(int i=1; i<=n ; i++){
			if(n % i == 0){
				cnt++;
			}
		}
		if(cnt == 2){
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) 
	{
		int n = 7;
		boolean re = isPrimeNumber(n);
		System.out.println(re);
		System.out.println( isPrimeNumber(7) );
		System.out.println("---------------------------------------");
		if( isPrimeNumber(7)  ){
			System.out.println("7은 소수입니다.");
		}else{
			System.out.println("7은 수소가 아닙니다.");
		}
	}
}
