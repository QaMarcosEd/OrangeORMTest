Feature: Funcionalidade de Logout

  # Cenário de teste para logout
  Scenario: Logout bem-sucedido
  Given que estou autenticado no sistema
  When clico no link para deslogar no sistema
  Then sou redirecionado para a pagina de login
