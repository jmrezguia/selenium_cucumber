@authentification
Feature: je souhaite vérifier la page de connexion
  En tant que utilisateur je souhaite vérifier la page de connexion

  @authentification-valid
  Scenario: Je souhaite vérifier la page de connexion
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Log In
    Then Je me redirige vers la page Home "Dashboard"

  @authentification-invalid
  Scenario: Je souhaite vérifier la page de connexion
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "example@gmail.com"
    And Je saisis le password "test"
    And Je clique sur le bouton Log In
    Then Je verifie le message d erreur "Login was unsuccessful. Please correct the errors and try again"

  @logout
  Scenario: Je souhaite me deconnecter
    Given Je me connecte sur l application nopCommerce
    When Je saisis l email "admin@yourstore.com"
    And Je saisis le password "admin"
    And Je clique sur le bouton Log In
    When Je clique sur le bouton Logout
