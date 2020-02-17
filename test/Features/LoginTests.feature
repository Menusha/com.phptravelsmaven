Feature: Test functionalities on login page of the application 

#senario01
Scenario: Verify if a user will be able to login with a valid username and valid password  
Given Open the Chrome and launch the application			
When Enter valid Username and valid Password			
Then Click on the login button
Then Verify message and close the browser

#senario02
Scenario: Verify if a user cannot login with a valid username and an invalid password  
Given Open the Chrome and launch the application			
When Enter invalid Username and valid Password			
Then Click on the login button
Then Verify message and close the browser

#senario03
Scenario: Verify the login page for both, when the field is blank and Login button is clicked  
Given Open the Chrome and launch the application			
When Enter valid Username and invalid Password			
Then Click on the login button
Then Verify message and close the browser

#senario04
Scenario: Verify the login page for both, when the field is blank and Login button is clicked  
Given Open the Chrome and launch the application			
When Enter empty Username and empty Password			
Then Click on the login button
Then Verify message and close the browser

#senario05
Scenario: Verify user logout  
Given Open the Chrome and launch the application			
When Enter valid Username and valid Password			
Then Click on the login button
Then Verify user logout succesfully
