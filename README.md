# Java practice test
Practical test that aims to develop an API that is able to save, update, list and delete the names of meals saved in the database.

# Frontend technologies
  - HTML5 in creating the forms.
  - Bootstrap to assist in page development.
  - Jquery as a front end framework.
  - Javascript in the creation of functions to interact with forms.
  - Ajax to make screen requests.
  - CSS3 for styles.


# Backend technologies
- Java language.
- Gradle for code compilation
- Rest as software architecture.
- Spring boot making the process easier in java applications.
- Spring data JPA mapping the entities in the database.
- PostgreSQL to store the data.
- Postman for testing HTTP requests.
- JUnit for unit testing.

# About the project
1- Creating the Meal model class and inserting the attributes name, category, area, Thumb meal, all with private access modifier. After creating the attributes, encapsulation with set(attribution to some value, defines the value that some attribute must have), get(retrieve this value) was implemented.

2- Creating the interface refeicaoRepository serving as an abstraction to persist data.

3- Creating a controller class for processing requests and generating responses. Inside the controller I have the HTTP GET, POST, PUT and DELETE methods. In GET I have the URL mapped as "listatodos" which will return all the values ​​registered in the database, and also the value "searchForName" which will return only the name passed as a value. In POST I have the URL mapped as "write" which will add new data to the database. In PUT I have the URL mapped as "update" which will update the data through its id. In DELETE I have mapped it as "/{id}" which will return the removed data through the id inserted in the URL.


## API Reference

#### Get findAll

```http
  GET /projeto-teste-java/listatodos
```
  GET findByID

```http
  GET /projeto-teste-java/buscarporid
```

#### GET findByName

```http
  GET /projeto-teste-java/buscarPorNome
```
#### POST

```http
  POST /projeto-teste-java/gravar
```
#### PUT

```http
  PUT /projeto-teste-java/atualizar
```
#### DELETE

```http
  delete /projeto-teste-java/"delete"
```
colatusso@gmail.com
