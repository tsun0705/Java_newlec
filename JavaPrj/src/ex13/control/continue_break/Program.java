package ex13.control.continue_break;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("���� Space�� �����ؼ� 5�� �̻� �Է��ϼ���.");
		
		// 3 Enter, 34 5 6 234 345 54 45 Enter
		// Space�� �����Ͽ� �� ���� ����
		while(scan.hasNext()) { // ���� ���� ���� ��� �ݺ�
			n = scan.nextInt();
			
			if(n < 10) continue;
			
			if(n > 300) break;
			
			System.out.println(n);
		}
	}
}