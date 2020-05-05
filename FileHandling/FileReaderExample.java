import java.io.*;

class FileReaderExample{
	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("Example2.txt");

		int ch;

		while((ch=fr.read())!=-1)
			System.out.print((char)ch);

		fr.close();

	}
}