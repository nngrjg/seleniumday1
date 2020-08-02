package HomeExercise_Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class Radiobutton {
    WebDriver driver;

    public void browserstart(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get(url);
    }

    public void selectradio(String entersex){
        if (entersex=="Male"){
        driver.findElement(By.xpath("(//input[@type=\"radio\"][@name=\"optradio\"])[1]")).click();
        } else{
            driver.findElement(By.xpath("(//input[@type=\"radio\"][@name=\"optradio\"])[2]")).click();
        }
        driver.findElement(By.xpath("//button[@id=\"buttoncheck\"]")).click();
        String actualsexvalue=driver.findElement(By.xpath("//p[@class=\"radiobutton\"]")).getText();
        String expectedsexvalue="Radio button '"+entersex+"' is checked";
        if(expectedsexvalue.equalsIgnoreCase(actualsexvalue)){
            System.out.println("The selected sex :"+actualsexvalue);
        }

    }

    public static void main(String[] args) {
        Radiobutton radiobuttonobj = new Radiobutton();
        radiobuttonobj.browserstart("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
        radiobuttonobj.selectradio("Male");
        radiobuttonobj.selectradio("Female");

    }
}
