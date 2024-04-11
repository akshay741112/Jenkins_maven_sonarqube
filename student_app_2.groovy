pipeline {
    agent any

    stages {
        stage('pull') {
            steps {
                git changelog: false, poll: false, url: 'https://github.com/chetansomkuwar254/studentapp.ui.git'

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
        stage('test') {
            steps {
                
                echo 'Hello World'
            }
        }
     stages {
        stage('deployment') {
            steps {
                
                echo 'Hello World'
            }
        }   
    }
}       

