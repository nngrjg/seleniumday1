package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day2framhandle {

        WebDriver driver;

        public void browserstart(String url){
            System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
            driver.get(url);
        }
        public void framehandle(){

            driver.switchTo().frame(0);
            String hed = driver.findElement(By.xpath("/html/body/h1[1]")).getText();
            System.out.println(hed);

        }

    public static void main(String[] args) {
        day2framhandle frame = new day2framhandle();
        frame.browserstart("file:///E:/Study%20material/Selenium/ifram.htm");
        frame.framehandle();

    }}
