def call(sonarTool, projectKey, projectName){
    sh "${tool(sonarTool)}/bin/sonar-scanner \
        -Dsonar.projectKey=${projectKey} \
        -Dsonar.projectName=${projectName} \
        -Dsonar.sources=backend,frontend \
        -Dsonar.host.url=http://3.91.23.174:9000
        -Dsonar.login=squ_dc4b7ae47951d1d4a52e9f63b8d6e22a8b029339"
}
