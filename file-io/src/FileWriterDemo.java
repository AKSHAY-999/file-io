import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		String path="src/amazing.txt";
		BufferedWriter writer =null;
		
		try {
			writer=new BufferedWriter(new FileWriter(path,true));
			writer.write("When I see your face");
			writer.newLine();
			writer.write("because you are amazing just the eay you are");
			writer.newLine();

			System.out.println("writing to file completed");
			

		}
		catch(IOException e){
		
			e.printStackTrace();
		}finally {
			try {
				if(writer!=null)
					writer .close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
