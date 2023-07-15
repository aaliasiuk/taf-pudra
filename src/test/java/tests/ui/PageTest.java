package tests.ui;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Page;

public class PageTest extends BaseTest {
    @Test
    public void testLoginWithInvalidCreds() {
        Page page = new Page(driver);
        page.getUrl().clickLoginLink().keyEmail("email@test.com").keyPassword("invalidpassword").clickEnterButton();
        Assert.assertEquals(page.getErrorMessage(), page.errorMessage);
    }
}
