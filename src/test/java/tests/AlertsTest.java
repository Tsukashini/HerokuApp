package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pompages.AlertsPage;

public class AlertsTest extends BaseTest {
    AlertsPage alertsPage;

    @BeforeMethod
    public void before() {

        alertsPage = new AlertsPage(driver);
        alertsPage.openAlertPage();
    }

    @Test
    public void jsAlertClickTest() {
        alertsPage.clickJsAlertButton();
        alertsPage.switchToAccept();

        Assert.assertEquals(alertsPage.getTextResult(), "You successfully clicked an alert", "Alert not accepted");
    }

    @Test
    public void jsConfirmClickTest() {

        alertsPage.clickJsConfirmButton();
        alertsPage.switchToDismiss();
        Assert.assertEquals(alertsPage.getTextResult(), "You clicked: Cancel", "Alert not dismiss");
    }

    @Test
    public void jsPromptClickTest() {
        alertsPage.clickJsPromptButton();
        String message = "prompt text test";
        alertsPage.inputPromptMessage(message);
        alertsPage.switchToAccept();


        Assert.assertEquals(alertsPage.getTextResult(), "You entered: " + message, "Text not equals");
    }
}
