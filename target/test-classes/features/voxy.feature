#Author: marlideoliveira2016@gmail.com

Feature: Fluxo login de retorno plataforma voxy
  Como usuario quero acessar pagina inicial para logar na plataforma da voxy	

  Scenario: Login email valido   
   Given acessar o site da voxy "https://web-stage.voxy.com/v2/#/login"
    When digitar email valido
    And clicar em continuar  
    Then validar a mensagem de retorno e fechar pop up 
    
    Scenario: Login email invalido   
    When digitar email invalido
    But em continuar  
    Then validar a mensagem de erro e fechar pop up 

   Scenario: Login telefone valido  
    When preencher telefone valido 
    And clicar em continuar  
    Then validar a mensagem de retorno e fechar pop up 
    
    Scenario: Login telefone invalido   
    When preencher telefone invalido 
    But clicar em continuar  
    Then validar a mensagem de erro e fechar pop up 
    
    Scenario: Login codigo invalido   
    When clicar em tenho um codigo
    And preencher com codigo ficticio
    And clicar em continuar  
    But preencher com dados invalidos
    Then valido a nao habilitacao do botao ativar
    
    Scenario: link suporte   
    When clicar em suporte 
    And preencher informacoes em deixe uma mensagem 
    And clicar em enviar   
    Then valido a mensagem de retorno de email enviado 
        
    Scenario: link ajuda lado esquerdo   
    When clicar em ajuda 
    But clicar em Help Center  
    Then vizualizo informacoes nao disponiveis 
    
    Scenario: link ajuda lado esquerdo   
    When clicar em ajuda 
    But clicar em whats new  
    Then vizualizo informacoes nao disponiveis 

   