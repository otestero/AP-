@wip
Feature: US1002 Kullanici ortakadimlari Background ile calistirir

  Background: ortak adim
    Given kullanici amazon anasayfasinda

    Scenario: TC04 amazon nutella arama
      And kullanici Nutella icin arama yapar
      Then sonuclarin Nutella icerdigini test eder
      And sayfayı kapatir


      Scenario: TC05 amazon java arama
        And kullanici iphone icin arama yapar
        Then sonuclarin iphone icerdigini test eder
        And sayfayı kapatir