Feature: Adding five elements to the amazon shopping cart

Scenario: user add five cameras to the shopping cart

	Given User opens the 'www.amazon.com' web page
	When User searches for 'Best sellers in Digital Cameras'
	And User open the 5th item
	And User adds '8' items
	And User adds all the items to the cart
	And User dismisses the insurance plan	
	Then User verifies if the total price is the correct one