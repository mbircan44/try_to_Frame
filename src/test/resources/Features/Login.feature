@login
Feature: Login
  Scenario:  Successfull login
    Given  user navigate landing page
    When enter valid credemtials and click login
    Then verify welcome message
