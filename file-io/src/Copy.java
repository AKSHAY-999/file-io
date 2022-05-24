import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) {
		FileInputStream infile=null;
		FileOutputStream outfile= null;
		try {
			infile=new FileInputStream("D:/dump/communication and network concepts.pdf");
			outfile = new FileOutputStream("D:/dump/p2.pdf");
			System.out.println("Copying");
			int ch=0;
			long ms1=System.currentTimeMillis();
			while(true) {
				ch=infile.read();
				if(ch==-1)break;
				outfile.write(ch);
				
			}
			long ms2=System.currentTimeMillis();
			System.out.println("File copied succedfully in "+(ms2=ms1)+ " ms");
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				infile.close();
				outfile.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
