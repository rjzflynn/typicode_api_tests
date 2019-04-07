typicode_api_tests
===

### Prerequisites

* Java 8 installed
* Apache Maven installed :  https://maven.apache.org/install.html

---

##### Running the tests.
From project root run commands:

* Run all tests and generate report `mvn site -DgenerateReports=false`
* Run only smoke Tests `mvn -Dtest=*SmokeTests test`

(Surefire HTML report is generated to /target/site/surefire-report.html)



##### Comments
Test framework is REST Assured (http://rest-assured.io/) which is pretty much the market leader for automated API testing in Java. It's a nice, simple framework, with a fluid API and readable BDD inspired syntax.

JUnit and Maven are standards in the Java ecosystem.

The bare-bones / smoke tests are all contained in the package typicode_tests.smokeTests

This package contains tests for fetching , creating, updating and deleting all the resources available at http://jsonplaceholder.typicode.com/

Class typicode_tests.postsTests.PostsTest shows how I would begin to further build out the tests going into more complicated assertions. There are two tests there for the /posts resource.
