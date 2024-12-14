pipeline {
    agent any
    environment {
      MAVEN_ARGS=" -e clean install"
    }
    stages {
        stage('build') {
            agent { node { label 'node2' } }
            steps {
               withMaven(maven: 'MAVEN_ENV') {
                    sh 'mvn ${MAVEN_ARGS}'
        	    }
            }
        }
        stage('docker-compose start') {
           agent { node { label 'node1' } }
      	   steps {
       		sh 'docker compose up --build'
      	    }
    	}
    }
}