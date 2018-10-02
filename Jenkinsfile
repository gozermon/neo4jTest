#!groovy

pipeline {
  agent any
  stages {
    stage('Hello') {
      steps {
        echo 'Hello Gozer!'
      }
    }
    stage('Build'){
      steps {
          git 'https://github.com/gozermon/neo4jTest.git'
          sh 'mvn package'
      }
    }
  }
}
