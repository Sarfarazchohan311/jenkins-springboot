pipeline {
	agent any
	environment {
		version='1.0'
	}
	tool {
		maven 'Maven'
	}
	
	stages {
		stage('Clean Maven Build') {
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