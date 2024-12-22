FROM openjdk:17-jdk-slim

WORKDIR /app

COPY OddNumbers.java .

RUN javac OddNumbers.java

ENTRYPOINT ["java", "OddNumbers"]
