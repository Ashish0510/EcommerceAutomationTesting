package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFiles {
	Properties properties;

	public ReadFiles() {
		try {
			properties = new Properties();
			File file = new File("./Configuration/PropertyFile.properties");
			FileInputStream fileInput = new FileInputStream(file);
			properties.load(fileInput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getBaseUrl() {

		String url = properties.getProperty("url");
		if (url != null) {

			return url;
		} else {
			throw new RuntimeException("Url is not specified in the configuration file ");
		}

	}

	public String getBaseBrowser() {
		String broswerString = properties.getProperty("browser");
		if (broswerString != null) {

			return broswerString;
		} else {
			throw new RuntimeException("Browser is not specified in the configuration file ");
		}
	}

}
