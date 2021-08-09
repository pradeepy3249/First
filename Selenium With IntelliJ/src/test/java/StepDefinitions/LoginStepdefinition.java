package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LoginStepdefinition {

    @Given("launching the browser")
    public void launching_the_browser() {
        System.out.println("hi launching browser");

        ExtentHtmlReporter reports = new ExtentHtmlReporter("C://Users//hp//OneDrive//Desktop//Selenium With IntelliJ//Results//TestResults_TritonApplication.html");
        //ExtentHtmlReporter reports = new ExtentHtmlReporter("C:\\Users\\hp\\OneDrive\\Desktop\\Java RealTime\\Practice_Selenium_June21\\Reports\\reporter.html");
        ExtentReports attchreports = new ExtentReports();
        attchreports.attachReporter(reports);
        ExtentTest tests = attchreports.createTest("Scenario: Adding Functionality","Add two variables");

        tests.log(Status.INFO, "Browser launching started");
        attchreports.flush();
    }
    @When("i navigate to url")
    public void i_navigate_to_url()
    {
        System.out.println("hi navigating to url");

    }
    @Then("close browser")
    public void close_browser()
    {
        System.out.println("hi closing the  browser");
    }
}
