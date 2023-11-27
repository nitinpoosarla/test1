FROM openjdk:8
COPY target/test-0.0.1-SNAPSHOT.jar test-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java", "-jar", "/API-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT exec java $JAVA_OPTS -jar /test-0.0.1-SNAPSHOT.jar