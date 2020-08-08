package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Prg1day5excerise extends baseclass{

    public void dropdown(int n){
        WebElement dropdown = driver.findElement(By.xpath("//select[@name=\"state\"]"));
        Select choosedropdpwn = new Select(dropdown);
        choosedropdpwn.selectByIndex(n);

    }
    public void fillform(){
        browserstart("https://www.seleniumeasy.com/test/input-form-demo.html");
        try {
            screenshot("\\resources\\screenshot\\","Before filling form");
            driver.findElement(By.xpath("//input[@name=\"first_name\"]")).sendKeys("Naga");
            driver.findElement(By.xpath("//input[@name=\"last_name\"]")).sendKeys("Raj");
            driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("nng@gmail.com");
            driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("9874563210");
            driver.findElement(By.xpath("//input[@name=\"address\"]")).sendKeys("Add1");
            driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("cty");
            dropdown(8);
            driver.findElement(By.xpath("//input[@name=\"zip\"]")).sendKeys("12345");
            driver.findElement(By.xpath("//input[@name=\"website\"]")).sendKeys("www.test.com");
            driver.findElement(By.xpath("//input[@type=\"radio\"][@value=\"yes\"]")).click();
            driver.findElement(By.xpath("//textarea[@placeholder=\"Project Description\"]")).sendKeys("Test");
            new WebDriverWait(driver,30).
                    until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//textarea[@placeholder=\"Project Description\"]"))));
            screenshot("\\resources\\screenshot\\", "After filling form");
            driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        } catch (NoSuchElementException e){
            System.out.println("Exception thrown  :" + e);
        } catch (ElementNotSelectableException e){
            System.out.println("Exception thrown  :" + e);
        } finally {
            endprogram();
        }
    }

    public static void main(String[] args) {
        Prg1day5excerise day5obj = new Prg1day5excerise();
        day5obj.fillform();
    }
}
