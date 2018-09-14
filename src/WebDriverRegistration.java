package DemoPakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRegistration {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// open the url which you want
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=fedb645d177d9fff8cf40618c1e3e4ed");
		// Find the First Name Text file and send keys
		driver.findElement(By.name("firstName")).sendKeys("Abhishek");
		// find the last name text field and send text.
		driver.findElement(By.name("lastName")).sendKeys("Singh");
		// find the Phone Text filed and send the Phone number to it.
		driver.findElement(By.name("phone")).sendKeys("971952092");
		// find email id and send mail id to id
		driver.findElement(By.id("userName")).sendKeys("abhics33@gmail.com");
		// find the address text filed and send mail
		driver.findElement(By.name("address1")).sendKeys("This was testing address ");
		// find the city text field and send value to it
		driver.findElement(By.name("city")).sendKeys("Agra");
		// Find State Text field and send value to it
		driver.findElement(By.name("state")).sendKeys("U.P.");
		// find postal code text filed and send postal code to it
		driver.findElement(By.name("postalCode")).sendKeys("122001");
		// find the user name text filed and send value to it
		driver.findElement(By.name("email")).sendKeys("testbond007");
		// find password text field and send it
		driver.findElement(By.name("password")).sendKeys("pass007");
		// find confirm password text field
		driver.findElement(By.name("confirmPassword")).sendKeys("pass007");
		// click at Register Button
		driver.findElement(By.name("register")).click();

	}

}
