import java.util.Scanner;

public class greetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// I love Side Hustle
		
		System.out.println("I love Side Hustle");
		
		System.out.println("Good progress");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a grade");
		
		int n = scan.nextInt();
		if (n >= 90 && n <= 100) {
			System.out.println("A");
		}else if (n >= 80 && n < 90) {
			System.out.println("B");
		}else if (n >= 70 && n < 80) {
			System.out.println("C");
		}else if (n >= 60 && n < 70) {
			System.out.println("D");
		}else if (n >= 50 && n < 60) {
			System.out.println("E");
		}else if (n>= 0 && n< 50) {
			System.out.println("F");
			
		}else 
			System.out.println("The number you have entered is not in the range");
	}
}


