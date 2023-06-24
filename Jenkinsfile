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
            junit (
                allowEmptyResults:true,
                testResults: '*teste-reports/.xml'

            )
        }
    }
}
