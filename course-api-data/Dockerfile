FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/course-api-data-0.0.1-SNAPSHOT.jar demo.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /demo.jar" ]