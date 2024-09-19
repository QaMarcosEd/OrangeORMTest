Feature: Gestão de Empregados

  # Cenário para adicionar um novo empregado
  Scenario: Adicionar um novo empregado com sucesso
  	Given que estou na página "viewEmployeeList"
    When eu clico no botão para adicionar um empregado "addEmployee"
    When eu preencho os campos obrigatórios e clico em salvar
    Then eu devo ser redirecionado para a pagina de detalhes do empregado

  # Cenário para adicionar um novo empregado e adicionar detalhes e login
  Scenario: Adicionar um empregado com detalhes de login
  	Given que estou na página "viewEmployeeList"
    When eu clico no botão "Add Employee"
    And preencho os campos obrigatórios com dados do empregado
    And clico no botão de toggle para criar os detalhes de login
    And preencho os campos obrigatórios de login
    And clico no botão "Save"
    Then vejo a mensagem de sucesso "Empregado adicionado com sucesso"
    
	# Cenário para tentar adicionar um empregado com campos obrigatórios vazios
	@ignore
	Scenario: Tentar adicionar um empregado com campos obrigatórios vazios
  	Given que estou na página "viewEmployeeList"
	  When eu clico no botão "Add Employee"
	  And eu deixo os campos obrigatórios vazios e clico em "Save"
	  Then eu devo ver uma mensagem de erro indicando que os campos obrigatórios precisam ser preenchidos
	  And o empregado não deve ser adicionado à lista
	  
	# Cenário para editar informações de um empregado existente
	@ignore
  Scenario: Editar as informações de um empregado existente
  	Given que estou na página "viewEmployeeList"
    And que um empregado "Charlotte Smith" existe
    And clico no icone de caneta para editar os dados do empregado
    When eu altero as informações do empregado e clico em "Save"
    Then as informações atualizadas devem ser refletidas na lista
    
	# Cenário para tentar editar um empregado deixando um campo obrigatório vazio
	@ignore
	Scenario: Tentar editar um empregado com um campo obrigatório vazio
  	Given que estou na página "viewEmployeeList"
    And que um empregado "Charlotte Smith" existe
	  When clico no icone de caneta para editar os dados do empregado
	  And eu deixo um campo obrigatório vazio
	  And clico no botão "Save"
	  Then recebo um aviso no campo vazio
	  And não consigo atualizar o empregado
	  
  # Cenário para excluir um empregado
  @ignore
  Scenario: Excluir um empregado existente
  	Given que estou na página "viewEmployeeList"
    And que um empregado "Charlotte Smith" existe
    When eu clico no icone lixeira para o empregado
    And confirmo a exclusão
    Then o empregado deve ser removido da lista
    And recebo uma confirmação que o empregado foi removido "Successfully Deleted"
    
    
	# Cenário para visualizar os detalhes de um empregado
	@ignore
	Scenario: Visualizar os detalhes de um empregado
	  Given que estou na página "viewEmployeeList"
	  And um empregado "Charlotte Smith" existe
	  When eu clico no nome do empregado
	  Then eu devo ser redirecionado para a página de detalhes do empregado
	  And eu devo ver as informações do empregado, como nome, cargo e departamento

    