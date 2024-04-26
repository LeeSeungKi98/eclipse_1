package _ch02;

import java.util.Random;
import java.util.Scanner;


public class Game {

	public static void main(String[] args) {


		int save = 5;

		int dap = (int) (Math.random() * 101) + 1;

		Scanner scanner = new Scanner(System.in);

		System.out.println("업!다운!Game!");

		System.out.println("시작:1 나가기:2");

		String start = scanner.nextLine();

		int str = Integer.parseInt(start);
		if(str == 1) {
			System.out.println("1에서 100사이의 숫자를 적어주세요.");

			for(int i = 0; i < 5; i++) {
				if(save != 1) {

					System.out.println("남은기회:" + save);
				}
				String number = scanner.nextLine();
				int num = Integer.parseInt(number);
				if(dap > num) {
					System.out.println("업!");
				}else if(dap < num) {
					System.out.println("다운!");
				}else if(dap == num) {
					System.out.println("축하합니다!");
					break;
				}

				save--;

				if(save == 1) {
					System.out.println("마지막 기회!");
				}
			}
			if(save == 0) {
				System.out.println("YOU LOSE...");
				System.out.println("정답:" + dap);
			}
		}
	}

}
