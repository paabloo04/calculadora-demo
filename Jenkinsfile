pipeline {
    agent any

    tools {
        maven 'Maven3'   // <-- exactamente el mismo nombre que pusiste en Jenkins
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Descargando código desde GitHub...'
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                echo 'Compilando y ejecutando tests...'
                bat 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                echo 'Empaquetando la aplicación...'
                bat 'mvn package'
            }
        }

        stage('Guardar artefacto') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Pipeline completado correctamente.'
        }
        failure {
            echo 'Pipeline fallado. Revisa los logs.'
        }
    }
}
