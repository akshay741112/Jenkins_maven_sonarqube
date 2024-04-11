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
                echo 'Buils is completed with maven'
            }
        }
        stage('Test') {
             steps {
             }
         }
        // stage('Deploy') {
        //     steps {
        //         echo 'Deployed on docker'
        //     }
        // }
    }
}