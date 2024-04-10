pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                echo 'Hello World'
            }
        }
    }
    stages {
        stage('Build') {
            steps {
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
