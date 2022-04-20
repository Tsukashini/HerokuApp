package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class DragAndDropTest extends BaseTest{
    @Test
    public void dragAndDrop(){
        driver.get(WebUrls.DRAG_AND_DROP_URL);
        Actions action = new Actions(driver);
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
       action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='droppable']/p")).getText(), "Dropped!", "Element not dropped");
    }
}
