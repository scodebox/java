import java.io.IOException;
import java.util.Scanner;

public class Process2 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("String :: ");
		String s = sc.nextLine();
		System.out.println(s);
		
		System.out.print("Integer :: ");
		int i = sc.nextInt();
		System.out.println(i);
		
		System.out.print("Double :: ");
		double d = sc.nextDouble();
		System.out.println(d);
	}
}
