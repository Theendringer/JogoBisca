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
        stage('Teste'){
            steps{
                sh 'mvn test'
            }
        }

        stage('Build'){
            steps{
                    echo 'em build'
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
                     from: 'gustepereira@hotmail.com',
                     to: 'gustepereira@gmail.com'

        }
    }
}
