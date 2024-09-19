Feature: Funcionalidade de Login

  # Cenário de teste para login com credenciais válidas
  Scenario: Login bem-sucedido com credenciais válidas
    Given que o usuário está na página de login
    When o usuário insere credenciais válidas "Admin" e "admin123"
    And o usuário clica no botão de login
    Then o usuário deve ser redirecionado para o dashboard

  # Cenário de teste para login com credenciais inválidas
  Scenario: Login mal-sucedido com credenciais inválidas
  	Given que o usuário está na página de login
  	When o usuário insere credenciais inválidas "usuario" e "admin12345"
  	And o usuário clica no botão de login
  	Then o usuario recebe um alerta de crendenciais inválidas
  