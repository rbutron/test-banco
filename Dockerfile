FROM openjdk:8-jdk-alpine
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/test-banco-0.1.0.jar /app/test-banco.jar
ENTRYPOINT ["java", "-jar", "/app/test-banco.jar"]