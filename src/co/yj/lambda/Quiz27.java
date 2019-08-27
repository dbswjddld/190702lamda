package co.yj.lambda;

interface Calc<T> {
	T cal (T a, T b);
}

public class Quiz27 {
	
	public static void main(String[] args) {
		Calc<Integer> c1 = (a, b) -> a + b;
		System.out.println(c1.cal(3, 4));
		
		Calc<Double> c2 = (a, b) -> a + b;
		System.out.println(c2.cal(2.5, 7.1));
		
		Calc<Integer> c3 = (a, b) -> a - b;
		System.out.println(c3.cal(4, 2));
		
		
	}
}
