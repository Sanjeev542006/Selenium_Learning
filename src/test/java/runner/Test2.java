package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
    ChromeOptions options = new ChromeOptions();
    WebDriver driver ;
    @BeforeClass
    public void beforeclassmethod(){
        driver = new ChromeDriver(options);
        driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
        driver.manage().window().maximize();
    }

    @Test
    public void testMethod() throws Exception {
        String currpage = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@title='New Tab']")).click();
//        Thread.sleep(2000);
        driver.switchTo().window(currpage);

    }

    @Test
    public void test1(){
        //newtest method
    }

    @AfterClass
    public void aftermethod(){
        driver.quit();
    }


}
