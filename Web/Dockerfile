FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/nagp-web.jar
WORKDIR /opt/app
ENV PORT 8080
EXPOSE 8080
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
