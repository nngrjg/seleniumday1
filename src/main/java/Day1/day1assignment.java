package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1assignment {

    public static void main(String[] args) {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.seleniumframework.com/Practiceform/");
        driver.findElement(By.name("name")).sendKeys("Nagraj");
        driver.findElement(By.className("validate[required,custom[email]]")).sendKeys("nag@gmail.com");
        driver.findElement(By.name("telephone")).sendKeys("987462");
        driver.findElement(By.name("country")).sendKeys("india");
        driver.findElement(By.name("company")).sendKeys("hcl");
        driver.findElement(By.name("message")).sendKeys("message");
        driver.findElement(By.xpath("//*[@id=\"presscore-contact-form-widget-3\"]/form/p/a[1]")).click();


    }
}



