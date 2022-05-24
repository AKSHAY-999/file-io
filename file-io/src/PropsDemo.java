import java.io.FileReader;
import java.util.Properties;

public class PropsDemo {
	public static void main(String[] args) throws Exception {
		FileReader reader =  new FileReader("D:\\communication and network concepts.pdf");
		
		Properties p= new Properties();
		p.load(reader);
		System.out.println(p.getProperty("name"));
		System.out.println("age");
		System.out.println("city");
		
	}

}
