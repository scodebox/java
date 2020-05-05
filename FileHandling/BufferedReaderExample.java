import java.io.*;

class BufferedReaderExample{
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("Example1.txt");
		BufferedReader br = new BufferedReader(fr);

		int ch;

		// Process 1.
		// while((ch = br.read() )!= -1){
		// 	System.out.print((char)ch);
		// }

		// Process 2.
		String s;
		while((s=br.readLine()) != null){
			System.out.println(s);
		}

		// Process 3.
		// char c[] = new char[20];
		// br.read(c,3,15);
		// System.out.println(c);



		br.close();
		System.out.println("\n\n");
	}
}