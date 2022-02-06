package AcreditareQA24.features;


import AcreditareQA24.steps.*;
import AcreditareQA24.utils.EnvConstants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void maximise(){
        driver.manage().window().maximize();
        driver.get(EnvConstants.BASE_URL);
    }
    @Before
    public void adminmaximise(){
        driver.manage().window().maximize();
        driver.get(EnvConstants.ADMIN_BASE_URL);
    }
    @Steps
    protected AdminSteps adminSteps;
    @Steps
    protected BlogSteps blogSteps;
    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected SearchSteps searchSteps;
    @Steps
    protected CartSteps cartSteps;
    @Steps
    protected RegisterSteps registerSteps;
    @Steps
    protected CheckoutSteps checkoutSteps;
    @Steps
    protected ShopSteps shopSteps;
    @Steps
    protected ProductSteps productSteps;
}

