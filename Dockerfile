FROM eclipse-temurin:17-jdk-alpine
RUN apk add --no-cache bash iputils netcat-openbsd
VOLUME /tmp
COPY target/companies-crud-0.0.1-SNAPSHOT.jar app.jar
ENV EUREKA_URL null
ENV CONFIG_SERVER_HOST null
ENV OTLP_METRICS_URL null
ENV OTLP_TRACING_URL null
CMD ping -c 40 db-companies && java -jar /app.jar