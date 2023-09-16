Execute apringboot app from console:
- using java -jar:
./mvnw package
java -jar target/demo.actuator-0.0.1-SNAPSHOT.jar
- using spring boot Maven plugin
./mvnw package
./mvnw spring-boot:run