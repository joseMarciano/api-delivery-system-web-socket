## Microservice: Order information provider ( Back-end | WebSocket Application ).

- This application is a part of DELIVERY SYSTEM, a project that simulates a delivery system flux

## :pushpin: Application purpose

- To improve my skills on Spring Boot
- To improve my knowledge's in microservices
- To improve my knowledge about RabbitMq
- To improve my knowledge about WebScket(STOMP)

This application is responsible to consume `order.cordinates-updated` and send the information through WebSocket.

## :wrench: Architecture fluxogram

<div style="background: white"> 
    <img src="/public/diagram.svg">
</div>

## :computer: Technologies

![Badge](https://img.shields.io/badge/RabbitMQ--%233178C6?style=for-the-badge&logo=RabbitMQ&color=ff6600)
![Badge](https://img.shields.io/badge/Spring_Boot--%2361DAFB?style=for-the-badge&logo=Springboot&color=6DB33F)
![Badge](https://img.shields.io/badge/Docker--%2361DAFB?style=for-the-badge&logo=Docker&color=2496ED)
![Badge](https://img.shields.io/badge/Gradle--%2361DAFB?style=for-the-badge&logo=Gradle&color=02303A)

## :rocket: How to run the application

- In the root directory run ` ./gradlew bootRun --args='--spring.profiles.active=development'`

## Other project services

- [api-delivery-system](https://github.com/joseMarciano/api-delivery-system) | at this project we have a compose to up
  the environment
- [api-delivery-system-cordinator](https://github.com/joseMarciano/api-delivery-system-cordinator)
- [front-delivery-system](https://github.com/joseMarciano/front-delivery-system)
