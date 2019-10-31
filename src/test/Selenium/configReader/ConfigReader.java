package configReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	String ProFileLoc= "config/configaration.properties";
	void ConfigReader() throws IOException {
		File file=new File(ProFileLoc);
		FileInputStream infile=new FileInputStream (file);
		Properties prop=new Properties();
		prop.load(infile);
		String browser=prop.getProperty("browser");
		System.out.println("browser selectedv from the properties"+browser);
		
		
	}

}
