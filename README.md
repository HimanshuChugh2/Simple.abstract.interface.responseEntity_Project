# Simple.abstract.interface.responseEntity_Project
 
This project depicts implementation of a couple of Java Concepts in a real world project.

This project explains the following
1) The usage of Abstract classes in Java: Here I have created an Abstractcontroller which is used by a controller method for code re-usability.

2) The usage of interfaces: I have created Interfaces in "service" package, which are then implemented by the serviceImpl package. Interfaces restrict the implementing class to define the methods of the interface.

3) The use of ResponseEntity and creation of a custom ResponseEntity based on your project needs: Here i have created CustomResponseEntity.java which implements ResponseEntity class of Spring framework, using this Custom class we can easily modify the Response we want to return based on our project requirement.

4) The usage of ENUMs: In this project I have created an ENUM which holds all the custom response codes that we may want to return as an API call result. The enum is called ResponseMessage.java
