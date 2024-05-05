def buildJar() {
    echo "building the application..."
    //sh 'mvn package'
} 

def buildImage() {
    echo "building the docker ..."
   // withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
     //   sh 'docker build -t nanajanashia/demo-app:jma-2.0 .'
     //   sh "echo $PASS | docker login -u $USER --password-stdin"
     //   sh 'docker push nanajanashia/demo-app:jma-2.0'
   // }
} 

def deployApp() {
    echo 'deploying te applicatiion-.'
} 

return this
