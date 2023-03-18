FROM openjdk:19
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} myNumberProducerApp.jar
ENTRYPOINT ["java","-jar","/myNumberProducerApp.jar"]