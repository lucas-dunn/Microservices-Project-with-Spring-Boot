# Microservices Project with Spring Boot

## Overview

This repository highlights my approach to building a microservices architecture with **Spring Boot**. The project is designed to demonstrate a modular, scalable solution for building distributed applications. By integrating modern practices such as containerization with **Docker**, orchestration with **Kubernetes**, and real-time monitoring using **Prometheus** and **Grafana**, this project provides a production-ready architecture suitable for enterprise-level applications.

The aim is to create robust services that can seamlessly scale while maintaining flexibility in deployment and management.

## Features

- **Microservices Architecture**: Built using **Spring Boot** for flexibility and ease of development.
- **Docker & Kubernetes**: Containerized services and orchestrated them with Kubernetes to ensure high scalability and reliability.
- **Monitoring**: Integrated **Prometheus** and **Grafana** for comprehensive monitoring, alerting, and data visualization.
- **Service Discovery & API Gateway**: Implemented **Spring Cloud Gateway** for API routing and load balancing.
- **Resilience**: Added **Spring Cloud Circuit Breaker** and **Hystrix** for fault tolerance in distributed systems.
- **Security**: Configured **Spring Security** for secure communication between microservices.

## Technologies Used

- **Spring Boot**: The core framework for microservices development.
- **Spring Cloud**: For service discovery, load balancing, and resiliency.
- **Docker**: Containerizing services for easy deployment and isolation.
- **Kubernetes**: For orchestration and managing containerized applications in a cluster.
- **Prometheus & Grafana**: Monitoring and visualization tools for real-time insights into system performance.
- **MySQL**: For relational data storage.
- **RabbitMQ**: For enabling message-driven architecture.
- **OAuth2 / JWT**: For handling secure authentication and authorization.

## Getting Started

### Prerequisites

Before you begin, ensure the following are installed on your machine:

- **Docker**: For containerization and running services locally.
- **Kubernetes**: For managing the services in production.
- **Java 11+**: Required for running Spring Boot applications.
- **Maven**: For building and managing dependencies.

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/lucas-dunn/microservices-project-with-spring-boot.git
   cd microservices-project-with-spring-boot