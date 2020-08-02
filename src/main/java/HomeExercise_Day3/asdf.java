package HomeExercise_Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class asdf {
    package Day3class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

    public class Newcheck {
        WebDriver driver;

        public void setup(){
            System.setProperty("webdriver.chrome.driver", "C:/Users/ELCOT/IdeaProjects/training class/src/main/resources/driver-1/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://demo.guru99.com/test/radio.html");
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        }

        public void check(){
            //driver.findElement(By.xpath("//*[@value='Option 1']")).click();
            List<WebElement> RadiobuttoElements = driver.findElements(By.xpath("//*[@type=\"radio\"]"));
            for (WebElement e: RadiobuttoElements)

            {
                e.click();
                System.out.println("value of the element----"+ e.getAttribute("value"));
            }

            driver.findElement(By.xpath("//*[@type=\"checkbox\"][2]")).click();


        }

        public static void main(String[] args) {
            Newcheck radiobutton = new Newcheck();
            radiobutton.setup();
            radiobutton.check();
        }

    }


}
