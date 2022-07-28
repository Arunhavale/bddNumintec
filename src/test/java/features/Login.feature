Feature: Login feature
 Verify if the agent is able to Login into site
 
#cenario: Login as a authenticated
  #Given agent is on loginpage
  #When agent enters username 
  #And agent enters password
  #And click on Login button
  #Then check agent is logged in


Scenario: Invalid username does not allow to login
  Given agent is on loginpage
  When agent enters invalid username 
  And agent enters password
  And click on Login button
  Then check agent is logged in
  
#cenario: Invalid password should not allow to login
#	 Given agent is on loginpage
#	 When agent enters username 
#	 And agent enters invalid password
#	 And click on Login button
#	 Then check agent is logged in 

#Scenario: empty username and empty password should not allow to login
#	  Given agent is on loginpage
#	  When agent enters no username 
#	  And agent enters no password
#	  And click on Login button
#	  Then check agent is logged in
	  
