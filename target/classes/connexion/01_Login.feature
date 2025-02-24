@login
Feature: Login
  En tant que utilisateur je souhaite tester la page de connexion

  @login_valid_credential
  Scenario: Login avec des données valides
    Given Je me connecte sur l application Orange
    When Je saisis le username "Admin"
    And Je saisis le mot de passe "admin123"
    And Je clique sur le bouton Login
    Then Redirection vers la page Dashboard "Dashboard"
