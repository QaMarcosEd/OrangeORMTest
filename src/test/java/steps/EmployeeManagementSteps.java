package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.NavigationUtils;

public class EmployeeManagementSteps {
	
	private WebDriver driver;
	private WebDriverWait wait;
	private NavigationUtils navigationUtils;
	
	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        navigationUtils = new NavigationUtils();
	}
	/*
	@After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Fecha o navegador e encerra a sessão do WebDriver
        }
    }
	*/
	@Given("que estou na página {string}")
	public void queEstouNaPágina(String string) {
	    navigationUtils.loginAndNavigateToViewEmployeeList(driver, wait, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", "Admin", "admin123");
	}

	@When("eu clico no botão para adicionar um empregado {string}")
	public void euClicoNoBotãoParaAdicionarUmEmpregado(String string) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
		
	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	    wait.until(ExpectedConditions.urlContains(string));
	}

	@When("eu preencho os campos obrigatórios e clico em salvar")
	public void euPreenchoOsCamposObrigatóriosEClicoEmSalvar() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']")));
		
	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Marcos");
	    driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Eduardo");
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Araujo");
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")));
		
		WebElement submitButton = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));	
		submitButton.click();
	}

	@Then("eu devo ser redirecionado para a pagina de detalhes do empregado")
	public void euDevoSerRedirecionadoParaAPaginDeDetalhesDoEmpregado() {
		
		// Verificar URl
		wait.until(ExpectedConditions.urlContains("viewPersonalDetails/empNumber"));
	}

}
