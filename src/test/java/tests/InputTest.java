package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class InputTest extends BaseTest {

    @Test
    public void InputIncTest() {

        driver.get(WebUrls.INPUTS_URL);
        WebElement input = driver.findElement(By.xpath("//div[@class='example']/input"));
        input.click();
        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_UP);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='example']/input")).getAttribute("value"), "3", "Key ARROW UP is worked");
    }

    @Test
    public void InputDecTest() {

        driver.get(WebUrls.INPUTS_URL);
        WebElement input = driver.findElement(By.xpath("//div[@class='example']/input"));
        input.click();
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='example']/input")).getAttribute("value"), "-3", "Key ARROW DOWN is worked");
    }
}
