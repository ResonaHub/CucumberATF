Feature: Login flipcart
@LoginPage
Scenario: login on flipcart 
    Given User navigate to flipcart shopping
    When user enter credential
    Then user should on homepage
    
@multipleUserLogin
Scenario Outline: login multiple user
    Given user enter the url
    When enter the userId "<userId>"
    And enter the password "<password>"
    Then all user should login on homepage
    Examples:
    	
    	|userId|password|
    	|7020934512|kailas0101|
    	|7040007049|mom$123|
    	|9665732659|tomandjerry90|
    	|pankajdevagde10@gmail.com|P@nkaj10@|
    	|9767732728|kai$1234|

 @myprofile
 Scenario:
 	Given user should on login page
 	Then user hit on my profile link
 	And user will update the information
 	Then user will logout the flipcart
 
 @buyProduct
 Scenario:
 	When user search the product on search box
 	Then shows the all related product on the page
 	Then user Select The Product
 	And User Click On Add-Cart
 	Then Selected product should buy