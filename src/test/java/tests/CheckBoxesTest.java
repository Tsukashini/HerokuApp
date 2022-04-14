package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class CheckBoxesTest extends BaseTest {
    @BeforeMethod
    public void before() {

        driver.get(WebUrls.CHECKBOXES_URL);
    }

    @Test
    public void firstElementUncheckedTest() {
        WebElement checkbox1 = driver.findElement(By.xpath("//br/preceding::input"));
        Assert.assertTrue(!checkbox1.isSelected(), "Checkbox is checked");
    }
    @Test
    public void CheckedFirstElementTest() {
        WebElement checkbox1 = driver.findElement(By.xpath("//br/preceding::input"));
        checkbox1.click();
        Assert.assertTrue(checkbox1.isSelected(), "Checkbox is unchecked");

    }

    @Test
    public void SecondElementIsCheckedTest() {

        WebElement checkbox2 = driver.findElement(By.xpath("//br/following::input"));
        Assert.assertTrue(checkbox2.isSelected(), "Checkbox is unchecked");
    }

    @Test
    public void SecondElementUncheckedTest() {

        WebElement checkbox2 = driver.findElement(By.xpath("//br/following::input"));
        checkbox2.click();
        Assert.assertTrue(!checkbox2.isSelected(), "Checkbox is checked");
    }


}
