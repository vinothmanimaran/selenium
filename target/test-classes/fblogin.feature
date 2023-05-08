@Feature1
Feature: To Validate the login functionality of facebook application

Background:
Given User to launch the browser and maximize the window

@Regression
Scenario: To validate login with valid username and invalid password
When TO launch the url of the facebook application 
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To check whether navigate to the home page or not 
Then To close the browser

@Smoke
Scenario Outline: To validate the positive and negative combination of login functionality
When User has to hit the facebook url 
And user has to pass the data "<emaildatas>" in email field
And User has to pass the data "<passworddatas>"in password field
And User has to click login button
Then User has to close the browser

Examples:

[emaildatas]        [passworddatas]
[vino@gmail.com]    [1q2w3e]
[vinowfdv@gmail.com][1q2w3esas]
[vinowacs@gmail.com][1qsasa2w3e]
[vino234r@gmail.com][1q234w3e]
[vinofwesv@gmail.com][1q234rt2w3e]

