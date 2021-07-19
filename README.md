# Google Cloud Run App

## [Micronaut](https://micronaut.io/) vs [SpringBoot](https://spring.io/projects/spring-boot)
I've created two simple rest applications with one purpose: creating employee using [DummyApi](https://dummy.restapiexample.com/). <br/>
These applications have one POST method<br/>
path: ${serviceUrl}/webhook <br/>
body example:<br/>
`{`<br/>
`    "name":"test",`<br/>
`    "salary":"123",`<br/>
`    "age":"23"`<br/>
 `}`<br/>

### Prerequisites
[Maven](https://maven.apache.org/download.cgi#)<br/>
[Gcp local](https://cloud.google.com/sdk/docs/install)<br/>

### Install
#### Deploy micronaut java application  
`cd micronaut`<br/>
`mvn clean install`<br/>
`gcloud builds submit --tag gcr.io/${gcp-project-id}/micronaut`<br/>
`gcloud run deploy --image gcr.io/${gcp-project-id}/micronaut`<br/>
Specify service name: eg `micronaut`<br/>
Specify region: eg `21`<br/>
Allow unauthenticated invocations to ${gcp-project-id}: eg `y`<br/>

#### Deploy springboot java application
`cd springboot`<br/>
`mvn clean install`<br/>
`gcloud builds submit --tag gcr.io/${gcp-project-id}/springboot`<br/>
`gcloud run deploy --image gcr.io/${gcp-project-id}/springboot`<br/>
Specify service name: eg `micronaut`<br/>
Specify region: eg `21`<br/>
Allow unauthenticated invocations to ${gcp-project-id}: eg `y` <br/>

### Request
I`ve queried services using Postman. See [collection](https://www.getpostman.com/collections/6a94bff281f72a5332af)

### Results
Micronaut request took about 6 seconds <br/>
Springboot - from 10 to 14 seconds <br/>


