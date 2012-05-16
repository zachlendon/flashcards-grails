package com.kgrodzicki.flashcards.grails.pages

import geb.Page
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.DesiredCapabilities

class GebRemotePage extends Page {


    /**
     * Returns the constant part of the url to this page.
     * <p>
     * This implementation returns the static url property of the class.
     */
    @Override
    String getPageUrl() {
        //if we are using a remote web driver then we have to use the ip address of the local instance.
        //To keep the individual page objects "cleaner", we try to deduce when we need the full url
        //and put it in only in those scenarios.  The downside is we assume port.  Perhaps/ideally
        //there's a way to ask grails for just this part and we can make that dynamic
        if (getDriver() instanceof RemoteWebDriver) {
            RemoteWebDriver remoteWebDriver = getDriver()
            DesiredCapabilities capabilities = remoteWebDriver.getCapabilities()
            def contextPathToUse = this.class.url
            def hostToUse = "localhost"
            if (["android", "iPhone", "iPad"].contains(capabilities.browserName)) {
                hostToUse = InetAddress.getLocalHost().getHostAddress()
                if (this.class.hasProperty("mobileUrl")) {
                    contextPathToUse = this.class.mobileUrl
                }
            }
            return "http://" + hostToUse + ":" + "8080" + contextPathToUse
        }
        this.class.url
    }

    @Override
    boolean verifyAt() {
        if (this.class.hasProperty("mobileAt")) {
            def verifier = this.class.mobileAt?.clone()
            if (verifier) {
                verifier.delegate = this
                verifier.resolveStrategy = Closure.DELEGATE_FIRST
                verifier()
            } else {
                true
            }
            super.verifyAt()
        }
    }
}

