FROM amazoncorretto:17-alpine-jdk

MAINTAINER emaaristimuno

COPY target/Portafolio-0.0.1-SNAPSHOT.jar Portafolio-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/Portafolio-0.0.1-SNAPSHOT.jar"]