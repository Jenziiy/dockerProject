FROM gradle:8.4-jdk20 as builder
WORKDIR /app
COPY . .
RUN ./gradlew build --stacktrace

FROM openjdk
WORKDIR /app
EXPOSE 8080
COPY --from=builder /app/build/libs/dockerProject-0.0.1.jar .
CMD java -jar dockerProject-0.0.1.jar