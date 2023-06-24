pipeline {
    agent any
    tools{
        maven 'MAVEN'
    }
    stages {
        stage('Build'){
            steps{
                echo 'buildado'
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Theendringer/JogoBisca.git']])
                sh 'mvn -Dmaven.test.failure.igore=true clean package'
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
