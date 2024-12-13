FROM openjdk
COPY . .
EXPOSE 8080
CMD ["java", "-jar", "target/Task3-0.0.1-SNAPSHOT.jar"]