FROM openjdk:8-jre-alpine

COPY ./target/spring-boot-web.jar /usr/app/
WORKDIR /usr/app

CMD java -jar spring-boot-web.jar
