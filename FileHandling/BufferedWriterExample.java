import java.io.*;

class BufferedWriterExample{
	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("Example1.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Java Programming");
		bw.close();

	}
}