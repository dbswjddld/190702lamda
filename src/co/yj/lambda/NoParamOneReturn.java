package co.yj.lambda;

import java.util.Random;

interface Generator{
	int rand();
}

public class NoParamOneReturn {
	public static void main(String[] args) {
		Generator gen = () -> {	// 매개변수X --중괄호 내부를 비웠다
			Random rand = new Random();
			return rand.nextInt(50);
		};
		
		System.out.println(gen.rand());
	} 
}
