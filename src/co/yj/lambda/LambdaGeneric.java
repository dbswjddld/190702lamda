package co.yj.lambda;

@FunctionalInterface
interface Calculate2 <T>{
	T cal(T a, T b);
}

public class LambdaGeneric {
	public static void main(String[] args) {
		Calculate2 <Integer> ci = (a, b) -> a + b;
		System.out.println(ci.cal(5, 8));
	}
}
