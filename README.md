A Java Maven App
---

This is just a demo app to show how to build and deploy it automatically with a CI/CD Pipeline using Jenkins automation tool.

Webhook Setup
---

Set up a webhook to respond to pushes on the master branch of your GitHub repository, which will trigger Jenkins Pipeline.

Jenkins Pipeline
---
The steps in the pipeline refers to this Shared Jenkins Library repo (https://github.com/guido88/shared-jenkins-library), so that same actions
can be reused in other pipelines. Can also implement steps in Jenkinsfile directly

1. Setup Maven

2. Build the App Jar

3. Build docker Image and push it to private repo

4. Copy docker-compose file and script on EC2 to start the newly created container image


Pipeline Configuration
---
1. Jenkinsfile: Jenkinsfile in the root of GitHub repository to define the pipeline stages.
2. Shared Jenkins Library to have actions in central repo to be reused
3. Dockerfile to build the image
4. docker-compose.yaml to pull image on ec2
5. script.sh to run docker compose command on ec2
