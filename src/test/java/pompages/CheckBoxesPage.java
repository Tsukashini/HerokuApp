package pompages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class CheckBoxesPage extends BasePage{

    ///Classical POM
    private By FIRST_CHECKBOX = By.xpath("//br/preceding::input");
    private By SECOND_CHECKBOX = By.xpath("//br/following::input");

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckBoxesPage(){
        driver.get(WebUrls.CHECKBOXES_URL);
    }

    public void firstCheckBoxClick () {
        driver.findElement(FIRST_CHECKBOX).click();
    }

    public void secondCheckBoxClick () {
        driver.findElement(SECOND_CHECKBOX).click();
    }

    public boolean isFirstCheckBoxSelected (){
        return driver.findElement(FIRST_CHECKBOX).isSelected();
    }

    public boolean isSecondCheckBoxSelected (){
        return driver.findElement(SECOND_CHECKBOX).isSelected();
    }
}
