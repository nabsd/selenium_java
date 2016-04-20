package basicweb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


// Please change the extension of the file to .java
// I added .txt because udemy currently does not allow to add .java files
public class SeleniumTest {
    private WebDriver ffdriver;
    private WebDriver crdriver;
//    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

//    System.setProperty("webdriver.chrome.driver", "/Users/cagreek/Desktop/projects/selenium/chromedriver");
    private String baseUrl;


    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "/Users/cagreek/Desktop/projects/selenium/chromedriver");

        ffdriver = new FirefoxDriver();
        baseUrl = "http://www.letskodeit.com/";
        ffdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        ffdriver.manage().window().maximize();


        crdriver = new ChromeDriver();
        crdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        crdriver.manage().window().maximize();


    }

    @Test
    public void testSelenium() throws Exception {
        ffdriver.get(baseUrl + "/");
        ffdriver.findElement(By.id("i90scv3glabel")).click();
        ffdriver.findElement(By.linkText("Practice")).click();

        crdriver.get(baseUrl + "/");
        crdriver.findElement(By.id("i90scv3glabel")).click();
        crdriver.findElement(By.linkText("Practice")).click();

    }





    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        // driver.quit();
    }
}