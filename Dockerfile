FROM amazoncorretto:21-alpine
ENTRYPOINT ["/usr/bin/album-service.sh"]

COPY album-service.sh /usr/bin/album-service.sh
COPY target/*.jar /usr/share/album-service/album-service.jar
