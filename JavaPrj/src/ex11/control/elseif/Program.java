package ex11.control.elseif;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		int menu;
		float avg;

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			// ------------���� �޴� �κ�--------------------
			System.out.println("����������������������������������������������");
			System.out.println("��      ���� �޴� ����     ��");
			System.out.println("����������������������������������������������"); 
			System.out.printf("\t1. �����Է�\n");
			System.out.printf("\t2. �������\n");
			System.out.printf("\t3. ����\n");
			System.out.print("\t>");
			menu = scan.nextInt();
			
			if(menu == 1) {
				// ------------���� �Է� �κ�--------------------
				System.out.println("����������������������������������������������");
				System.out.println("��       ���� �Է��ϱ�     ��");
				System.out.println("����������������������������������������������"); 
				
				do {
					System.out.print("����1 : ");
					kor1 = scan.nextInt();
					
					if(kor1 < 0 || 100 < kor1)
						System.out.println("��������(0~100)�� ������ϴ�.");
				} while (kor1 < 0 || 100 < kor1);
				
				do {
					System.out.print("����2 : ");
					kor2 = scan.nextInt();
					
					if(kor2 < 0 || 100 < kor2)
						System.out.println("��������(0~100)�� ������ϴ�.");
					
				} while (kor2 < 0 || 100 < kor2);
				
				do {
					System.out.print("����3 : ");
					kor3 = scan.nextInt();
					
					if(kor3 < 0 || 100 < kor3)
						System.out.println("��������(0~100)�� ������ϴ�.");
				} while (kor3 < 0 || 100 < kor3);
			} else if(menu == 2) {
				// ------------���� ��� �κ�--------------------
				
				total = kor1 + kor2 + kor3;
				avg = total / 3.0f;
				
				System.out.println("����������������������������������������������");
				System.out.println("��       ���� ��¿Ϸ�     ��");
				System.out.println("����������������������������������������������");
				
				for(int i=0; i<3; i++)
				System.out.printf("\t����%d : %3d\n", i+1, kor1);
				
				System.out.printf("\t���� : %3d\n", total);
				System.out.printf("\t��� : %6.2f\n", avg);
				System.out.println("����������������������������������������������");
			} else if(menu == 3){
				break;
			} else {
				System.out.println("\t�߸� �Է��Ͽ����ϴ�.");
			}
		}

		System.out.println("\t����Ǿ����ϴ�.");
	}
}