
def call() {
    dependencyCheck(
        additionalArguments: '--scan ./ --format XML --out .',
        odcInstallation: 'OWASP'
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
