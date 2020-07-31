package HomeExercise_Week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class homeWorkExercise2 {

    WebDriver driver;

    public void browserstart(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.get(url);
    }
    public void delete(){
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("delete");
        driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
        String alerttext =driver.switchTo().alert().getText();
        System.out.println("Alert Text :"+alerttext);
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
    }
    public static void main(String[] args) {
        homeWorkExercise2 hwe2 = new homeWorkExercise2();
        hwe2.browserstart("http://demo.guru99.com/test/delete_customer.php");
        hwe2.delete();

    }


}
