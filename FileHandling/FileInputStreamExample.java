import java.io.IOException;
import java.io.FileInputStream;

class FileInputStreamExample{
	public static void main(String[] args) throws IOException{
		FileInputStream fin = new FileInputStream("Example.txt");

		int i;
		do{
			i=fin.read();
			if(i!=-1)
				System.out.print((char)i);
		}while(i!=-1);

		System.out.println("\n\n");
	}
}