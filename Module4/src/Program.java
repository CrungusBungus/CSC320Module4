import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		System.out.println("Enter the grades within the class (an amount between 0 and 100):");
		float min = 100;
		float max = 0;
		float total = 0;
		for (int i = 0; i < 10; i++) {
			Scanner g = new Scanner(System.in);
			float grade = g.nextFloat();
			if (grade > 100) {
				grade = 100;
			} else if (grade < 0) {
				grade = 0;
			}
			if (grade < min) {
				min = grade;
			} else if (grade > max) {
				max = grade;
			}
			total += grade;
		}
		float average = total / 10;
		System.out.println("Class Average: " + average);
		System.out.println("Class Lowest: " + min);
		System.out.println("Class Highest: " + max);
	}
}
