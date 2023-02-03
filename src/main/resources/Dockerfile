# ------------------------------------------------------------------------
#
# Directorio de ubicacion de todos los microservicio /opt/<NOMBRE>
#
# docker build -f Dockerfile -t renova-prueba .
# 
# ------------------------------------------------------------------------

FROM openjdk:8-jdk-alpine
MAINTAINER coearquitectura@telefonica.com

VOLUME /tmp
ADD renova-prueba.jar /opt/microservice/
EXPOSE 8080
WORKDIR /opt/microservice/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "renova-prueba.jar"]
#ENTRYPOINT [ "sh", "-c", "java -jar $JAVA_OPTS /opt/mobile-app-ws/renova-prueba.jar" ]