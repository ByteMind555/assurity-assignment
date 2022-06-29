# Getting Started
## **Steps to execute the solution**

Step 1: Build the application with command **mvn clean:install**

Step 2: Open the code: 
	Class		- "**FunctionalTest.java**" in  
	Package		-  **com.assurity.api.test.init**

Step 3: Run as TestNG test in class FunctionalTest.java

Step 4: Validate the output

Note: We can enable Jenkins Jobs for the test to be triggered when the git commit hook is invoked. Helps in proper CI/CD pipelining.

## **Problem statement**

Using GET API given below create an automated test with the listed acceptance criteria:


API = https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false

 

## **Acceptance Criteria:**

1. Name = "Carbon credits"
2. CanRelist = true
3. The Promotions element with Name = "Gallery" has a Description that contains the text "Good position in category"

## **Instructions:**

Your test needs to be written using a programming language of your choice (not a tool like SoapUI). Ensure you include a clear ReadMe
Submit your test to us in a format that lets us execute and review the code (it must be submitted in a public repository like Bitbucket or Github)
Your test must validate all the three acceptance criteria
Points will be awarded for meeting the criteria, style and the use of good practices and appropriate use of source control
