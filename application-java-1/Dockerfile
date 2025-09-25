FROM openjdk:17-jdk-slim

# Build the Spring Boot application
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

# Copy the JAR and git.properties into the image
COPY target/*.jar app.jar
COPY target/classes/git.properties git.properties

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

