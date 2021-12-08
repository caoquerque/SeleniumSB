package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import support.data.DataYaml;
import support.driver.DriverManager;

import java.util.HashMap;
import java.util.Map;

public class NewUserPage extends DriverManager {

    Faker faker;
    Map mapper;


    public NewUserPage() {
        faker = new Faker();
        mapper = new HashMap();
    }

    By menNewUser = By.xpath("//li//a[@href='/cadastro']");
    By txtName = By.id("nome");
    By txtEmail = By.id("email");
    By txtPassword = By.id("senha");
    By btnRegister = By.xpath("//input[@type='submit']");

    public void acessarPaginaNovoUsuario() {
        getDriver().findElement(menNewUser).click();
    }

    public void cadastrarUsuario() {
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String fullName = firstName + " " + lastName;
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@gft.com";
        String password = "1234";

        getDriver().findElement(txtName).sendKeys(fullName);
        getDriver().findElement(txtEmail).sendKeys(email);
        getDriver().findElement(txtPassword).sendKeys(password);
        getDriver().findElement(btnRegister).click();

        mapper.put("name", fullName);
        mapper.put("user", email);
        mapper.put("pass", password);
        DataYaml.setMapYamlValues("Usuarios", "usuario", mapper);
    }
}
