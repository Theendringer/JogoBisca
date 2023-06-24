pipeline {
    agent any
    stages {
        stage('Clonar repositório') {
            steps {
                // Clonar o repositório do seu projeto do controle de versão (por exemplo, Git)
                git 'https://github.com/seu-usuario/seu-repositorio.git'
            }
        }
        stage('Compilar') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('Empacotar') {
            steps {
                sh 'mvn package'
            }
        }
    }
}
