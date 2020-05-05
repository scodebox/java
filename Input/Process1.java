import java.io.IOException;

public class Process1{
	public static void main(String[] args) throws IOException{
		
		System.out.print("INPUT : ");

		int i = System.in.read();

		System.out.println(i);
		System.out.println((char)i);
	}
}