@Feature2
Feature: To validate the account creation of fb application

@Sanity
Scenario: To create new account
Given To launch the browser and maximize the window
When To launch url of fb application
And To click the create new account button

# One dimensional map data 
And To pass firstname in firstname text box
#Key       value
|firstname1|vinoth|
|firstbname2|sam|
|firstname3|vijay|
|firstname4|priya|
And To pass secondname in secondname text box

#Two dimensional map data
And To pass mobileno or email in email text box
|password1|password2|password3|
|5136531216|ssdvfbtv|58731641|
|efsdv56|cds6562|95312465|
|ec298652|cdsdcc|65262653|


And To create new password using new password text box
Then TO close the chrome browser
