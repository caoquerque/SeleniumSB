package pages;

import org.openqa.selenium.By;
import support.Verifications;
import support.data.DataYaml;
import support.driver.DriverManager;

import java.util.HashMap;
import java.util.Map;

public class UserLoginPage extends DriverManager {

    Map mapper;

    public UserLoginPage() {
        mapper = new HashMap();
    }

    By txtEmail = By.id("email");
    By txtPassword = By.id("senha");
    By btnLogin = By.xpath("//button[@type='submit']");

    public void Login() {
        Verifications.verifyElementIsClickable(btnLogin);
        mapper = DataYaml.getMapYamlValues("Usuarios", "usuario");
        String email = mapper.get("user").toString();
        String password = mapper.get("pass").toString();

        getDriver().findElement(txtEmail).sendKeys(email);
        getDriver().findElement(txtPassword).sendKeys(password);
        getDriver().findElement(btnLogin).click();
    }


 }
