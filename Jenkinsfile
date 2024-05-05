#! /usr/bin/env groovy
@Library('shared-jenkins-library') _
pipeline {
    agent any

    tools {
     maven 'Maven'
    }

    stages {

        stage('test') {
                   when {
                    expression {
                        BRANCH_NAME != 'master'
                       }
                    }

                    steps {

                      script{
                        echo "This runs only on test branch!!"
                      }
                    }
                }

        stage('build') {
           when {
            expression {
                BRANCH_NAME == 'master'
               }
            }

            steps {

              script{

                buildJar()

                def matcher = readFile('pom.xml') =~ '<version>(.+)</version>'
                def version = matcher[0][1]
                env.IMAGE_NAME = "$version-$BUILD_NUMBER"

              }
            }
        }
        stage('Build new Docker Image ') {
            when {
             expression {
                BRANCH_NAME == 'master'
               }
            }

            steps {

              script{
                   buildImage $IMAGE_NAME
               }

            }
        }
        stage('Deploy App') {
             when {
                 expression {
                       BRANCH_NAME == 'master'
                   }
              }

            steps {

              script{
                   deployApp $IMAGE_NAME
               }

            }
        }

    }

}
