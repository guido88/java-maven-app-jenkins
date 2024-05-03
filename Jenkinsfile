#! /usr/bin/env groovy

def gv
pipeline {
    agent any

    stages {

        stage('init'){

            steps{
                script{
                    gv = load "script.groovy"
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
                gv.buildJar()
              }
            }
        }
        stage('build Image') {


            steps {

              script{
                   gv.buildImage()
               }

            }
        }
        stage('deploy') {


            steps {

              script{
                   gv.deployApp()
               }

            }
        }

    }

}
