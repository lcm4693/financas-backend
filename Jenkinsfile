node{
  stage('SCM Checkout'){
    git 'https://github.com/lcm4693/financas-backend/'
  }
  stage('Compile-Package'){
    sh 'cd financas-backend'
    sh 'mvn package'
  }
  
}