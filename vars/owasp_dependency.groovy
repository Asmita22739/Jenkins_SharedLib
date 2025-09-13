def call() {
    // Run OWASP Dependency-Check scan on the whole workspace
    dependencyCheck additionalArguments: '--disableNodeAudit --scan ./', odcInstallation: 'OWASP'

    // Publish the Dependency-Check report in Jenkins
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
