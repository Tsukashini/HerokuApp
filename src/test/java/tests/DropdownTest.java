package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

import java.util.List;

public class DropdownTest extends BaseTest {

    @Test
    public void dropDownAllOptionsExistTest() {

        driver.get(WebUrls.DROPDOWN_URL);
        Select select = new Select(driver.findElement(By.id("dropdown")));
        Assert.assertEquals(select.getOptions().size(), 3, "Not all options exist");
    }

    @Test
    public void dropDownOption1SelectedTest() {

        driver.get(WebUrls.DROPDOWN_URL);
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByIndex(1);
        Assert.assertTrue(driver.findElement(By.cssSelector("[value='1']")).isSelected(), "Options 1 doesn't selected");

    }

    @Test
    public void dropDownOption2SelectedTest() {

        driver.get(WebUrls.DROPDOWN_URL);
        Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByIndex(2);
        Assert.assertTrue(driver.findElement(By.cssSelector("[value='2']")).isSelected(), "Options 2 doesn't selected");

    }
}
