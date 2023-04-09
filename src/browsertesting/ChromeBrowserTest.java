package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";

        // 1. Set the Chrome browser
        WebDriver driver = new ChromeDriver();

        // 2. Open URL
        driver.get(baseUrl);

        // Maximise the browser
        driver.manage().window().maximize();

        // We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3. Print the title of the page
        System.out.println(driver.getTitle());

        // 4. Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("Page Source: " + driver.getPageSource());

        // 6. Enter the username to username field
        driver.findElement(By.id("username")).sendKeys("Tom Smith ");

        // 7. Enter password to password field
        driver.findElement(By.id("password")).sendKeys("SuperSecret");

        // 8. Close the browser
        driver.close();
    }

}
