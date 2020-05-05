import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadFileAsString{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(args[0]));

		try{
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while(line != null){
				sb.append(line);
				sb.append("\n");
				line  = br.readLine();
			}

			System.out.println(sb.toString());
		}finally{
			br.close();
		}
	}
}
