# Use an official OpenJDK runtime as a base image
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/quiz_service.jar /app/app.jar

# Expose the port your application runs on
EXPOSE 8080

# Specify the command to run on container startup
CMD ["java", "-jar", "quiz_service.jar"]
