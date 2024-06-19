import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class CalculatorTest {
    @Test
    public void gasCalculator(){
        WebDriver driver = new ChromeDriver();
        Random r = new Random();
        driver.navigate().to("https://www.calculator.net/");
        driver.findElement(By.name("calcSearchTerm")).sendKeys("gas");
        driver.findElement(By.id("bluebtn")).click();
        driver.findElement(By.xpath("//*[@id=\"calcSearchOut\"]/div/a")).click();
        //Assert.assertTrue(driver.getCurrentUrl() == "https://www.calculator.net/gas-mileage-calculator.html");
        String[] x = {"uscodreading", "uspodreading", "usgasputin","usgasprice"};
        driver.findElement(By.name(x[0])).clear();
        driver.findElement(By.name(x[0])).sendKeys(Integer.toString(r.nextInt(950,1000)));
        driver.findElement(By.name(x[1])).clear();
        driver.findElement(By.name(x[1])).sendKeys(Integer.toString(r.nextInt(900,950)));
        driver.findElement(By.name(x[2])).clear();
        driver.findElement(By.name(x[2])).sendKeys(Integer.toString(r.nextInt(10)));
        driver.findElement(By.name(x[3])).clear();
        driver.findElement(By.name(x[3])).sendKeys(Double.toString(r.nextDouble(10)));
        driver.findElement(By.name("x")).click();
    }
}
