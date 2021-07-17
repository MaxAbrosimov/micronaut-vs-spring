# Google Cloud Run App

## [Micronaut](https://micronaut.io/) vs [SpringBoot](https://spring.io/projects/spring-boot)

### Prerequisites
Maven  
Gcp local  

### Deploy micronaut java application  
`cd micronaut`  
`mvn clean install`  
`gcloud builds submit --tag gcr.io/${gcp-project-id}/micronaut`  
`gcloud run deploy --image gcr.io/${gcp-project-id}/micronaut`  
Specify service name: eg `micronaut`  
Specify region: eg `21`  
Allow unauthenticated invocations to ${gcp-project-id}: eg `y`  

### Deploy springboot java application  
`cd springboot`  
`mvn clean install`  
`gcloud builds submit --tag gcr.io/${gcp-project-id}/springboot`  
`gcloud run deploy --image gcr.io/${gcp-project-id}/springboot`  
Specify service name: eg `micronaut`  
Specify region: eg `21`  
Allow unauthenticated invocations to ${gcp-project-id}: eg `y`

