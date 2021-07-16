Google Cloud Run App
There are two modules developed for test Cloud Run purpose. 
One using Micronaut https://micronaut.io/, one using SpringBoot

Deploy micronaut java application
cd micronaut
mvn clean install
gcloud builds submit --tag gcr.io/${gcp-project-id}/micronaut
gcloud run deploy --image gcr.io/${gcp-project-id}/micronaut
Specify service name: fe micronaut
Specify region: fe 21
Allow unauthenticated invocations to ${gcp-project-id}: fe y

Deploy springboot java application
cd springbott
mvn clean install
gcloud builds submit --tag gcr.io/${gcp-project-id}/springboot
gcloud run deploy --image gcr.io/${gcp-project-id}/springboot
Specify service name: fe micronaut
Specify region: fe 21
Allow unauthenticated invocations to ${gcp-project-id}: fe y

