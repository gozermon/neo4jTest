pipeline {
  agent any
  stages {
    stage('Hello') {
      steps {
        echo 'Hello Gozer!'
      }
    }
    stage('SCM Checkout'){
          git 'https://github.com/gozermon/neo4jTest.git'
    }
    stage('Compile-Package'){
      sh 'mvn package'
    }
  }
}
