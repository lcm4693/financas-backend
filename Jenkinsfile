node{
  stage('SCM Checkout'){
    git 'https://github.com/lcm4693/financas-backend/'
  }
  stage('Compile-Package'){
      sh 'cd financas-backend'
     def mvnHome = tool name: 'maven-3', type: 'maven' 
    sh "${mvnHome}/bin/mvn package"
  }
  
}
