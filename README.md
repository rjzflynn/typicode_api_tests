typicode_api_tests
===

### Prerequisites

* Java 8 installed
* Apache Maven installed :  https://maven.apache.org/install.html

---

##### Running the tests.
From the root of the project commands:

Run all tests and generate report `mvn site -DgenerateReports=false`
Run only smoke Tests `mvn -Dtest=*SmokeTests test`

(Surefire HTML report is generated to /target/site/surefire-report.html)
