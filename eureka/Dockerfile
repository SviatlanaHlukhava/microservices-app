FROM openjdk:8-jdk-alpine
COPY build/libs/eureka-0.0.1-SNAPSHOT.jar /opt/spring-cloud/lib/eureka.jar
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/spring-cloud/lib/eureka.jar"]
EXPOSE 8761