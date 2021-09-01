# Spring Boot VueJS

## To run locally (development mode)

Prerequisites (Node 14 or greater, Java 8 or greater)

### UI (VueJS)
* cd `src/app` from root directory
* `npm install` 
* `npm run start`
* Go to `localhost:3000` for standalone UI app

### Backend (Java)
* Use your favorite java IDE and run `SpringBootVueApplication` as a Spring Boot App.
* Backend runs on `localhost:8080`


## To run in production mode 
* `mvn clean install` from root directory
* cd `target`
* `java -jar spring-boot-vue-0.0.1-SNAPSHOT.jar`
* Go to `localhost:8080` (UI Builds and runs in prod mode)