# Use Maven with OpenJDK
FROM maven:3.8.5-openjdk-17 AS build

# Set working directory inside the container
WORKDIR /app

# Copy Maven configuration file and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the entire project into the container
COPY . .

# Default command to build and verify tests (overridden by docker-compose.yml)
CMD ["mvn", "clean", "verify"]