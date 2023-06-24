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
    port {
        always {
            junit (
                allowEmptyResults:true,
                testResult: '*teste-reports/.xml'

            )
        }
    }
}
