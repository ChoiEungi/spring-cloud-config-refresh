# Spring Cloud Config Refresh without Spring Cloud Bus



``` bash
├── cloud-server
│ └── src
│     ├── main
│     │ ├── java
│     │ └── resources
│     │     ├── config
│     │     │ ├── client-api-dev.yml
│     │     │ ├── client-api-local.yml
│     │     │ └── client-api.yml
│     │     └── application.yml
├── client-api
```

cloud-server
- spring cloud config server
- need to modify ABSOLUTE_PATH to your local directory application.yml for fetching config files from local directory 

```yml
spring:
  application:
    name: config-server
  cloud:
    config:
      server:
        native:
          search-locations: {{ABSOLUTE_PATH}}/cloud-server/src/main/resources/config
```


client-api
- spring cloud config client
- fetch config files from cloud-server