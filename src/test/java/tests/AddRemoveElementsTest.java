package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class AddRemoveElementsTest extends BaseTest{

    @Test
    public void AddAndRemoveTest() {
        driver.get(WebUrls.ADD_REMOVE_ELEMENTS_URL);
        WebElement addElement = driver.findElement(By.xpath("//button[text()='Add Element']"));
        addElement.click();
        addElement.click();
        driver.findElement(By.xpath("//button[text()='Delete']")).click();
        Assert.assertEquals(driver.findElements(By.xpath("//button[text()='Delete']")).size(), 1, "Expected 1 element displayed, but displayed " + driver.findElements(By.xpath("//button[text()='Delete']")).size());
    }

}
