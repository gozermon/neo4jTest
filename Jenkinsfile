#!groovy

pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
            sh 'mvn clean compile'
      }
    }
    stage('Test') {
      steps {
          sh 'mvn test'
      }
    }
    stage('Release'){
        when {
            branch 'master'
        }
        steps {
           echo 'Time for a release'
           script {
              archiveArtifacts artifacts: '**/target/*'
           }
        }
    }
  }
}
