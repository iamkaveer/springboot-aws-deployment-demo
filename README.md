# springboot-aws-deployment-demo

This is a simple Todo Rest API built using Spring Boot. The API allows users to createa and read tasks.

### Frameworks and Language Used:
* Spring Boot
* Java 11
* MySQL
* Swagger
### Database Design:
The Product entity class represents the product model in the database. It contains an id, title, and desc.

To deploy springboot app on AWS.
1. create a EC2 instanacea and connect it with termius. install Mysql, java 11 on ec2. also you need to open port in security group.
2. create a jar file of springboot app and upload it to ec2 using termius.

## Here are all the endpoints for the Todo Rest API with Spring Boot:

### GET /get-all
Returns a list of all todos.

### POST /add-todo
Creates a new todo.

### link of the app
link : http://bit.ly/3JdxF52
