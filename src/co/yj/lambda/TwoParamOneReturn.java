package co.yj.lambda;

interface Calculate{
	int cal(int num1, int num2);
	// return int
}

public class TwoParamOneReturn {
	public static void main(String[] args) {
		Calculate c;
		
		c = (a, b) -> {return a + b;};
		System.out.println(c.cal(5, 8));
		
		c = (a, b) -> a * b; // 몸체가 return밖에 없는 경우에는 생략가능
		System.out.println(c.cal(10, 5));
	}
}
