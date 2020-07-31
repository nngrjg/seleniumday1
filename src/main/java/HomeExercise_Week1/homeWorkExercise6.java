package HomeExercise_Week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class homeWorkExercise6 {
    WebDriver driver;

    public void browserstart(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.get(url);
    }
    public void singleselect(){
        WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"select-demo\"]"));
        Select choosedropdpwn = new Select(dropdown);
        choosedropdpwn.selectByVisibleText("Saturday");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void mutiselect(){
        WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"multi-select\"]"));
        Select choosedropdpwn = new Select(dropdown);
        choosedropdpwn.selectByVisibleText("New Jersey");
        choosedropdpwn.selectByIndex(4);
        choosedropdpwn.selectByValue("Pennsylvania");
    }
    public void getallselectedvalues(){
        WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"multi-select\"]"));
        Select choosedropdpwn = new Select(dropdown);
        List <WebElement> dropdownoption= choosedropdpwn.getAllSelectedOptions();
        for (WebElement foralloption : dropdownoption){
            System.out.println("The selected option from multi-select is :"+foralloption.getText());
        }
    }

    public void deselect(){
        WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"multi-select\"]"));
        Select choosedropdpwn = new Select(dropdown);
        choosedropdpwn.deselectAll();
    }
    public void close(){
        driver.close();
    }

    public static void main(String[] args) {
        homeWorkExercise6 hwe6 = new homeWorkExercise6();
        hwe6.browserstart("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        hwe6.singleselect();
        hwe6.mutiselect();
        hwe6.getallselectedvalues();
        hwe6.deselect();
        hwe6.close();

    }
}
