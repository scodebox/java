import java.io.File;
import java.io.IOException;

class FileClassExample{
	public static void main(String[] args) throws IOException{
		
		File f = new File("Example.txt");

		f.createNewFile();
		
		System.out.println("Is exist : "+f.exists());
		System.out.println("Can write : "+f.canWrite());
		System.out.println("Name : "+f.getName());
		System.out.println("Size : "+f.length());

		f.delete();
	}
}