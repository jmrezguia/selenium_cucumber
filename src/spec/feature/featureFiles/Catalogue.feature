@catalog
Feature: Je veux faire une recherche dans le catalogue
  En tant que utilisateur je veux faire une recherche dans le catalogue

  Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Log In
    Then Je me redirige vers la page Home "Dashboard"

  @catalogue-valid
  Scenario: Je veux faire une recherche dans le catalogue
    When Je clique sur le bouton Catalog
    And Je clique sur le bouton Products
    And Je saisis le nom de produit "pc"
    And Je clique sur le bouton Search

  @catalogue-invalid
  Scenario: Je veux faire une recherche dans le catalogue
    When Je clique sur le bouton Catalog
    And Je clique sur le bouton Products
    And Je saisis le nom de produit "verre"
    And Je clique sur le bouton Search
