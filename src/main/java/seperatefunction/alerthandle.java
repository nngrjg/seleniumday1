package seperatefunction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class alerthandle {
    WebDriver driver;
    Alert alert = new Alert() {
        public void dismiss() {
            driver.switchTo().alert().dismiss();
        }

        public void accept() {
            driver.switchTo().alert().accept();
        }

        public String getText() {
            String alerttext = driver.switchTo().alert().getText();
            return alerttext;
        }

        public void sendKeys(String s) {
            driver.switchTo().alert().sendKeys(s);
            driver.switchTo().alert().accept();
        }
    };
}
