#Author: Abhinav rana
#Feature Definition for searching available blogs

@tag
Feature: Blog Search

  Background: User navigates to wordpress site
    Given I am on Abhinav Rana blog site

  Scenario: Search TDD and BDD blog
    When I enter "TDD" in the search text
    And I clicked on search action
    Then "Software development Process : TDD and BDD" blog should be opened

  Scenario: Search Design pattern blog
    When I enter "design pattern" in the search text
    And I clicked on search action
    Then "Chain of Responsibility Design Pattern" blog should be opened

  Scenario: Search Git command blog
    When I enter "Git" in the search text
    And I clicked on search action
    Then "Git commands" blog should be opened

  Scenario: Search Design pattern blog
    When I enter "Date" in the search text
    And I clicked on search action
    Then "Date Format Utility with ThreadLocal" blog should be opened
    