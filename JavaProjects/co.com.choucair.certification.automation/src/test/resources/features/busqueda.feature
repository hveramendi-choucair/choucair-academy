#Autor Henry Veramendi

@stories
Feature: Search Product
  As a customer, I want to search a product at online store opencart.abstracta.us

  @escenario1
  Scenario: Search for a product
    Given a customer wants to search a product at the online store
    When he search for term Sony on the online store
    Then he find a product called Sony Vaio