package runner;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {

    ChromeOptions options = new ChromeOptions();
    WebDriver driver;
    File file;

    @BeforeClass
    public void beforeclassmethod(){
        driver = new ChromeDriver(options);
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().window().maximize();
        file = new File("src/test/resources/9916518.png");
    }

    @Test
    public void test1(){
        
        driver.findElement(By.id("name")).sendKeys("Sanjeev");
        driver.findElement(By.id("email")).sendKeys("sanjeev01@gmail.com");
        driver.findElement(By.id("gender")).click();
        driver.findElement(By.id("mobile")).sendKeys("9876543210");
        driver.findElement(By.id("dob")).sendKeys("05/04/2006");
        driver.findElement(By.id("subjects")).sendKeys("Computer Science");
        driver.findElement(By.id("hobbies")).click();
        driver.findElement(By.xpath("//textarea[@id='picture']")).sendKeys("INDIA");
        
        WebElement fileinput = driver.findElement(By.xpath("//input[@id='picture']"));
        fileinput.sendKeys(file.getAbsolutePath());

        WebElement el = driver.findElement(By.id("state"));
        Select select = new Select(el);
        select.selectByVisibleText("NCR");

        WebElement el1 = driver.findElement(By.id("city"));
        Select select1 = new Select(el1);
        select1.selectByVisibleText("Agra");

        driver.findElement(By.xpath("//input[@value='Login']")).click();;
    }

    @AfterClass
    public void afterclassmethod() throws Exception {
        Thread.sleep(5000);
        driver.quit();
    }
}
