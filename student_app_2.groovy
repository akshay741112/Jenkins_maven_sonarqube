pipeline {
    agent any

    stages {
        stage('pull') {
            steps {

                echo 'Hello World'
            }
        }
     stages {
        stage('build') {
            steps {
                
                echo 'Hello World'
            }
        }  
    
    stages {
        stage('pull') {
            steps {
                
                echo 'Hello World'
            }
        }
    }
