# Neo4j Simple Test API

## Running on AWS EC2

This demo is running in a Linux EC2 instance on Amazon Web Services.  The urls are: 
* [Employee API Controller](http://18.232.126.180:8080/swagger-ui.html#/employee-controller "Employee API Controller")
* [Swagger API documentation](http://18.232.126.180:8080/swagger-ui.html "Swagger API documentation")
* [Neo4j Server Browser](http://18.232.126.180:7474/browser/ "Neo4j Browser")

To add a new employee node to the database:
1. Click the POST button in the Swagger UI.  
2. Click the "Try it out" button
3. Fill in the emp_id and name fields.
4. Click "Execute".  The results are displayed in the "Server response" box.

To get the list of employee nodes in the database
1. Click the GET button in the Swagger UI.  
2. Click the "Try it out" button
3. Click "Execute".  The results are displayed in the "Server response" box.

## Notes
* The demo uses a Neo4j server running in the same Linux EC2 instance as the code.  
* Security and encryption are currently off to simplify the setup.

# Building and running

## Pre-requisties
Make sure you have Java and Maven installed.  Instructions for these packages are located here:
* [Download and install Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html "Download and install Java JDK")
* [Download and install Apache Maven](https://maven.apache.org/guides/getting-started/ "Download and install Apache Maven")

## Source Code
The source code is located in this Github project:
   [Github Source Code](https://github.com/gozermon/neo4jTest.git "Github Source Code")

## Neo4j Server
You can use the Neo4j server running in the Linux EC2 instance on Amazon Web Services.  The Neo4J Bolt protocol is located at bolt://18.232.126.180

If desired, you can install your own Neo4j server following the instructions here:
   [Download and install Neo4J Server](https://neo4j.com/docs/operations-manual/current/installation/ "Download and install Neo4J Server")

If using your own Neo4j server, adjust the value of these properties in the Spring Boot application.properties file in the src/main/resources folder:

`spring.data.neo4j.uri=bolt://<your server url>
 spring.data.neo4j.username=<neo4j username>
 spring.data.neo4j.password=<neo4j password>`

The properties files have not yet been externalized.  They must be built into the JAR file.

## Building and Packaging
Once you have the source code, Java and Maven installed, you can build an executable jar using this command from the top-level of the directory where you downloaded the source code:

`C:\projects\neo4jTest>mvn clean package`

Alternatively, you can run the project using this command from the top-level of the directory where you downloaded the source code:

`C:\projects\neo4jTest>mvn clean spring-boot:run`

Use the direct swagger URL here or chang index.html to redirect to Swagger
