pipeline {
    agent any
    stages {
        stage('Instalar Maven') {
            steps {
                sh 'wget https://apache.org/dist/maven/maven-3/3.8.4/binaries/apache-maven-3.8.4-bin.tar.gz'

                sh 'tar xzf apache-maven-3.8.4-bin.tar.gz'

                sh 'mv apache-maven-3.8.4 maven'

                script {
                    env.PATH = "${env.WORKSPACE}/maven/bin:${env.PATH}"
                    env.M2_HOME = "${env.WORKSPACE}/maven"
                    env.M2 = "${env.WORKSPACE}/maven/bin"
                }
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
