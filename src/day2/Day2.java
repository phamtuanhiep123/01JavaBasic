package day2;

import java.util.Scanner;

// Input: Nhập từ 2 đến 8 hoặc số bất kì
//Output: Nhập từ 2 đến 7 trả về từ thứ 2 đến thứ 7 nhập 8 trả về chủ nhật
// nhập số bất kì hiển message lỗi 
// How: Viết 1 hàm nhập từ bàn phím
//      sử dụng hàm rẽ nhánh ( if...else if...else) hoặc (switch...case)
public class Day2 {
	public static void doExcercise1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hãy nhập số: ");
		int n = scan.nextInt();
		switch (n) {
		case 2:
			System.out.println("Thứ 2");
			break;
		case 3:
			System.out.println("Thứ 3");
			break;
		case 4:
			System.out.println("Thứ 4");
			break;
		case 5:
			System.out.println("Thứ 5");
			break;
		case 6:
			System.out.println("Thứ 6");
			break;
		case 7:
			System.out.println("Thứ 7");
			break;
		case 8:
			System.out.println("Chủ nhật");
			break;
		}
		return;
	}

	public static void doExcersice2() {
		// chưa hiểu
	}

	public static void doExcersice3() {

		// Input : từ 1 đến 100
		// Output: Tổng và trung bình
		// How:
		// tại sao lại ra 3 giá trị
		int sum = 0;
		double average;
		int smallestnumber = 1;
		double biggestnumber = 100;
		for (int i = smallestnumber; i <= biggestnumber; ++i) {
			sum += i;
			average = sum / biggestnumber;
			System.out.println("Thesum: " + sum);
			System.out.println("Theaverage: " + average);

		}

	}

	public static void doExcersice4() {
		int sum = 0;
		double count = 0;
		double average;
		int smallestnumber = 111;
		double biggestnumber = 8899;
		for (int i = smallestnumber; i <= biggestnumber; i++) {
			sum += i;
			count++;
			average = sum / (double) count;
			System.out.println("Thesum: " + sum);
			System.out.println("Theaverage: " + average);

		}

	}

	public static void doExcercise5() {
		// Input: 1 đến 100
		// Output: tổng số lẻ
		// How
		int sum = 0;
		double count = 0;
		double average;
		int smallestnumber = 1;
		double biggestnumber = 100;
		for (int i = smallestnumber; i <= biggestnumber; ++i) {
			if (i % 2 != 0) {
				sum += i;
				count++;

			}

		}
		System.out.println("The sum" + sum);
	}

	public static void doExcercise51() {
		// Input: 1 đến 100
		// Output: tổng số lẻ
		// How
		int sum = 0;
		double count = 0;
		double average;
		int smallestnumber = 1;
		double biggestnumber = 100;
		for (int i = smallestnumber; i <= biggestnumber; i += 2) {
			sum += i;
			count++;
			System.out.println("The sum" + sum);

		}

	}

	public static void doExcercise6() {
		// Input: 1 đến 100
				// Output: số chia hết cho 7
				// How
				int sum = 0;
				double count = 0;
				double average;
				int smallestnumber = 1;
				double biggestnumber = 100;
				for (int i = smallestnumber; i <= biggestnumber; ++i) {
					if (i %7 == 0) {
						sum += i;
						count++;

					}

				}
		
				System.out.println("The sum" + sum);

	}

}
