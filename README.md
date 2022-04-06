# JavaSpringBoot RestFul API
Developed Restful API's using Java Spring Boot and PostgreSQL

## Details

***
* Implemented Post, Put, Get, Delete Http Requests using Java Spring Boot Framework
* Developed in **Spring Boot layered architecture**
* The client makes the HTTP requests. The request goes to the controller, and the controller maps that request and handles it. After that, it calls the service layer
* In the service layer, all the business logic performs. It performs the logic on the data that is mapped to JPA with model classes
* A message/details is returned to the user if no error occurred
* Developed in *IntelliJ* IDEA
* Connected to PostgreSQL using Postgres.app

## Annotations Used

***
@RestController <br />
@RequestMapping(path = “”) <br />
@GetMapping <br />
@Service <br />
@Autowired <br />
@Entity <br />
@Table <br />
@Transactional <br />
@Respository <br />
@Query <br />
@GetMapping <br />
@PostMapping <br />
@PutMapping <br />
@DeleteMapping <br />
@Configuration  <br />
@Bean <br />

## Procedure to Run
***
* Run the application
* Hit the api through with url http://localhost:8080/api/v1/student 



