FROM openjdk:8-jdk-alpine
COPY build/libs/employees-0.0.1-SNAPSHOT.jar /opt/spring-cloud/lib/employees.jar
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/spring-cloud/lib/employees.jar"]
EXPOSE 8080