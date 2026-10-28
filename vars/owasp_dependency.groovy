
def call() {
    dependencyCheck(
        additionalArguments: '--scan ./ --format XML --out . --nvdApiDelay 8000',
        odcInstallation: 'OWASP'
    )

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
