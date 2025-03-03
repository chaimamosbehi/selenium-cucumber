@admin
Feature: admin
  En tant que utilisateur je souhaite tester la page Admin

  Background: 
    Given Je me connecte sur l application Orange
    When Je saisis le username "Admin"
    And Je saisis le mot de passe "admin123"
    And Je clique sur le bouton Login
    Then Redirection vers la page Dashboard "Dashboard"

  @Recherche_username
  Scenario: Rechercher un user
    When Je clique sur le menu admin
    And Je saisis un Username "admin"
    And je clique sur le bouton Search
    Then Je vérifie l'affichage de user saisis "Admin"

  @Add_new_user
  Scenario: Ajouter un user
    When Je clique sur le menu admin
    When Je cliquer sur le bouton Add
    And Je selectionne le User Role
    And Je selectionne status
    And Je saisis un password "azerty123"
    And Je saisis employee Name "FName Mname LName"
    And Je clique sur employee Name
    And je saisis le nom utilisateur "chaima"
    And je saisis confirm password "azerty123"
    And Je clique sur le bouton Save
    Then Vérifier l'affichage du nouvel utilisateur "chaima"