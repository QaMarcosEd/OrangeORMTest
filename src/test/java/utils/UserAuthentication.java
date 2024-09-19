package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserAuthentication {

    public void login(WebDriver driver, WebDriverWait wait, String username, String password) {
        // Acessa a página de login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Espera até que os elementos de login sejam visíveis
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

        // Insere as credenciais
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

        // Clica no botão de login
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button"))).click();
    }
}

