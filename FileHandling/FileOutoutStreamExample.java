import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamExample {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("Example.txt",true);
		String s = "Hello World!!";
		
		char ch[] = s.toCharArray();
		
		for(int i =0;i<ch.length;i++) {
			fout.write(ch[i]);
		}

		fout.close();
	}
}
