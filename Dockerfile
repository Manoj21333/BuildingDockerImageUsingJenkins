FROM openjdk:17
EXPOSE 8080
ADD target/dockerImageJenkins.jar  dockerImageJenkins.jar
ENTRYPOINT ["java","-jar","/dockerImageJenkins.jar"]