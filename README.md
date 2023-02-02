# ResolverAssessment
This repo was created to solve the Assessment test given by RESOLVER.

1) First part is the scripts needed for automating the assessment page.
  "src/test/java/resolverAssessment" has the packages for the projects. https://github.com/ShobanaG23/ResolverAssessment/tree/master/src/test/java/resolverAssessment
   1. PageObjects- This package contains all the elements locators and its methods.
   2. TestCases- This package contains all the test case for given 6 scenarios.
   3. BaseClass - This package is used for common methods like setup of the page to test, teardown of the page to test and capturing screenshot.
   4. Utilities- This package contains the file for generating report. I used ExtendReports for this assessment.

2) The Second part is the folders to check the test execution result.
    1. logs - This folder contains the execution logs for each tests. https://github.com/ShobanaG23/ResolverAssessment/tree/master/logs
    2. screenshots - This folder contains the screenshots of all the 6 tests. https://github.com/ShobanaG23/ResolverAssessment/tree/master/screenshots
    3. reports - This folder contains the generated report of all the 6 tests. https://github.com/ShobanaG23/ResolverAssessment/tree/master/reports
    4. Execution_Result.png - This file is the captured screenshot of the report for easy viewing of the executed test results. https://github.com/ShobanaG23/ResolverAssessment/blob/master/Execution_Result.png
    5. test-output - This folder contains tests results. https://github.com/ShobanaG23/ResolverAssessment/tree/master/test-output

3) Third part is the Resources folder - this folder contains the "config.properties" file.( Location :  https://github.com/ShobanaG23/ResolverAssessment/blob/master/resources/config.properties )
   This file contains the location of the "QE-index.html" file(file to be automated).

4) If you want to run it in your local machine, please follow the below steps:
    1) Install Maven
    2) In the "config.properties" change the location of the "QE-index.html" file that is in your local. 
    3) Change the project location in "Run.bat" file.
    4) Clicking the "Run.bat" will start executing the tests. (Location : https://github.com/ShobanaG23/ResolverAssessment/blob/master/Run.bat )
    
5) Dependencies and plugin that are need for the executing the project are listed in this link. 

Note: "QE-index.html" is also present in the project location. https://github.com/ShobanaG23/ResolverAssessment/blob/master/QE-index.html
