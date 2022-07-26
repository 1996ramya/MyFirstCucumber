Feature: Login Functionality Feature
@adminLogin
Scenario:
Validate Login test
Given navigates to orangehm
When user logs in using Username as "Admin"
And password as "Qedge123!@#"
When user click login button
Then user should validate  url text
Then user close browser
@UserMultipleData
Scenario Outline: User Validation with multiple data
Given User Launch Url in Browser
When I enter Username as "Admin"
And I Enter Password as"Qedge123!@#"
When  i click login button
When I click Admin
When I click AddBtn
When  i Select "<UserRole>" in user role
When i Enter "<EmployeeName>" in ename
When I Enter "<UserName>" in username 
When I Enter "<Password>" in password
When I Enter "<cpassword>" in cpassword
When I click on save button 
Then I vallidate Url
Then I close Browser
Examples:
|UserRole|EmployeeName|UserName|Password|cpassword|
|Admin|Abhi Shek|jaykumar458|Testcucumber_12345!@$|Testcucumber_12345!@$|
|ESS|AA123 RRR|rajeshjay563|Testcucumber_12345!@$|Testcucumber_12345!@$|
|Admin|Aarti Sakhare|Aartimoham567|Testcuucmber_12345!@$|Testcuucmber_12345!@$|
|ESS|AYUN Demo|manogna234|Testcucumber_12345!@$|Testcucumber_12345!@$|
|Admin|ANATHA LAKSHMI|harikumar432|Testcucumber_12345!@$|Testcucumber_12345!@$|




