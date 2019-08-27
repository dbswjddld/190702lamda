package co.yj.lambda;

interface MyFunctionalInterface {
	public void method(int x);
}

class MyFunctionalClass implements MyFunctionalInterface{

	@Override
	public void method(int x) {
		// TODO Auto-generated method stub
		System.out.println("method 1  " + x);
	}
	
}

public class MyFunctionalExample {
	public static void main(String[] args) {

		MyFunctionalInterface ex1 = new MyFunctionalClass();
		ex1.method(3);
		
		MyFunctionalInterface ex2 = new MyFunctionalInterface() {
			@Override
			public void method(int x) {
				System.out.println("method2  " + x);
			}
		};
		ex2.method(5);
		
		// 인터페이스에 구현해야할 메소드가 하나밖에 없을 때
		MyFunctionalInterface ex3 = (a) -> { // 매개변수의 자료형 생략가능
			System.out.println("method3  " + a);
		};
		// (타입 매개변수, ..) -> { 실행문; };
		ex3.method(4);
		
		// 코드를 더 간단하게...
		MyFunctionalInterface ex4 = (a) -> System.out.println("method4");
		ex4.method(5);
		
		
	}
}
