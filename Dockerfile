FROM  openjdk:17-jdk-slim as build
LABEL authors="noahparker"
WORKDIR /app
COPY target/D387_sample_code-0.0.2-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar"]