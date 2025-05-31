FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} devops-learning-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/devops-learning-0.0.1.jar"]