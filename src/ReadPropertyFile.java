package DemoPakage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static FileInputStream fs;
	public static void main(String[] args) throws IOException {
		try {

		 fs = new FileInputStream("C:\\Users\\abhishek\\Desktop\\test.properties");
		} catch (Exception e) {
			// TODO: handle exception
		}
		Properties pro = new Properties();
		pro.load(fs);

		System.out.println(pro.getProperty("google"));

	}

}
