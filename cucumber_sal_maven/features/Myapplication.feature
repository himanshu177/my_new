Feature: Login Action

@Login_functionality
Scenario: Sucessfull Login with Valid Credentials
Given User is on Home Page
When User navigate to Login Page
	And User enters Username and Password and login button
Then Message Displayed Login Sucessfull


@Display_All_Users
Scenario: Display all the Users in Database
Given User Must be Logged in the Account
When User clicks on Administration
And User Navigates to Database Users
And User select all Users
And User CLick on Go button
Then Message Displayed All Users List ie been Displayed