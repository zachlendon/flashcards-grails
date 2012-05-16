package com.kgrodzicki.flashcard.grails

import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import geb.spock.GebReportingSpec
import geb.Browser
import spock.lang.Shared


class MobileSpeck extends GebReportingSpec {

    @Shared
    def isMobile = false

    def setupSpec() {
        if (getBrowser().driver instanceof RemoteWebDriver) {
            RemoteWebDriver remoteWebDriver = getBrowser().driver
            DesiredCapabilities capabilities = remoteWebDriver.getCapabilities()
            if (["android", "iPhone", "iPad"].contains(capabilities.browserName)) {
                isMobile = true
            }
        }
    }
}
