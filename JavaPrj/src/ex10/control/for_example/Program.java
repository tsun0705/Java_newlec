package ex10.control.for_example;

public class Program {
	public static void main(String[] args) {
		int total = 0;
		
		/* for(int i=0; i<5; i++) {
			total += i+3;
		} */
		
		// n*(a+l)/2  - 반복횟수 * (첫항 + 끝함) / 2
		total = 5*(3+7)/2;
				
		System.out.printf("total is %d\n", total);
	}
}