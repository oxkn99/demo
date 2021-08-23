FROM openjdk:11-jdk
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY build/libs/*.jar application.jar
EXPOSE 8282
CMD ["java", "-jar", "application.jar"]