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
    stage('Publish'){
        steps {
          echo 'Time to publish!!'
          sh 'mvn install'
        }
    }
  }
}
