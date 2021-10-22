FROM openjdk
ADD target/service1-0.0.1-SNAPSHOT.jar /
EXPOSE 8084:8084
CMD ["java","-jar","service1-0.0.1-SNAPSHOT.jar"]