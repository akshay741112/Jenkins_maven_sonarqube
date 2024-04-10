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
        stage('') {
            steps {
                echo 'Hello World'
            }
        }
    }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
