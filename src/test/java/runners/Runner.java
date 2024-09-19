package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/employee_management.feature", // Ajuste para o diretório de features, se necessário
        glue = "steps", // Pacote das definições de passos
        tags = "not @ignore", // Filtra cenários com base em tags
        plugin = {"pretty", "html:target/report-html", "json:target/report.json"}, // Plugins para relatórios
        stepNotifications = true, // Habilita notificações de passos
        monochrome = true, // Torna a saída dos testes mais legível
        snippets = SnippetType.CAMELCASE, // Gera snippets em CamelCase
        dryRun = false // Define se deve rodar os testes ou apenas verificar os passos
)
public class Runner {

}