#Autor Henry Veramendi

@stories
Feature: Category Monitors
  As a customer, I want view products by a category at online store opencart.abstracta.us

  @escenario1
  Scenario: View products by category
    Given a customer wants to view products by category at the online store
    When he select for the category Monitors on the online store
    Then he should see products by Monitors category