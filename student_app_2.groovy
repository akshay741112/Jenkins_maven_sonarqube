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
                      -Dsonar.login=bdd331a584fc1dfb489eb88749922483b057d23d'''
             }
         }
        // stage('Deploy') {
        //     steps {
        //         echo 'Deployed on docker'
        //     }
        // }
    }
}