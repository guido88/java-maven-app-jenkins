#! /usr/bin/env groovy
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
                echo "building app..."
              }
            }
        }

        stage('test') {


            steps {

              script{
                   echo "test app..."
               }

            }
        }

    }

}
