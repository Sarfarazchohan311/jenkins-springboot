pipeline {
	agent any
	environment {
		VERSION = "${env.BUILD_ID}"
	}
	tools {
		maven "Maven"
	}
	
	stages {
		stage('Clean Build') {
			steps {
				sh 'mvn clean -DskipTests'
			}
		}
		stage('run test cases') {
			steps{
				sh 'mvn test'
			}
		}
	}

}