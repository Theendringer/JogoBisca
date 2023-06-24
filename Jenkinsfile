pipeline {
    agent any
    tools {
        maven 'MAVEN'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
    post {
        always {
            junit 'src/br/test/model/target/surefire-reports/*.xml'
        }
        success {
            echo 'Todos os testes passaram! O projeto foi compilado e testado com sucesso.'
        }
        failure {
            echo 'Alguns testes falharam! O projeto não foi compilado ou apresentou falhas nos testes.'
        }
    }
}
