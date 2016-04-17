package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByCSSP3 {

    public static void main(String[] args) throws Exception {
        WebDriver driver;
        driver = new FirefoxDriver();

        String baseURL = "http://demostore.x-cart.com/apple-iphone-6.html?category_id=2";
        driver.manage().window().maximize();
        driver.get(baseURL);

        // "#" - id and "." - class
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".btn.add2cart.submit")).click();

    }
}