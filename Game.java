package _ch02;

import java.util.Scanner;


public class Game {

	public static void main(String[] args) {

		int dap = 48;
		int save = 5;

		Scanner scanner = new Scanner(System.in);



		System.out.println("��!�ٿ�!Game!");

		System.out.println("����:1 ������:2");

		String start = scanner.nextLine();

		int str = Integer.parseInt(start);
		if(str == 1) {
			System.out.println("1���� 100������ ���ڸ� �����ּ���.");

			for(int i = 0; i < 5; i++) {
				System.out.println("������ȸ:" + save);
				String number = scanner.nextLine();
				int num = Integer.parseInt(number);
				if(dap > num) {
					System.out.println("��!");
				}else if(dap < num) {
					System.out.println("�ٿ�!");
				}else if(dap == num) {
					System.out.println("�����մϴ�!");
					break;
				}

				save--;

			}
			if(save == 0) {
				System.out.println("YOU LOSE...");
			}
		}
	}

}
