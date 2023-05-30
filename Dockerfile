FROM openjdk:8
COPY target/devops-integration.jar devops-integration.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/devops-integration.jar"]