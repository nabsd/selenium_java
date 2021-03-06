package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByCSSP4 {

    public static void main(String[] args) throws Exception {
        WebDriver driver;
        driver = new FirefoxDriver();

        String baseURL = "http://demostore.x-cart.com/";
        driver.manage().window().maximize();
        driver.get(baseURL);

        // "#" - id and "." - class
        // ^ - represents the starting text
        // $ - represents the ending text
        // * - represents the contains text
        // driver.findElement(By.cssSelector("input[id^='substring-def']")).sendKeys("iphone");
        // driver.findElement(By.cssSelector("input[id$='-default']")).sendKeys("iphone");
        driver.findElement(By.cssSelector("input[id*='string-defa']")).sendKeys("iphone");

    }
}