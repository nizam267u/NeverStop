package never.us.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public static Logger log;
	public static Properties prop;
	public static FileInputStream file;
	public static WebDriver driver;

	public BasePage() {

		log = Logger.getLogger("QA Nizam...........");
		prop = new Properties();
		PropertyConfigurator.configure("Log4j.properties");

		try {
			file = new FileInputStream("./src/main/java/never/us/config/Config.properties");
			prop.load(file);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Serialization..................");
		}
		log.info("Property setup is done inside the Constructor ");
	}

	public static void initialization() {
		System.out.println("Test " + driver);
		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equalsIgnoreCase("chrome")) {
			log.info("ChromeDriver/chrome browser is used.......");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("edge")) {
			log.info("edge browser is used.................");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			log.info("edge browser is used.................");
			WebDriverManager.firefoxdriver();
			driver = new FirefoxDriver();
		}
		log.info("Maximizing the browser....................");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		log.info("Enter the URL.............................");
		driver.get(prop.getProperty("URL"));
		// driver.navigate().to("https://magento.softwaretestingboard.com/");

	}

}
