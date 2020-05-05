import java.io.UnsupportedEncodingException;

public class Encoding {
	public static void main(String[] args) throws UnsupportedEncodingException{
		String s = "hello world";
		byte[] b = s.getBytes("UTF-8");
		System.out.println(b);
		
		//Decoding
		String s2 = new String(b,"UTF-8");
		System.out.println(s2);
	}
	
}