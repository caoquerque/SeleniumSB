package pages;

import org.openqa.selenium.By;
import support.driver.DriverManager;

public class UserLogoutPage extends DriverManager {

    By menLogout = By.xpath("//li//a[@href='/logout']");

    public void logout() {
        getDriver().findElement(menLogout).click();
    }
}
