import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	       Scanner input = new Scanner(System.in, "UTF-8");
		
		System.out.println("Please enter number a ");
        int a = input.nextInt();
        System.out.println("Please enter number b ");
        int b = input.nextInt();
        
		int c = 5;
		int d = 7;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		System.out.println("a/5 " + (a/c));
		System.out.println("a/7 " + (a/d));
		System.out.println("b/5 " + (b/c));
		System.out.println("b/7 " + (b/d));
		
		   input.close();
	}

}