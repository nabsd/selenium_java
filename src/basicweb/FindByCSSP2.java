package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByCSSP2 {

    public static void main(String[] args) throws Exception {
        WebDriver driver;
        driver = new FirefoxDriver();

        String baseURL = "http://demostore.x-cart.com/";
        driver.manage().window().maximize();
        driver.get(baseURL);

        // "#" - id and "." - class

        // driver.findElement(By.cssSelector(".title")).click();
        // driver.findElement(By.cssSelector("div.title")).click();
        driver.findElement(By.cssSelector("div[class=title]")).click();

    }
}