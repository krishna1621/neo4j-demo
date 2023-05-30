FROM openjdk
COPY target/*.jar /
EXPOSE 9090
ENTRYPOINT ["java","-jar","/my-app-1.0-SNAPSHOT.jar"]