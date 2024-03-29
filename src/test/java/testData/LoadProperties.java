package testData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
	public static Properties userData = LoadProperties(System.getProperty("user.dir")+ "//src/main//java/properties//userdata.properties" );
	
	public static Properties LoadProperties (String path) 
	{
		Properties pro = new Properties();
		try {
			FileInputStream stream = new FileInputStream(path);
			pro.load(stream);
		} catch (FileNotFoundException e) 
		{
			System.out.println("Error Occured" + e);
		} catch (IOException e) 
		{
			System.out.println("Error Occured" + e);
		}
		return pro ;
		
	}
}
