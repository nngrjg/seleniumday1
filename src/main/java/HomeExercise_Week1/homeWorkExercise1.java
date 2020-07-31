package HomeExercise_Week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class homeWorkExercise1 {
    WebDriver driver;

    public void browserstart(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.get(url);
    }
    public void singletext(String input){
        driver.findElement(By.xpath("//input[@type=\"text\"][@id=\"user-message\"]")).sendKeys(input);
        driver.findElement(By.xpath("//button[@type=\"button\"][text()=\"Show Message\"]")).click();
        String enteredtext =driver.findElement(By.xpath("//*[@id=\"display\"]")).getText();
        if (input.equalsIgnoreCase(enteredtext)){
            System.out.println("My input is displayed");
        }else{
            System.out.println("My input is not displayed");
        }


    }
    public void doubletext(String da1, String da2){
        driver.findElement(By.xpath("//input[@id=\"sum1\"]")).sendKeys(da1);
        driver.findElement(By.xpath("//input[@id=\"sum2\"]")).sendKeys(da2);
        driver.findElement(By.xpath("//button[text()=\"Get Total\"]")).click();
        String totals =driver.findElement(By.xpath("//*[@id=\"displayvalue\"]")).getText();
        Boolean total =driver.findElement(By.xpath("//*[@id=\"displayvalue\"]")).isDisplayed();
        if (total == true ){
            System.out.println("My output is displayed :" +totals);
        }else{
            System.out.println("My output is not displayed");
        }

    }

    public static void main(String[] args) {
        homeWorkExercise1 hwe1 = new homeWorkExercise1();
        hwe1.browserstart("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        hwe1.singletext("data");
        hwe1.doubletext("5","10");
    }
}
