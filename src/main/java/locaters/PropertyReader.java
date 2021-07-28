package locaters;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
	
	public static String prop(String key) throws IOException
	{
		Properties pro=new Properties();
		FileInputStream fis=new FileInputStream("src/main/java/utils/data.properties");
		pro.load(fis);
		return pro.getProperty(key);
		
	}
}
