FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8080
ADD target/api-springboot.jar api-springboot-new.jar
ENTRYPOINT["java","-jar","/api-rest-springboot-new.jar"]