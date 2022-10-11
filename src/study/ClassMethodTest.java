package study;

class Person{
	String name;
	int age;
	public static String addr;
	public void info(){
		System.out.println("이름:"+name+",나이:"+age);
	}
	public static void hello(){
		System.out.println("hello");
	}
}

class ClassMethodTest {
	public static void main(String[] args) {

		Person.hello();
		//static 키워드가 붙어 있는 메소드는 객체와 무관하게 호출할 수 있어요.
		//객체 없이도 호출해야 하니까 클래스이름을 통해서 호출합니다.
		//그래서 "클래스메소드"라고 합니다.

		Person p1 = new Person();
		p1.info();
	}
}
