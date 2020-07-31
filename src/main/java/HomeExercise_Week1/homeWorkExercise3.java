package HomeExercise_Week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class homeWorkExercise3 {
    WebDriver driver;

    public void browserstart(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.get(url);
    }
    public void framechage(String data){
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]")));
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(data);
        driver.switchTo().defaultContent();
    }
    public void iframeinframe(String data2){
        driver.findElement(By.xpath("//*[text()=\"Iframe with in an Iframe\"]")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe")));
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div/div/iframe")));
        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(data2);

    }
    public static void main(String[] args) {
        homeWorkExercise3 hwe3 = new homeWorkExercise3();
        hwe3.browserstart("http://demo.automationtesting.in/Frames.html");
        hwe3.framechage("test");
        hwe3.iframeinframe("test2");

    }
}
