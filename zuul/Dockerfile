FROM openjdk:8-jdk-alpine
COPY build/libs/zuul-0.0.1-SNAPSHOT.jar /opt/spring-cloud/lib/zuul.jar
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/spring-cloud/lib/zuul.jar"]
EXPOSE 8800