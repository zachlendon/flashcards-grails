package com.kgrodzicki.flashcard.grails

import com.kgrodzicki.flashcards.grails.pages.IndexPage
import com.kgrodzicki.flashcards.grails.pages.LoggedInIndexPage
import com.kgrodzicki.flashcards.grails.pages.LoginPage
import geb.spock.GebReportingSpec
import com.kgrodzicki.flashcards.grails.pages.UploadPage

class AdminSpec extends GebReportingSpec {

    /**
 def setupSpec() {
     given:
         to LoginPage
         at LoginPage
     when:
         username = 'admin'
         password = 'admin'
         submit.click()
     then:
         at LoggedInIndexPage
 }

 def "import through admin"() {
     when:
        loggedInHeadingModule.adminLink.click()
        waitFor {
            loggedInHeadingModule.importLessons.displayed
        }
        loggedInHeadingModule.importLessons.click()
     then:
        at UploadPage
 }
 **/
}
