package HomeExercise_Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Webtable_handles {

    WebDriver driver;

    public void browserstart(String url){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ASUS/IdeaProjects/seleniumday1/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get(url);
        new WebDriverWait(driver,30).
                until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//table//tr//th"))));
    }

    public void tableheader(){
        List<WebElement> alltableheader = driver.findElements(By.xpath("//table//tr//th"));
        for (WebElement tableheader : alltableheader){
            System.out.println("The current table header value is :"+tableheader.getText());
        }
    }
    public void rowandcolumsize(){
        List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
        List<WebElement> colums = driver.findElements(By.xpath("//table//tbody//tr[1]//td"));
        System.out.println("The number of rows in the table is :"+rows.size());
        System.out.println("The number of colums in the table is :"+colums.size());
    }
    public void startswith(String searchvalue){
        List<WebElement> rowsvalues = driver.findElements(By.xpath("//table//tbody//td[1]"));
        for (WebElement ifstartswith : rowsvalues) {
            String rowvaluetocheckstartwith = ifstartswith.getText();
            if (rowvaluetocheckstartwith.startsWith(searchvalue))
                System.out.println("The Company that matched with the search value "+searchvalue+ " is :" + rowvaluetocheckstartwith);
        }
    }

    public void highestcurrentprice(){
        Double higgestcurentpricevalue =0.0;
        List<WebElement> rowsvalues = driver.findElements(By.xpath("//table//tbody//td[4]"));
        for (WebElement forhighestvalue : rowsvalues) {
            String currentprice = forhighestvalue.getText();
            Double currentpricevalue = Double.parseDouble(currentprice);
            if(higgestcurentpricevalue<currentpricevalue){
                higgestcurentpricevalue=currentpricevalue;
            }
        }
        System.out.println("The higgest company value is :"+higgestcurentpricevalue);
    }

    public void forhighesstvaluecompany(){
        Double higgestcurentpricevalue =0.0;
        List<WebElement> rowsvalues = driver.findElements(By.xpath("//table//tbody//td[4]"));
        for (WebElement forhighestvalue : rowsvalues) {
            String currentprice = forhighestvalue.getText();
            Double currentpricevalue = Double.parseDouble(currentprice);
            if(higgestcurentpricevalue<currentpricevalue){
                higgestcurentpricevalue=currentpricevalue;
            }
        }
        String higgestvalue = Double.toString(higgestcurentpricevalue);
        String companynameofhiggestpricevalue=driver.findElement(By.xpath("//td[text()=\""+higgestvalue+"\"]//parent::tr//td[1]")).getText();
        System.out.println("The company "+companynameofhiggestpricevalue+" has the higgest price value of :"+higgestcurentpricevalue);

        }

    public static void main(String[] args) {
        Webtable_handles Webtableobj = new Webtable_handles();
        Webtableobj.browserstart("http://demo.guru99.com/test/web-table-element.php#");
        Webtableobj.tableheader();
        Webtableobj.rowandcolumsize();
        Webtableobj.startswith("C");
        Webtableobj.highestcurrentprice();
        Webtableobj.forhighesstvaluecompany();
    }
}
