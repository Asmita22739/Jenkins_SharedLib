def call(String Project, String ImageTag, String dockerHubUserParam) {
    withCredentials([usernamePassword(credentialsId: 'docker',
                                      usernameVariable: 'DOCKER_USER',
                                      passwordVariable: 'DOCKER_PASS')]) {
        sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
        sh "docker push ${dockerHubUserParam}/${Project}:${ImageTag}"
    }
}
