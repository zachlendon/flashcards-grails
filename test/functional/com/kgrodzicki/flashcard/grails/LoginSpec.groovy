package com.kgrodzicki.flashcard.grails

import com.kgrodzicki.flashcards.grails.pages.LoggedInIndexPage
import com.kgrodzicki.flashcards.grails.pages.LoginPage
import geb.spock.GebReportingSpec

class LoginSpec extends GebReportingSpec {

 def "login is successful"() {
    given:
         to LoginPage
         at LoginPage
    when:
        username = 'admin'
        password = 'admin'
        submit.click()
     then:
        report "logged in screen"
        at LoggedInIndexPage
 }
}
