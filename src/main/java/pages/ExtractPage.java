package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import support.Verifications;
import support.driver.DriverManager;

public class ExtractPage extends DriverManager {

    By altSuccess = By.xpath("//div[@role='alert' and contains(text(), 'sucesso')]");
    By menExtract = By.xpath("//li//a[@href='/extrato']");
    By cbbMonth = By.id("mes");
    By cbbYear = By.id("ano");
    By btnFilter = By.xpath("//input[@type='submit']");

    public void Summarizing() {
        if(altSuccess !=null) {
            getDriver().findElement(menExtract).click();
        }
    }

    public void filterMonthAndYear(String month, String year) {
        new Select(getDriver().findElement(cbbMonth)).selectByValue(month);
        new Select(getDriver().findElement(cbbYear)).selectByValue(year);
        getDriver().findElement(btnFilter).click();
    }

    public void deleteItems(String description, String paymentDate, String value, String status) {
        String xpath = "//table[@id='tabelaExtrato']//tbody//tr";
        By tbody = By.xpath(xpath);
        int numberOfLines = getDriver().findElements(tbody).size();
        By tDescription, tPayment, tValue, tStatus, tActions;
        String vDescription, vPayment, vValue, vStatus;

        for (int i = 1; i <= numberOfLines; i++ ) {
            tDescription = By.xpath(xpath + "["+ i +"]//td[1]");
            tPayment = By.xpath(xpath + "["+ i +"]//td[2]");
            tValue = By.xpath(xpath + "["+ i +"]//td[4]");
            tStatus = By.xpath(xpath + "["+ i +"]//td[5]");
            tActions = By.xpath(xpath + "["+ i +"]//td[6]//a//span");

            vDescription = getDriver().findElement(tDescription).getText();
            vPayment = getDriver().findElement(tPayment).getText();
            vValue = getDriver().findElement(tValue).getText();
            vStatus = getDriver().findElement(tStatus).getText();

            if(description.equals(vDescription) && paymentDate.equals(vPayment) &&
                    value.equals(vValue) && status.equals(vStatus)) {
                getDriver().findElement(tActions).click();
                Verifications.verifyElementIsVisible(altSuccess);
                numberOfLines--;
                i = 1;
            }
        }
    }
}
