pipeline {
	agent any
	environment {
		version=${snv.buildId}
	}
	tools {
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