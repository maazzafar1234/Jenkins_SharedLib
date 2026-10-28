
def call() {
    dependencyCheck(
        additionalArguments: '--scan ./ --format XML --out .',
        odcInstallation: 'OWASP'
    )

    sh 'find . -name "dependency-check-report.xml" -print'

    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
