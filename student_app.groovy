pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                
                echo 'Pull is done'
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
