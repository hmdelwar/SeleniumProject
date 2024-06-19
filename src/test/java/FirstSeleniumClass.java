import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Scanner;

public class FirstSeleniumClass {
    @Test
    public void loginTest(){
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("[type='submit']")).click();
        String url = driver.getCurrentUrl();
        String expectedurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertTrue(url.contains("dashboard"));
        Assert.assertEquals(url,expectedurl);
        String gg = driver.findElement(By.cssSelector(".oxd-text--h6")).getText();
        System.out.println(gg);
    }
}
