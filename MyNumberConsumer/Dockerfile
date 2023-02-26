FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} myNumberConsumerApp.jar
ENTRYPOINT ["java","-jar","/myNumberConsumerApp.jar"]