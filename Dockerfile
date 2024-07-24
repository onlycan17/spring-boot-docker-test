# Base image  
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory  
WORKDIR /app  

# Copy the built JAR file to the container  
COPY target/myfirstwebapp-0.0.1-SNAPSHOT.jar app.jar  

# Expose the port the app runs on  
EXPOSE 8080  

# Run the application  
ENTRYPOINT ["java", "-jar", "app.jar"]