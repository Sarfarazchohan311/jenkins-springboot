pipeline {
	agent any
	environment {
		DOCKERHUB_CREDENDTIALS = credentials('DOCKER_HUB_CREDENDTIALS')
		VERSION = "${env.BUILD_ID}"
	}
	tools {
		maven "Maven"
	}
	
	stages {
		stage('Clean Build') {
			steps {
				sh 'mvn clean package  -DskipTests'
			}
		}
		stage('run test cases') {
			steps{
				sh 'mvn test'
			}
		}
		stage('Docker Build and Push') {
			steps {
				sh 'echo $DOCKERHUB_CREDENDTIALS_PSW | docker login -u $DOCKERHUB_CREDENDTIALS_USR --password-stdin'
				sh 'docker build -t sarfarazchohan26211/spring-jenkins:${VERSION} .'
				sh 'docker push sarfarazchohan26211/spring-jenkins:${VERSION}'
			}		
		}
		stage('Cleanup Workspace') {
			steps{
				deleteDir()
			}
		}
	}

}