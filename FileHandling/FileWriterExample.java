import java.io.*;

class FileWriterExample{
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("Example2.txt",true);

		String s = "Using File Writer Class.";

		for(int i=0;i<s.length();i++)
			fw.write(s.charAt(i));

		fw.close();
	}
}