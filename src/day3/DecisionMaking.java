package day3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.Date;

public class DecisionMaking {
	// viết 1 hàm
	// nhập n từ bàn phím
	// hàm scanner scan= new
	/**
	 * Viết chương trình nhập vào 1 số nguyên n, in ra nếu n chẵn input: n nguyên
	 * (int) output: n chẵn how: nếu chia hết cho 2 viết 1 hàm
	 */
	
	public static void doExcersice3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("nhập n = ");
		// hàm scan.nextInt là nhập số từ bàn phím
		int n = scan.nextInt();
		// so sánh là ==
		if (n % 2 == 0) {
			System.out.println(n + "là số chẵn");
		} else {
			System.out.println(n + "là số lẻ");
		}
		scan.close();
	}

	/**
	 * nhập vào 1 số nguyên n n từ 2 đến 8 in ra thứ trong tuần n=2 ra thứ 2 n =2
	 * input: n từ 2 đến 8 n=7 in ra là ngày nghỉ n=8 in ra là ngày lễ output:từ n 2
	 * đến 6 thứ +"n" how: == bằng && và != không bằng || hoặc
	 */

	public static void doExcersice4() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if ((n < 2) || (n > 8)) {
			System.out.println(n + " không thoả mãn");
		} else if ((n >= 2) && (n <= 6)) {

			System.out.println("là thứ" + n);
		} else if (n == 7) {
			System.out.println("ngày nghỉ");
		} else {
			System.out.println("ngày cuối tuần");
			scan.close();
		      
		}

	}

	// Input
	// Output
	// n=1 chữ số==> in ra chính nó
	// n=ab==> in ra a,b
	// n= 1 2 3 4 5 6
	// cách làm : viết 1 hàm
	// n có sẵn từ 1 đến 6
	// đổi dữ liệu từ int sang string
	//
	public static void doExcersice5() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input six non-negative digits: ");
		int n = scan.nextInt();
		int a = n / 100000;
		int b = (n % 100000) / 10000;
		int c = (n % 10000) / 1000;
		int d = (n % 1000) / 100;
		int e = (n % 100) / 10;
		int f = (n % 10);
		System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " ");
		scan.close();
	}

	// input 4 số nguyên : k/c (m) = khoang cách
	// hour
	// minute
	// second
	// Output: v=s/t
	public static void doExcercise71() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input distance in meters");
		short n = scan.nextShort();
		System.out.println("Input hour");
		byte h = scan.nextByte();
		System.out.println("Input minutes");
		long m = scan.nextInt();
		System.out.println("Input second");
		int s = (int) scan.nextInt();
		long timeInSeconds = (h * 3600) + (m * 60) + s;
		float speedMetterAndSecond = (float) n / timeInSeconds;
		float speedKiloAndHour = (float) ((float) (n / 1000)) / ((float) (timeInSeconds / 3600));
		float speedMileAndHour = (float) ((float) (n / 1609)) / ((float) (timeInSeconds / 3600));
		System.out.println("speedMetterAndSecond" + speedMetterAndSecond);
		System.out.println("speedKiloAndHour" + speedKiloAndHour);
		System.out.println("speedMileAndHour" + speedMileAndHour);
		scan.close();
	}

	public static void doExcercise8() {
		long a = 1000;
		int b = (int) a;
		System.out.println(b);
	}

	public static void doExcercise9() {
		Scanner scan = new Scanner(System.in);
		System.out.println("a = ");
		int a = scan.nextInt();
		if (a < 10) {
			System.out.println(a += 1);
		} else {
			System.out.println("Vui long nhap so nho hon 10");
		}
		scan.close();
	}

	public static void doExcercise10() {
		// Chuỗi "Yourname_xxxx"
		int min = 0;
		int max = 7000;
		int ramdom_int = (int) Math.floor(Math.random() * (max + min));
		System.out.println("Yourname_" + ramdom_int);
	}

	public static void doExcercise11() {
		// Input:
		// Out: hiển thị nhày giờ của likch mặc định
		Calendar calendar = Calendar.getInstance();
		setTimeZone(TimeZone.getTimeZone("JST"));
		System.out.println("Year" + calendar.get(Calendar.YEAR));
		System.out.println("Month" + calendar.get(Calendar.MONTH));
		System.out.println("Day" + calendar.get(Calendar.DATE));
		System.out.println("Hour" + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minute" + calendar.get(Calendar.MINUTE));
	}

	private static void setTimeZone(TimeZone timeZone) {
		// TODO Auto-generated method stub

	}

	public static void doExcersice12() {
		Date date = new Date();
		SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
		String stringDate = DateFor.format(date);
		System.out.println(stringDate);
	}
// hỏi input JST thì dùng hàm nào
	public static void doExcersice13() {
		Date date1 = new Date();
		SimpleDateFormat Date1 = new SimpleDateFormat("yyyy-MM-dd");
		String stringDate1 = Date1.format(date1);
		System.out.println(stringDate1);
		
		Date date2 = new Date();
		SimpleDateFormat Date2 = new SimpleDateFormat("dd-MM-yyyy");
		String stringDate2 = Date2.format(date2);
		System.out.println(stringDate2);
		
		Date date3 = new Date();
		SimpleDateFormat Date3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String stringDate3 = Date3.format(date3);
		System.out.println(stringDate3);
		
		Date date4 = new Date();
		SimpleDateFormat Date4 = new SimpleDateFormat("YYYY-MM-DD HH:MM.SS.FF");
		String stringDate4 = Date4.format(date4);
		System.out.println(stringDate4);
		
		Date date5 = new Date();
		SimpleDateFormat Date5 = new SimpleDateFormat("YYYY-MM-DD HH:MM.SS.FF Z");
		String stringDate5 = Date5.format(date5);
		System.out.println(stringDate5);
		
	}
	// hỏi về phần khai báo mảng này
	public static void doExcersice14() {
		Scanner scan = new Scanner(System.in);
		int [] number;
		number = new int[3];
		number [0] = 1;
		number [1] = 2;
		number [2] = 3;
		System.out.println(number);
		for (int i=0;i<3;i++) {
			System.out.println(number[i]);
			scan.close();
		}
		}
	public static void doEx () {
		int i =0;
		int a=++i;
		int b=i++;
		System.out.println("a"+a);
		System.out.println("b"+b);
	}
	
}
