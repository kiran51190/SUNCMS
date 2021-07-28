Feature: Sun user Login page



Scenario: login page
Given enter valid user and password
When click on submit
Then verify user login success

Scenario: Content Management System page
Given click on Content Management System button
Then verify user landed to Home page
