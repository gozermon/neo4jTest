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
    stage('Archive'){
        steps {
           echo 'Time to archive!!'
           script {
              archiveArtifacts artifacts: '**/target/*'
           }
        }
    }
  }
}
