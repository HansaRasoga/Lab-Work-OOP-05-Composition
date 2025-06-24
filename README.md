# These are the questions of lab sheet 05

Object Oriented Programming I 

Lab Sheet 5 

Composition 


1. Create a class called Customer that includes three instance variables: id (int), name (String) 
and gender (char). The class contains: 
• A constructor that creates a Customer with the specified id, name and gender. 
• Provide get methods for each instance variable. 
• Provide a method toString takes no arguments and returns "name(id)". 
• Write a test program called TestCustomer to test the Customer class. 


2. Create a class called Account that includes three instance variables: accNo (int), cus-tomer (of 
the class Customer you have just created, assume that each account has one and only one 
customer) and balance (double(initialized to 0.0)). The class contains: 
• Two constructors: 
• Provide get methods for each instance variable. 
• Provide set balance method. 
• Provide a method toString takes no arguments and returns "name(id) balance = Rs 
xx.xx" (Balance rounded to 2 decimal places). 
• Provide a method called deposit that deposit money to an Account (Add deposit amount 
to balance). 
• Provide a method called withdraw that withdraws money from an Account. 
if (balance >= amount) 
balance = balance - amount 
else 
print a message "Withdraw amount exceeded account balance." 
• Write a test program called TestAccount to test the Account class.