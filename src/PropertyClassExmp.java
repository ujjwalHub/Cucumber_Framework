import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class PropertyClassExmp {
	Properties properties;

	public void printAllProperties(String path) throws FileNotFoundException {
		try {
			FileReader reader = new FileReader(path);
			properties = new Properties();
			properties.load(reader);
			System.out.println("User Name = "+ properties.getProperty("user"));
			System.out.println("Pasword = "+ properties.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PropertyClassExmp propObj = new PropertyClassExmp();
		propObj.printAllProperties("F:\\Git_Projects\\Cucumber_Framework\\Resources\\userInfo.properties");
	}
}
