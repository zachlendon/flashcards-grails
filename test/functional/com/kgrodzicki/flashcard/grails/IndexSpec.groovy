package com.kgrodzicki.flashcard.grails

import com.kgrodzicki.flashcards.grails.pages.LoginPage
import com.kgrodzicki.flashcards.grails.pages.IndexPage
import com.kgrodzicki.flashcards.grails.pages.LessonsPage
import com.kgrodzicki.flashcards.grails.pages.LessonsMobilePage
import geb.spock.GebReportingSpec

class IndexSpec extends GebReportingSpec {

 def "login is successful"() {
    given:
         to IndexPage
         at IndexPage
    when:
         loginLink.click()
    then:
         at LoginPage
 }

 def "can load lesson"() {
     given:
        to IndexPage
        at IndexPage
     when:
        lessons.click()
     then:
        at LessonsPage
  }
}
