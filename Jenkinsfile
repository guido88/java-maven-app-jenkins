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
              }
            }
        }
        stage('build new Docker Image ') {
            when {
             expression {
                BRANCH_NAME == 'master'
               }
            }

            steps {

              script{
                   buildImage()
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
                   deployApp()
               }

            }
        }

    }

}
