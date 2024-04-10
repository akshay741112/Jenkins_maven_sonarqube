pipeline {
    agent any

    stages {
        stage('Pull') {
            steps {
                git changelog: false, poll: false, url: 'https://github.com/chetansomkuwar254/studentapp.ui.git'
                echo 'Yes, Application repository pull is done !'
            }
        }
        stage('Build') {
            steps {
                sh '/opt/apache-maven-3.9.6/bin/mvn clean package'
                echo 'Yes, Application Build is done !'
            }
        }
        stage('Test') {
            steps {
                sh '''/opt/apache-maven-3.9.6/bin/mvn sonar:sonar \
                    -Dsonar.projectKey=jenkins_project \
                    -Dsonar.host.url=http://13.201.84.247:9000 \
                    -Dsonar.login=bdd331a584fc1dfb489eb88749922483b057d23d'''
}
                echo 'Here we are testing '
            }
        stage('Quality Test') {
            steps {
                echo 'Here we are testing the quality'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy Done'
            }
        
        }
    }
