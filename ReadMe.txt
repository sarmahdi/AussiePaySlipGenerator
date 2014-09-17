Project Name:		AussiePaySlipGenerator: (Other names that it can be identified with AussieTaxCalculator, 					TaxAndSuperCalculator)

Status:			Complete
Notes			Should auto run on deployment in Tomcat or Glassfish
Frameworks:		SpringMVC, Spring core, Junit, Mockito.
IDE:			NetBeans IDE
Application Servers	GlassFish/Tomcat
JDK:			Java 7


This is an Tax and Super calcultor as per the 2012-2013 ATO given Standards in Australia. A user needs to input an employees data (First name, Last name, annual income, rate for super, payment start date)  and the application computes and generates a payslip that has the pay slip data ( first name, last name, gross income, income tax, net income and super)

> Notes: All calculation results should be rounded to the whole dollar. If >= 50 cents round up to the next dollar increment, otherwise round down.
> 
> 
> The following rates for 2012-13 apply from 1 July 2012.
> 
> Taxable income Tax on this income
> 0 - $18,200 Nil
> $18,201 - $37,000 19c for each $1 over $18,200
> $37,001 - $80,000 $3,572 plus 32.5c for each $1 over $37,000
> $80,001 - $180,000 $17,547 plus 37c for each $1 over $80,000
> $180,001 and over $54,547 plus 45c for each $1 over $180,000
> 
> The tax table is from ATO: http://www.ato.gov.au/content/12333.htm
> 


I have used SpringWebMVC 3 to implment a small web application that can be run on tomcat or glassfish (a required jstl library that is not present in Tomcat by default is also added in the pom.xml; so it works on both Tomcat and Glassfish without issues). It has two views, one to input the employee data and the second one to generate a payslip.
I have made use of Junit4.1.1 and mockito 1.9 to create testcases. Mockito is a mocking framework, i have used it to mock dependency injections.

The project is built through maven 3.0.4, so when running it first time the dependencies might be downloaded. 	

to compile and run the tests, on the project root, just run

$PROJECT_ROOT>mvn clean install

After delpoyment : the URL to application : localhost:8080/AussiePaySlipGenerator

For more of my projects please visit my GitHub : https://github.com/sarmahdi/GitSVNRepo/tree/master


