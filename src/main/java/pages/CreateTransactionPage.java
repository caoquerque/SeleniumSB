package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import support.Verifications;
import support.driver.DriverManager;

public class CreateTransactionPage extends DriverManager {

    By menTransaction = By.xpath("//li//a[@href='/movimentacao']");
    By cbbType = By.id("tipo");
    By txtDateTransaction = By.id("data_transacao");
    By txtDatePayment = By.id("data_pagamento");
    By txtDescription = By.id("descricao");
    By txtInterested = By.id("interessado");
    By txtValue = By.id("valor");
    By cbbBill = By.id("conta");
    By rdbStatus = By.id("status_pago");
    By btnSave = By.xpath("//button[@type='submit']");

    public void clickOnTransaction() {
        getDriver().findElement(menTransaction).click();
    }

    public void createTransaction() {
        Verifications.verifyElementIsClickable(btnSave);
        new Select(getDriver().findElement(cbbType)).selectByValue("REC");
        getDriver().findElement(txtDateTransaction).sendKeys("04/12/2021");
        getDriver().findElement(txtDatePayment).sendKeys("04/12/2021");
        getDriver().findElement(txtDescription).sendKeys("PS5");
        getDriver().findElement(txtInterested).sendKeys("Mario");
        getDriver().findElement(txtValue).sendKeys("5000");
        new Select(getDriver().findElement(cbbBill)).selectByIndex(0);
        getDriver().findElement(rdbStatus).click();
        getDriver().findElement(btnSave).click();
    }


}
