FROM openjdk:8-jdk-alpine
COPY build/libs/configuration-0.0.1-SNAPSHOT.jar /opt/spring-cloud/lib/configuration.jar
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/spring-cloud/lib/configuration.jar"]
EXPOSE 8081