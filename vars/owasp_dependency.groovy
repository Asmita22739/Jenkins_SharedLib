def call(){
    dependencyCheck additionalArguments: '--scan backend --scan frontend', odcInstallation: 'OWASP'
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}

