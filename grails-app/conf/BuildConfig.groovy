grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.project.dependency.resolution = {
    def gebVersion = "0.7.0"
    def seleniumVersion = "latest.release"

    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        // uncomment the below to enable remote dependency resolution
        // from public Maven repositories
        //mavenLocal()
        //mavenCentral()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.13'
        test "org.codehaus.geb:geb-spock:$gebVersion"
        test "org.spockframework:spock-grails-support:0.6-groovy-1.8-SNAPSHOT"
        test('org.seleniumhq.selenium:selenium-htmlunit-driver:latest.release') {
            exclude 'xml-apis'
        }
        test 'net.sourceforge.htmlunit:htmlunit-core-js:2.8'
        test 'org.w3c.css:sac:1.3'
        test 'org.apache.httpcomponents:httpmime:4.1'
        //test 'cssparser:0.9.5'

        test "org.seleniumhq.selenium:selenium-support:$seleniumVersion"
        test "org.seleniumhq.selenium:selenium-firefox-driver:$seleniumVersion"
        test "org.seleniumhq.selenium:selenium-remote-driver:$seleniumVersion"
        test "org.seleniumhq.selenium:selenium-android-driver:$seleniumVersion"
        test "org.seleniumhq.selenium:selenium-iphone-driver:$seleniumVersion"
    }


    plugins {
        compile ":hibernate:$grailsVersion"

        test ':geb:0.7.0'
        test ':spock:0.6-SNAPSHOT'

        build ":tomcat:$grailsVersion"
    }
}
