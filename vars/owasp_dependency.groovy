def call() {
    dependencyCheck additionalArguments: '--scan ./ --disableAssemblyAnalyzer --disableYarnAudit', odcInstallation: 'OWASP'
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
