package co.yj.lambda;

interface Printable{
	void print(String s);
}

public class OneParamNoReturn {
	public static void main(String[] args) {
		Printable p;
		
		p = (String s) -> {System.out.println(s);}; // 생략X
		p.print("Lambda exp one.");
		
		p = (String s) -> System.out.println(s); // {} 생략
		p.print("Lambda exp two");
		
		p = (s) -> System.out.println(s); // 매개변수 타입 생량
		p.print("Lambda exp three");
		
		p = s -> System.out.println(s); // 매개변수 소괄호 생략
		p.print("Lambda exp four");
		
	}
}
