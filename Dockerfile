FROM openjdk:17-jdk
WORKDIR /app
COPY target/aws-spring-demo-1.0.jar /app/aws-app.jar
EXPOSE 8080
CMD ["java", "-jar", "aws-app.jar"]
