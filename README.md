Assignment

Libraries Used :
1. Selenium - Web Automation
2. TestNG - Unit Testing Library
3. Apache Commons IO - library of utilities for developing IO functionality.

Note : All the aforementioned libraries are open-source and does not include any license.

Capabilities:
1. This framework has the capability to run the tests in local and Jenkins.
2. Web Tests can be run on chrome.
3. Configuration can be changed from config.properties inside src/test/resources
4. Screenshots will be captured into screenshots folder on test failure
5. Integration with Jenkins for scheduling is easy. 

Adding more tests :

Prerequisites: Java 8+ , Maven 3.6.3 Installed and path set

1. Tests should be added as per the convention followed. 
2. New testng tests should be created inside the src/test/java folder.
3. All the tests should extend BaseTest.java
4. Tests should interact only with the Facade layer. This can be used to wrap the business logic. Facade layer is currently merged with page objects layer due to scale of test being small. For better management this will be separated in future versions

Running Tests :
Prerequisites: Java 8+ , Maven 3.8.6 Installed and path set

1. There are multiple ways to run the tests. During development phase you can use the testng.xml present in the root folder to run. Right click and choose run.
2. Testng xml file should contain the test classes to pick for the run.
3. User can also choose to run via maven commands which is highly recommended.
4. mvn clean test - To run the test available in the testng.xml



