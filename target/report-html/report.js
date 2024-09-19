$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/employee_management.feature");
formatter.feature({
  "name": "Gestão de Empregados",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Adicionar um novo empregado com sucesso",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que estou na página \"viewEmployeeList\"",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.EmployeeManagementSteps.queEstouNaPágina(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchSessionException: WebDriver session does not exist, or is not active\nBuild info: version: \u00274.20.0\u0027, revision: \u0027866c76ca80\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.2\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCommand: [dd9d3bcb-62f5-476a-b1ae-239b7d137605, findElement {using\u003dname, value\u003dusername}]\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 130.0, moz:accessibilityChecks: false, moz:buildID: 20240829075237, moz:geckodriverVersion: 0.35.0, moz:headless: false, moz:platformVersion: 10.0, moz:processID: 7388, moz:profile: C:\\Users\\marco\\AppData\\Loca..., moz:shutdownTimeout: 60000, moz:webdriverClick: true, moz:windowless: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, userAgent: Mozilla/5.0 (Windows NT 10....}\nSession ID: dd9d3bcb-62f5-476a-b1ae-239b7d137605\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)\r\n\tat org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:167)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:138)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:50)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:190)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:66)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:349)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:194)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:190)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:203)\r\n\tat utils.NavigationUtils.loginAndNavigateToViewEmployeeList(NavigationUtils.java:14)\r\n\tat steps.EmployeeManagementSteps.queEstouNaPágina(EmployeeManagementSteps.java:43)\r\n\tat ✽.que estou na página \"viewEmployeeList\"(file:///D:/eclipse-workspace/orangehrm-test/src/test/resources/features/employee_management.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "eu clico no botão para adicionar um empregado \"addEmployee\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EmployeeManagementSteps.euClicoNoBotãoParaAdicionarUmEmpregado(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "eu preencho os campos obrigatórios e clico em salvar",
  "keyword": "When "
});
formatter.match({
  "location": "steps.EmployeeManagementSteps.euPreenchoOsCamposObrigatóriosEClicoEmSalvar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "eu devo ser redirecionado para a pagina de detalhes do empregado",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.EmployeeManagementSteps.euDevoSerRedirecionadoParaAPaginDeDetalhesDoEmpregado()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Adicionar um empregado com detalhes de login",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: Could not start a new session. Response code 500. Message: Failed to decode response from marionette \nHost info: host: \u0027LAPTOP-3EO36ULF\u0027, ip: \u002710.0.0.127\u0027\nBuild info: version: \u00274.20.0\u0027, revision: \u0027866c76ca80\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002721.0.2\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCommand: [null, newSession {capabilities\u003d[Capabilities {acceptInsecureCerts: true, browserName: firefox, moz:debuggerAddress: true, moz:firefoxOptions: {}}]}]\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:114)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:75)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:61)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:162)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:518)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:232)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:161)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:155)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:150)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:132)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:127)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:112)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:102)\r\n\tat steps.EmployeeManagementSteps.setUp(EmployeeManagementSteps.java:29)\r\n",
  "status": "failed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
});