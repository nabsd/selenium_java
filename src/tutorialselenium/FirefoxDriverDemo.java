package tutorialselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {
    // PLEASE CHANGE THE EXTENSION TO .java FROM .txt BEFORE RUNNING THE FILE
    public static void main(String[] args) {
        WebDriver driver;
        driver = new FirefoxDriver();
        String baseURL = "http://www.google.com";

        driver.get(baseURL);
    }
}
