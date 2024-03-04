FROM openjdk:8-jdk
# For the extra point cluster env, as my understanding, build the jar using docker and run it in Cluster container
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/apsp.jar"]