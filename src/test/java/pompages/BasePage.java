package pompages;

import org.openqa.selenium.WebDriver;

abstract class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
