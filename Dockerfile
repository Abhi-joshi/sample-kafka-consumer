FROM maven:3.9.9-eclipse-temurin-21-alpine AS build
COPY src /home/sample-kafka-consumer/src
COPY pom.xml /home/sample-kafka-consumer
RUN mvn -f /home/sample-kafka-consumer/pom.xml clean package -Dmaven.test.skip

FROM eclipse-temurin:21
MAINTAINER abhishek
COPY --from=build /home/sample-kafka-consumer/target/sample-kafka-consumer-0.0.1-SNAPSHOT.jar sample-kafka-consumer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/sample-kafka-consumer-0.0.1-SNAPSHOT.jar"]