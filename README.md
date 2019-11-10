# StandardCalcREST
Calculator REST API

This is a simple implementation of a REST API for a basic calculator.
The implementation is done using spring framework and is configured as a spring boot application. The application is build using maven.

There are two controllers defined for standard and scientific operations.

- Standard Calculator: Has following operators
	1. Add - Can be used to add two decimal numbers.
	   URL - http://localhost:8080/standard/add?a=-5&b=10
	2. Subtract - Can be used to subtract two decimal numbers.
	   URL - http://localhost:8080/standard/sub?a=-5&b=10
	3. Multiply - Can be used to multiply two decimal numbers.
	   URL - http://localhost:8080/standard/mul?a=-5&b=10
	4. Add - Can be used to divide two decimal numbers.
	   URL - http://localhost:8080/standard/div?a=-5&b=10

   Some basic validations to check if the inputs are valid numbers or not is performed.
	   
- Scientific Calculator: Has following operators
	1. Square - Can be used to get the square of a number.
	   URL - http://localhost:8080/scientific/square?a=10
	2. Square root - Can be used to  numbers.
	   URL - http://localhost:8080/scientific/root?a=10
	3. Factorial - Can be used to calculate factorial of a number.
	   URL - http://localhost:8080/scientific/factorial?a=10
	4. Prime number - Can be used to check if a number is prime or not.
	   URL - http://localhost:8080/scientific/prime?a=10

   Some basic validations to check if the input is a valid number or not is performed.

Deploy:
Clone this github project and run "mvn spring-boot:run" from the terminal to build the project and deploy on a local server. Can also be build as jar.
	
	

