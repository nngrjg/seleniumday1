package Day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class day2alerthandle {
    WebDriver driver;
    Alert alert = new Alert() {
        public void dismiss() {
            driver.switchTo().alert().dismiss();
        }

        public void accept() {
            driver.switchTo().alert().accept();
        }

        public String getText() {
            String alerttext=driver.switchTo().alert().getText();
            return alerttext;
        }

        public void sendKeys(String s) {
            driver.switchTo().alert().sendKeys(s);
            driver.switchTo().alert().accept();
        }
    };


    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
    }

    public void confirmationalert() {
        driver.findElement(By.xpath("(//button[@class=\"btn btn-default btn-lg\"])[1]")).click();
        System.out.println(alert.getText());
        alert.accept();
    }
    public void simplealert() {
        driver.findElement(By.xpath("(//button[@class=\"btn btn-default\"])[1]")).click();
        System.out.println(alert.getText());
        alert.accept();
    }
    public void promptalert() {
        driver.findElement(By.xpath("(//button[@class=\"btn btn-default btn-lg\"])[2]")).click();
        System.out.println(alert.getText());
        alert.sendKeys("sendvalue");

    }

    public static void main(String[] args) throws InterruptedException {

        day2alerthandle alt1 = new day2alerthandle();
        alt1.setup();
        alt1.confirmationalert();
        alt1.simplealert();
        alt1.promptalert();


    }
}



