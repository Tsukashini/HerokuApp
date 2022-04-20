package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pompages.CheckBoxesPage;

public class CheckBoxesTest extends BaseTest {
    CheckBoxesPage checkBoxesPage;

    @BeforeMethod
    public void before() {
        checkBoxesPage = new CheckBoxesPage(driver);
        checkBoxesPage.openCheckBoxesPage();
    }

    @Test
    public void firstElementUncheckedTest() {
        Assert.assertTrue(!checkBoxesPage.isFirstCheckBoxSelected(), "Checkbox is checked");
    }

    @Test
    public void CheckedFirstElementTest() {
        checkBoxesPage.firstCheckBoxClick();
        Assert.assertTrue(checkBoxesPage.isFirstCheckBoxSelected(), "Checkbox is unchecked");

    }

    @Test
    public void SecondElementIsCheckedTest() {

        Assert.assertTrue(checkBoxesPage.isSecondCheckBoxSelected(), "Checkbox is unchecked");
    }

    @Test
    public void SecondElementUncheckedTest() {

        checkBoxesPage.secondCheckBoxClick();
        Assert.assertTrue(!checkBoxesPage.isSecondCheckBoxSelected(), "Checkbox is checked");
    }


}
