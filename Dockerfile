FROM openjdk:14-alpine
COPY build/libs/bla-*-all.jar bla.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "bla.jar"]