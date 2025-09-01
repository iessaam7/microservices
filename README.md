# Java Spring Boot Microservices with Docker, Kubernetes, and Spring Cloud

This project is a demonstration of building and deploying Java-based microservices using **Spring Boot (Java 17)**, **Spring Cloud**, **Docker**, and **Kubernetes**. The microservices interact with each other using service discovery, load balancing, and message queues, while providing distributed tracing and monitoring with Zipkin.

## Features

- **Microservices Architecture**
  - Spring Boot with Java 17
  - Spring Cloud for service discovery, load balancing, and API Gateway
  - Eureka Server for service registration and discovery
  - Feign for client-side HTTP communication
  - Spring Cloud Sleuth and Zipkin for distributed tracing
  - Spring Cloud Gateway for API Gateway functionality
  - RabbitMQ for message queue and asynchronous communication
  - Kafka integration for event-driven communication
- **Docker & Kubernetes**
  - Docker Compose for multi-container orchestration
  - Dockerized Spring Boot services
  - Kubernetes for orchestration and scaling
  - Postgres as the database with Docker and Kubernetes deployment
  - Jib Maven plugin for Docker image creation

## Prerequisites

Before starting, make sure you have the following installed:

- **Java 17** or higher
- **Docker** and **Docker Compose** installed
- **Kubernetes** and **kubectl** installed (optional, for Kubernetes deployment)
- **Minikube** for local Kubernetes cluster (optional)
- **Maven** installed for building the project

## Getting Started

### Clone the Repository

git clone [https://github.com/your-username/your-repo-name.git](https://github.com/iessaam7/microservices.git)
cd microservices


## Architecture
<img width="2001" height="1177" alt="image" src="https://github.com/user-attachments/assets/cf7b55a9-d2ec-4bec-88aa-67dbede04e22" />

