# Base image  
FROM openjdk:17-jre-slim  

# Set the working directory  
WORKDIR /app  

# Copy the built JAR file to the container  
COPY target/spring-boot-docker-test.jar app.jar  

# Expose the port the app runs on  
EXPOSE 8080  

# Run the application  
ENTRYPOINT ["java", "-jar", "app.jar"]