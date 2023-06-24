pipeline {
    agent any
    stages {

        stage('Instalar wget') {
            steps {
                sh 'apt-get update'
                sh 'apt-get install -y wget'
            }
        }
        stage('Instalar Maven') {
            steps {
                // Fazer o download do Maven
                sh 'wget https://apache.org/dist/maven/maven-3/3.8.4/binaries/apache-maven-3.8.4-bin.tar.gz'

                // Extrair o arquivo tar.gz
                sh 'tar xzf apache-maven-3.8.4-bin.tar.gz'

                // Renomear a pasta extraída
                sh 'mv apache-maven-3.8.4 maven'

                // Configurar as variáveis de ambiente para o Maven
                script {
                    env.PATH = "${env.WORKSPACE}/maven/bin:${env.PATH}"
                    env.M2_HOME = "${env.WORKSPACE}/maven"
                    env.M2 = "${env.WORKSPACE}/maven/bin"
                }
            }
        }
        stage('Compilar') {
            steps {
                // Executar o comando de compilação do seu projeto usando o Maven
                sh 'mvn compile'
            }
        }
        stage('Empacotar') {
            steps {
                // Executar o comando de empacotamento do seu projeto usando o Maven
                sh 'mvn package'
            }
        }
    // Outras etapas do seu pipeline
    }
}
