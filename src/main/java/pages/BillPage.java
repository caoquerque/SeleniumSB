package pages;

import org.openqa.selenium.By;
import support.Verifications;
import support.driver.DriverManager;

import java.time.LocalDateTime;

public class BillPage extends DriverManager {

    By menBill = By.className("dropdown-toggle");
    By menAdd = By.xpath("//li//a[@href='/addConta']");
    By txtName = By.id("nome");
    By btnSave = By.xpath("//button[@type='submit']");

    public void clickOnAddBill() {
        getDriver().findElement(menBill).click();
        getDriver().findElement(menAdd).click();
    }
    public void createBill() {
        Verifications.verifyElementIsClickable(btnSave);
        getDriver().findElement(txtName).sendKeys("Ana " + LocalDateTime.now().toString());
        getDriver().findElement(btnSave).click();
    }

}
