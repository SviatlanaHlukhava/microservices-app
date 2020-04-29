FROM openjdk:8-jdk-alpine
COPY build/libs/greeting-0.0.1-SNAPSHOT.jar /opt/spring-cloud/lib/greeting.jar
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/spring-cloud/lib/greeting.jar"]
EXPOSE 8082