node{
  stage('SCM Checkout'){
    git 'https://github.com/lcm4693/financas-backend/'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
  
}
