pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                git changelog: false, poll: false, url: 'https://github.com/chetansomkuwar254/studentapp.ui.git'
                echo 'Pull is completed'
            }
        }
        stage('Build') {
            steps {
                sh '/opt/apache-maven-3.9.6/bin/mvn clean package'
                echo 'Buils is completed with maven'
            }
        }
        stage('Test') {
             steps {
                 sh '''/opt/apache-maven-3.9.6/bin/mvn sonar:sonar \\
                      -Dsonar.projectKey=studentapp \\
                      -Dsonar.host.url=http://13.201.84.247:9000 \\
                      -Dsonar.login=3d374a434cf0dc04f6b3d4a43483195a8956e8af'''
             }
         }
        // stage('Deploy') {
        //     steps {
        //         echo 'Deployed on docker'
        //     }
        // }
    }
}