# Automação de Testes - Gestão de Empregados

Este projeto contém scripts automatizados para testar a funcionalidade de Gestão de Empregados do sistema OrangeHRM. Os testes são escritos utilizando Selenium WebDriver, Cucumber e JUnit.

## Estrutura do Projeto

- **src/test/java**: Contém as definições dos passos e classes utilitárias.
- **src/test/resources**: Contém os arquivos de features escritos em Gherkin.

## Ferramentas e Tecnologias

- **Java**: Linguagem de programação usada para os testes.
- **Selenium WebDriver**: Ferramenta para automação de interação com o navegador.
- **Cucumber**: Framework de BDD utilizado para definir os cenários de teste em Gherkin.
- **JUnit**: Framework de testes usado para rodar os testes do Cucumber.
- **Maven**: Ferramenta para gestão de dependências e build do projeto.
- **WebDriverManager**: Gerencia automaticamente os binários dos drivers de navegador.

## Pré-requisitos

1. **Java**: Certifique-se de ter o JDK 21 ou superior instalado.
2. **Maven**: Certifique-se de que o Maven está instalado e configurado.
3. **Navegador Firefox**: Os testes estão configurados para rodar utilizando o Firefox.
4. **GeckoDriver**: O WebDriverManager gerenciará o download e a configuração do GeckoDriver.

## Funcionalidades Implementadas 
Os testes simulam cenários de gestão de empregados, como adicionar, atualizar e deletar registros de empregados.
A classe NavigationUtils lida com o login e navegação para as páginas relevantes,
garantindo que todos os testes comecem de um estado consistente.

## Problemas Conhecidos

- Os testes podem abrir várias janelas do navegador devido a problemas de configuração. Certifique-se de que apenas uma instância do navegador esteja ativa por vez.
- Alguns cenários ainda estão em desenvolvimento, então nem todos os testes estão totalmente implementados.

## Melhorias Futuras
- Implementar mais casos de teste para editar e deletar empregados.
- Otimizar a configuração da instância do navegador para evitar a abertura de múltiplas janelas.
- Refatorar o código para melhorar a reutilização e modularidade.
