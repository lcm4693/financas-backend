node{
  stage('SCM Checkout'){
    git 'https://github.com/lcm4693/financas-backend/financas-backend/'
  }
  stage('Compile-Package'){
      sh 'ls'
     def mvnHome = tool name: 'Maven', type: 'maven'
    sh "${mvnHome}/bin/mvn package"
  }
  
}
