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
                bat 'mvn install'
            }
        }
        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Publish Results') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }
    }
}
