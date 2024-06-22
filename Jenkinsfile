#! /usr/bin/env groovy
@Library('shared-jenkins-library') _
pipeline {
    agent any

    tools {
     maven 'Maven'
    }

    stages {
        stage('build') {

            steps {

              script{

                buildJar()
                def matcher = readFile('pom.xml') =~ '<version>(.+)</version>'
                def version = matcher[0][1]
                env.IMAGE_NAME = "$version-$BUILD_NUMBER"
              }
            }
        }
        stage('Build new Docker Image') {

            steps {

              script{
                   buildImage "$IMAGE_NAME"
               }
            }
        }
        stage('Deploy App ') {

            steps {

              script{
                   deployApp "$IMAGE_NAME"
               }
            }
        }
        stage('commit version update') {

            steps {

              script{
                   commitVersion()
               }
            }
        }
    }
}
