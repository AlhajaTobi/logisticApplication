# Stage 1: Build the application
# Stage 1: Build Stage using Maven with Java 17
FROM maven:3.8.7-eclipse-temurin-17 AS build
WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy the rest of the project and build
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Runtime Stage using Java 17
FROM eclipse-temurin:17-jdk
WORKDIR /app

# Copy the packaged JAR from the build stage
COPY --from=build /app/target/*.jar logisticmanagement.jar

# Set environment variable for port
ENV PORT=2121

# Expose the port
EXPOSE ${PORT}

# Start the application
ENTRYPOINT ["java", "-Dserver.port=${PORT}", "-jar", "logisticmanagement.jar"]
