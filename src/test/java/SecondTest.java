import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SecondTest {

    WebDriver driver = new ChromeDriver();



//    @Test
//    public void testSearch(){
//        String searchItem = "dhaka";
//        driver.navigate().to("https://www.google.com/");
//        driver.findElement(By.id("APjFqb")).sendKeys(searchItem);
//        driver.findElement(By.name("btnK")).click();
//        String xyz = driver.findElement(By.cssSelector("[data-attrid='title']")).getText();
//        if(searchItem.equals(xyz.toLowerCase(Locale.ROOT))){
//            System.out.println(true);
//        }
//    }

    @Test
    public void demoqaTextBox(){
        driver.navigate().to("https://demoqa.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> elements = driver.findElements(By.cssSelector(".card-body>h5"));

        for(WebElement i : elements){
            if(i.getText().equals("Elements")){
                i.click();
                break;
            }
            //System.out.println(i.getText());
        }
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("element"));
        String [] sendingItems = {"Hossain Delwar", "hossain@delwar.com"};
        driver.findElement(By.id("item-0")).click();
        driver.findElement(By.id("userName")).sendKeys(sendingItems[0]);
        driver.findElement(By.id("userEmail")).sendKeys(sendingItems[1]);
        driver.findElement(By.id("currentAddress")).sendKeys(sendingItems[0]);
        driver.findElement(By.id("permanentAddress")).sendKeys(sendingItems[0]);
        driver.findElement(By.cssSelector(".btn-primary")).click();
        System.out.println("Hello World");
//        List<WebElement>x = driver.findElements(By.className("border col-md-12 col-sm-12"));
//        for(WebElement i : x){
//            System.out.println(i);
//        }

    }
}
