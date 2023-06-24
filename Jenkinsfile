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
        stage('Build e Teste'){
            steps{
                echo 'buildado'
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Theendringer/JogoBisca.git']])
                sh 'mvn -Dmaven.test.failure.igore=true clean package'
            }
        }
    }
    post {
        always {
            junit 'src/test/models/target/surefire-reports/*.xml'

        }
        success {
            echo 'Todos os testes passaram! O projeto foi compilado e testado com sucesso.'
        }
        failure {
            emailext body: '''<p>Olá,</p>
                            <p>Um ou mais testes falharam na execução da pipeline.</p>
                            <p>Por favor, verifique os detalhes abaixo:</p>
                            <pre>Testes falhos</pre>''',
                     subject: 'Falha nos testes - Pipeline',
                     from: 'gustepereira@hotmail.com'
                     to: 'gustepereira@gmail.com'

        }
    }
}
