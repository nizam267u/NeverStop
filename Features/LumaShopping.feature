Feature: valid user can purchase the men jacket.


@sanity
Scenario Outline: User can login the application with valid credentials and purchase the specific men's jacket


Given Users already in the landing page and verify the user information on the landing page

When Users should be able to select <specific> jacket from men module

And Verify the jacket name <specific> on the list

And User should be able to select the <size> and <color> and <quantity> then click on the add to cart
 
And User should be able to Click on the cart

And User should be able to click on the checkout

And User should be able to enter the shipping details and click on the Next

And User should be able to verify the shipping address and place the order

Then User should be able to verify the order number and get text on the screen “Thank you for your purchase!”


Examples:

|        specific                  |  size 	|  color   | quantity |         
|    Jupiter All-Weather Trainer   |    M   |   Blue   |    1     |


