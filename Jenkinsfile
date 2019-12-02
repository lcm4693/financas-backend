node{
  stage('SCM Checkout'){
    git 'https://github.com/lcm4693/financas-backend/'
  }
  stage('Compile-Package'){
      sh 'cd financas-backend'
     def myTestContainer = docker.image('maven:3.3-jdk-8')
     myTestContainer.pull()
     myTestContainer.inside() { // using linking, mysql will be available at host: mysql, port: 3306
      
      sh 'mvn package'                     
     }            
  }
  
}
