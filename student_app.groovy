pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                git changelog: false, poll: false, url: 'https://github.com/chetansomkuwar254/studentapp.ui.git'
                echo 'Pull is done'
            }
        }
    }
    stages {
        stage('Build') {
            steps {
                sh "/opt/apache-maven-"
                echo 'Hello World'
            }
        }
    }
    stages {
        stage('Test') {
            steps {
                echo 'Hello World'
            }
        }
    }
    stages {
        stage('Deploy') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
