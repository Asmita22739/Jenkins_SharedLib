def call(){
  dependencyCheck additionalArguments: '--scan ./', odcInstallation: 'OWASP'
  dependencyCheck additionalArguments: '--disableNodeAudit'
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
