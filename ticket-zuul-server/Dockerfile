FROM java:8
MAINTAINER Daniel Bonaldo <dnllink@hotmail.com>
COPY ./target /var/www
WORKDIR /var/www
ENTRYPOINT java -jar ticket-zuul-server-0.0.1-SNAPSHOT.jar
EXPOSE 8100