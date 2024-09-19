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

public class LoginSteps {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Fecha o navegador e encerra a sessão do WebDriver
        }
    }	

	@Given("que o usuário está na página de login")
	public void queOUsuárioEstáNaPáginaDeLogin() {
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("o usuário insere credenciais válidas {string} e {string}")
	public void oUsuárioInsereCredenciaisVálidasE(String username, String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("o usuário clica no botão de login")
	public void oUsuárioClicaNoBotãoDeLogin() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button")));
	    driver.findElement(By.xpath("//button")).click();
	}

	@Then("o usuário deve ser redirecionado para o dashboard")
	public void oUsuárioDeveSerRedirecionadoParaODashboard() {
	    String urlEsperada = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	    String urlAtual = driver.getCurrentUrl();
	    
	    Assert.assertEquals(urlEsperada, urlAtual);
	}
	
	@When("o usuário insere credenciais inválidas {string} e {string}")
	public void oUsuárioInsereCredenciaisInválidasE(String username, String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("o usuario recebe um alerta de crendenciais inválidas")
	public void oUsuarioRecebeUmAlertaDeCrendenciaisInválidas() {
	    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p")));
	    
	    String msgError = driver.findElement(By.xpath("//p")).getText();
	    Assert.assertEquals(msgError, "Invalid credentials");
	}

}
