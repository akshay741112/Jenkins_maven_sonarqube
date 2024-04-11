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
                echo 'Buils is completed with maven'
             }
         }
       
    }
}