
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {

    @Test
        public void firstTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://next.privat24.ua/");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@data-qa-node='login']")).click();

        Assert.assertEquals("https://next.privat24.ua/", driver.getCurrentUrl());

        }
    }
