package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationUtils {
	
    public void loginAndNavigateToViewEmployeeList(WebDriver driver, WebDriverWait wait, String baseUrl, String username, String password) {
        // Acessa a página de login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

        // Realiza a autenticação
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button"))).click();

        // Navega para a página "viewEmployeeList"
        wait.until(ExpectedConditions.urlContains("/dashboard"));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
        
        // Verifica se chegou na página correta
        wait.until(ExpectedConditions.urlContains("viewEmployeeList"));
    }

}
