def call(){
    dependencyCheck(
        additionalArguments: '--scan ./ --format XML --format HTML',
        odcInstallation: 'OWASP'
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
