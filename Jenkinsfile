node{
  stage('SCM Checkout'){
    git 'https://github.com/lcm4693/financas-backend/'
  }
  stage('Compile-Package'){
     def mvnHome = tool name: 'Maven', type: 'maven'
    sh "cd financas-backend && ${mvnHome}/bin/mvn package"
  }
  
}
