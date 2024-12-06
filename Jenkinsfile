pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Himanshugogia22/automation-code.git'
            }
        }
        stage('Build') {
            steps {
                bat '"C:\\Program Files\\apache-maven-3.9.9\\bin\\mvn" install'
            }
        }
        stage('Run Tests') {
            steps {
                bat '"C:\\Program Files\\apache-maven-3.9.9\\bin\\mvn" test'
            }
        }
        stage('Publish Results') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }
    }
}
