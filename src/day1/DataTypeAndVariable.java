package day1;

public class DataTypeAndVariable {
	public static void doExcercise1() {
		System.out.print("Hello World");
	}
	public static void doExcercise2() {
		System.out.print("++++++");
		System.out.println();
		System.out.println("@@@@@@");
		System.out.println();
		System.out.println("******");
		System.out.println();
		System.out.println("######");
		
			
		}
		public static void doExcercise21() {
			System.out.println("++++++" + "\n\n" + "@@@@@@" + "\n\n" + "******" + "\n\n" +"######");
		}
		public static void doExcercise3() {
			
			int a = 10;
			System.out.println("a = " + a);
			
			double b=20.3;
			System.out.println("b ="+ b);
			double c=3.14785;
					System.out.println("c ="+ c);
		

		}
		
		//
		public static void doExcercise4() {
			boolean a1 = true;
			a1 = false;
			//&lt,&gt không dùng trong java (<,>)
			System.out.println(a1);
			
				
			
			
		}
		public static void doExcercise5() {
			// độ c= (độ F-32)*5/9)
			// sao chỗ này lại khai biến là float
			float fahrenheit, Celsius; 
			// tại sao biến dưới không cần data types
			fahrenheit = 212;  
			Celsius =((fahrenheit - 32)*5)/9;  
			System.out.println(" celsius is: "+Celsius);  
			
		}
		public static void doExcercise6() {
			// tại sao ở đây khai biến là data type là double
			double Inches,Meteres;
			Inches =(double)1000;
			Meteres =Inches*0.0254;
			System.out.println(Inches + "Inches is "+ Meteres +" meteres");
			
			
		}
		public static void doExcercise7() {
			// tính vận tốc
			// Quãng đường=2500
			// Time:5h56p23s
			//km/h=2500/
			float timeSecond,timeHour,DistanceKilometers,DistanceMeters,DistanceMiles;
			timeSecond=(int)21383;
			// tại sao chỗ này cần thêm (float)  vi giá trị là 0.000 ??
			// tại sai float lại để trong ()
			timeHour=(float)5.93972222;
			DistanceKilometers=(float)2.5;
		    DistanceMeters=(int)2500;
			DistanceMiles=(float)1.5537601;
			float kmh,mps,mph;
			kmh= DistanceKilometers/timeHour;
			mps= DistanceMeters/timeSecond;
			mph= DistanceMiles/timeHour;
			System.out.println("Your speed in km/h is " + kmh +"\n\n");
			System.out.println("Your speed in meters/second is " + mps + "\n\n");
			System.out.println("Your speed in miles/h is " + mph + "\n\n");
		}
		
		
		public static void doExcercise8() {
			int FirstInt=25;
			int SecondInt=5;
			//difference, product, average, distance, maximum and minimum
			// phím tắt làm đẹp code là gì
			float Sum, Difference, Product, Average, Distance,Maximum,Minium;
			Sum= FirstInt+SecondInt;
			Difference= FirstInt-SecondInt;
			Product= FirstInt*SecondInt;
			Average= (FirstInt+SecondInt)/2;
			Distance= FirstInt-SecondInt;
			Maximum= Math.max(FirstInt, SecondInt);
			Minium= Math.min(FirstInt, SecondInt);
			System.out.println("Sum of two integers: " +Sum);
			System.out.println("Difference of two integers: " + Difference);
			System.out.println("Product of two integers: " + Product);
			System.out.println("Average of two integers: " + Average);
			System.out.println("Distance of two integers: "+ Distance);
			System.out.println("Max integer: " + Maximum );
			System.out.println("Min integer: " + Minium );
			
						
		}
		

		public static void doExcercise9() {
			int Minutes = 3456789;
			int MinutesofYear = 60*24*365;
			int MinutesofDay =(Minutes/60/24) % 365;
			double Years,Days;
			Years= Minutes/MinutesofYear;
		    Days = MinutesofDay;
		    System.out.println(Minutes+ " minutes is approximately " + Years + " years and " + Days +" days ");
		   
			
		}
		
		
}
