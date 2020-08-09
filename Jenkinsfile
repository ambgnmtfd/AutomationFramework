node{
  stage('SCM Checkout'){
    git 'https://github.com/ambgnmtfd/AutomationFramework'
  }
  
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
