Feature: Automation Exercise Page Automation

Background:
Given Login into the application

Scenario: Validate the selected items added to cart
When Click add to cart button the Blue Top
And Wait for popup msg to load  
And Click the popup button Continue shoping 
And Click  add to cart button the Sleeveless Dress
And Click the popup button Continue shoping1 
And Wait for popup msg to load1
And Click add to  cart button the Men Tshirt 
And Click the popup button Continue shoping2 
And Wait for popup msg to load2
And Click cart button to see watever product we choosed 
And Click ProocedToCheckOut button to place our order
And Click placeorder to complete shopping
And Enter Name On Card "Varsha Karan"
And Enter Card Number  "4000000000001000"
And Enter CVC Number  "901"
And Enter Expiration Month  "11"
And Enter Expiration Year  "2029"
And Click Pay and ConfirmButton
And Wait till Order Placed page gets loaded
And Order Placed Successfully


 
