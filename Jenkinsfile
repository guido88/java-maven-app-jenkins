#! /usr/bin/env groovy
@Library('shared-jenkins-library') _
pipeline {
    agent any

    stages {


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
        stage('build new Image ') {


            steps {

              script{
                   buildImage()
               }

            }
        }
        stage('deploy') {


            steps {

              script{
                   deployApp()
               }

            }
        }

    }

}
