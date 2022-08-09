package day6;

public class Contructor {
	// input: string
	// output: all space ==> replace "_"
	// space day cuoi ==> remove
	public static void doExcercise6(String s1) {

		String s2 = s1.trim();
		String s3 = s2.replace(" ", "_");
		System.out.println(s3);

	}

	public static void doExcercise7(String input) {
		String[][] printArray = new String[5][5];
		for (int i = 0; i < printArray.length; i++) {
			int count = 0;
			for (int j = 0; j < printArray[0].length; j++) {
				System.out.print(input);
				count++;
				if (count < printArray[0].length) {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
