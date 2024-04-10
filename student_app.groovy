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

    stage('Build') {
            steps {
                git changelog: false, poll: false, url: 'https://github.com/chetansomkuwar254/studentapp.ui.git'
                echo 'Pull is done'
            }
        }

    stage('Pull') {
            steps {
                git changelog: false, poll: false, url: 'https://github.com/chetansomkuwar254/studentapp.ui.git'
                echo 'Pull is done'
            }
        }

    stage('Pull') {
            steps {
                git changelog: false, poll: false, url: 'https://github.com/chetansomkuwar254/studentapp.ui.git'
                echo 'Pull is done'
            }
        }





















           stage('') {
            steps {
                sh '/opt/apache-maven-3.9.6/bin/mvn clean package'
                echo 'build is done'
            }
        }
 
        stage('Test') {
            steps {
                sh '''/opt/apache-maven-3.9.6/bin/mvn sonar:sonar \\
                        -Dsonar.projectKey=studentapp-ui \\
                        -Dsonar.host.url=http://13.201.84.247:9000 \\
                        -Dsonar.login=bdd331a584fc1dfb489eb88749922483b057d23d'''
                echo 'Test is succeded'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Hello World'
            }
        }
}
