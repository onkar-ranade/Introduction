import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Practice\\geckodriver.exe");
		WebDriver wd=new FirefoxDriver();
		
		wd.get("https://gmail.com");
		System.out.println(wd.getTitle());

	}

}
