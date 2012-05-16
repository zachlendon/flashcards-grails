/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.firefox.FirefoxDriver

waiting {
    timeout = 30
    retryInterval = 1.0
}

environments {

    // run as “grails -Dgeb.env=firefox test-app”
    // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
    firefox {
        baseUrl = "http://localhost:8080/flashcards-grails/"
        driver = { new FirefoxDriver() }
        driver
    }

    // run as “grails -Dgeb.env=localiphone test-app”
    localiphone {
        baseUrl = "http://172.20.102.175:3001/wd/hub/" //address of your local app instance, on your network (not localhost)
        driver = {
            def driver = new RemoteWebDriver(new URL(baseUrl), DesiredCapabilities.iphone())
            driver
        }
    }

    // run as “grails -Dgeb.env=localipad test-app”
    localipad {
        baseUrl = "http://192.168.251.214:3001/wd/hub/" //address of your local app instance, on your network (not localhost)
        driver = {
            def driver = new RemoteWebDriver(new URL(baseUrl), DesiredCapabilities.ipad())
            driver
        }
    }

    // run as “grails -Dgeb.env=localxoom test-app”
    localxoom {
        baseUrl = "http://10.11.12.105:8080/wd/hub/" //address of your local app instance, on your network (not localhost)
        driver = {
            def driver = new RemoteWebDriver(new URL(baseUrl), DesiredCapabilities.android())
            driver
        }
    }

}