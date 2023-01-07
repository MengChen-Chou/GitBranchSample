package test1;

public class MainApp {
	public static void main(String[] args) {
		//組長
		System.out.println("1st version");
		//組長新增
		Test cMath = new Test();
		System.out.println(cMath.add(10, 20));
	}
}

class Test{
	int add(int a, int b) {
		return a+b;
	}
}
