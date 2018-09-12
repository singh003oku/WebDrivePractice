package webDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class httpResponseOfUrl {

	public static int getHttpCode(String testUrl) throws IOException {
		int httpResponse;

		URL url = new URL(testUrl);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.connect();
		httpResponse = connection.getResponseCode();
		return httpResponse;
	}

	public static void main(String[] args) throws IOException {

		// Set the system proeprty for Browser with Driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		// initialization of Browser
		WebDriver driver = new ChromeDriver();
		// Url for which You would to check
		driver.get("http://newtours.demoaut.com/");
		List<WebElement> urllist = driver.findElements(By.tagName("a"));

		for (int j = 0; j < urllist.size(); j++) {

			System.out.println("http Code of the URl " + urllist.get(j).getAttribute("href") + "    :"
					+ +getHttpCode(urllist.get(j).getAttribute("href")));

		}

	}

}
