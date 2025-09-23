# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the compiled Java class file into the container at /app
COPY HelloWorld.java .

# Compile the Java source file
RUN javac HelloWorld.java

# Define the command to run the application
CMD ["java", "HelloWorld"]
