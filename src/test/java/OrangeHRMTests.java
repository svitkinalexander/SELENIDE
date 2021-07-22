import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class OrangeHRMTests {

    @Test
    public void testGoogleSearch() throws InterruptedException {
        open("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        $("#txtUsername").setValue("Admin");
        $("#txtPassword").setValue("admin123");
        $("#btnLogin").click();
        Assert.assertEquals($("h1").getText(), "Dashboard", "Wrong page");
        Thread.sleep(20000);
    }
}