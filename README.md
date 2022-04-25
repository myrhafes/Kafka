# Kafka using Spring Cloud Stream
Hi!
This my repository for testing Kafka with Spring Cloud Stream

## How to install Kafka ?(Windows)
###Step 1: 
From a console window, change to the installation directory and run Kafka: 
```
cd [kafka_install_dir]
```
###Step 2: lanching zookeeper
```
start bin\windows\zookeeper-server-start.bat config/zookeeper.properties
```
###Step 3: lanching Kafka server
```
start bin\windows\kafka-server-start.bat config/server.properties
```
###Step 4: lanching Kafka-console-consumer
```
start bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic R1
```
###Step 5: lanching Kafka-console-producer
```
start bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic R1
```

## Built with :

- JAVA
- KAFKA
- SPRING CLOUD STREAM
- Intellij Idea

## Contributors :

-  [Mohamed Yassine Rhafes](https://www.linkedin.com/in/myrhafes/) [https://www.linkedin.com/in/myrhafes/](https://www.linkedin.com/in/myrhafes/)
