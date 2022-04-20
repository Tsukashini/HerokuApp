package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;


public class AlertsPage extends BasePage {

    private By JS_ALERT_BUTTON = By.xpath("//button[text()='Click for JS Alert']");
    private By JS_CONFIRM_BUTTON = By.xpath("//button[text()='Click for JS Confirm']");
    private By JS_PROMPT_BUTTON = By.xpath("//button[text()='Click for JS Prompt']");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertPage(){
        driver.get(WebUrls.ALERT_URL);
    }

    public void clickJsAlertButton() {
        driver.findElement(JS_ALERT_BUTTON).click();
    }

    public void clickJsConfirmButton() {
        driver.findElement(JS_CONFIRM_BUTTON).click();
    }

    public void clickJsPromptButton() {
        driver.findElement(JS_PROMPT_BUTTON).click();
    }

    public void switchToAccept() {
        driver.switchTo().alert().accept();
    }

    public void switchToDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public void inputPromptMessage(String message) {
        driver.switchTo().alert().sendKeys(message);
    }

    public String getTextResult() {
        return driver.findElement(By.id("result")).getText();
    }
}
