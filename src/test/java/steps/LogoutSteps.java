package steps;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.UserAuthentication;

public class LogoutSteps {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private UserAuthentication userAuthetication;
	
	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        userAuthetication = new UserAuthentication();
	}
	
	@After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Fecha o navegador e encerra a sessão do WebDriver
        }
    }
	
	@Given("que estou autenticado no sistema")
	public void queEstouAutenticadoNoSistema() {
		userAuthetication.login(driver, wait, "Admin", "admin123");
	}

	@When("clico no link para deslogar no sistema")
	public void clicoNoLinkParaDeslogarNoSistema() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class, 'oxd-userdropdown-tab')]")));
	    driver.findElement(By.xpath("//span[contains(@class, 'oxd-userdropdown-tab')]")).click();
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']"))); 
	    driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	@Then("sou redirecionado para a pagina de login")
	public void souRedirecionadoParaAPaginaDeLogin() {
	    String urlAtual = driver.getCurrentUrl();
	    Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", urlAtual);
	}

}
