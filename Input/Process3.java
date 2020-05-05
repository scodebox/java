import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Process3 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("String :: ");
		String s = br.readLine();
		System.out.println(s);
		
		System.out.print("Integer :: ");
		int i = Integer.parseInt(br.readLine());
		System.out.println(i);
		
		System.out.print("Double :: ");
		double d = Double.parseDouble(br.readLine());
		System.out.println(d);
	}
}
