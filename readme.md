Neo4j Simple Test API

Running on AWS EC2
------------------
This demo uses a Neo4j server running in a Linux EC2 instance on Amazon Web Services.  The Neo4j browser can be reached
at this url: http://18.232.126.180:7474/browser/  Sevcurity and encryption are currently off to simplify the setup.



Building and running
--------------------

Make sure you have Java () and Maven installed.  Instructions are located here:
    https://www.oracle.com/technetwork/java/javase/downloads/index.html
    https://maven.apache.org/guides/getting-started/

This demo uses a Neo4j server running in a Linux EC2 instance on Amazon Web Services. If desired, install your own Neo4j server following the instructions here:
    https://neo4j.com/docs/operations-manual/current/installation/
If using your own Neo4j server, change the value of these properties in the application.properties file:
    spring.data.neo4j.uri=bolt://<your server url>
    spring.data.neo4j.username=<neo4j username>
    spring.data.neo4j.password=<neo4j password>


Download the source code from this Github project.



AWS EC2
instance IP: 18.232.126.180
instance ID: i-07f11d26d7bdc7f6b
default user name for the AMI: ec2-user

Bolt URL: 18.232.126.180:7687

"C:\Program Files\PuTTY\pscp" -i C:\projects\neo4jtest\src\docs\neotest.ppk C:\Users\gozer\Downloads\neo4j-community-3.4.5-unix.tar.gz ec2-user@18.232.126.180:/home/ec2-user/


The task is to develop a simple API that would process input data, communicate with Neo4J and return the results to the client.

The API - REST or GraphQL will support 2 operations:

1. Create an Employee node
This operation will take 2 params - a String and an int. The String value will populate the name property of the
new Employee node, the int value will populate the emp_id value.
Don't worry about data validation etc.

    2. Return all Employee nodes to the client. Any format is fine.
For the actual implementation use Java (Spring boot, Dropwizard, Spark java etc) or Javascript (NodeJS + Express etc).

For your API - Neo4J communication use a Bolt driver (https://neo4j.com/docs/develo per-manual/current/drivers/).

When done, check your code into a github repo along with instructions on how to set up/use the API.

To demonstrate API usage with any HTTP or GrapQL client (see bonus task #1 below) - please include instructions on how to use it in the README.md file in the github repo.

Bonus task 1: develop a simple UI that can be used directly from the web browser to drive the API - any stack will do, from plain HTML forms to JQuery to Angular/React/etc.

Bonus task 2: deploy your app along with a Neo4J instance to an AWS EC2 instance  (or any other cloud) so that we can see it in action without going through the setup process.

Please submit this homework by Monday.

