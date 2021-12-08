package pages;

import support.driver.DriverManager;

public class InitialPage extends DriverManager {

    public void acessarAplicacao(){
        getDriver().get(configuration.url());
    }
}
