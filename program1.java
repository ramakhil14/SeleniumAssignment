package handsOnSeleium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;


public class program1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://drivers/chrome/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		

	}

}
