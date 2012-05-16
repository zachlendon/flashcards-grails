package com.kgrodzicki.flashcard.grails

import geb.spock.GebReportingSpec
import com.kgrodzicki.flashcards.grails.pages.LoginPage
import com.kgrodzicki.flashcards.grails.pages.LoggedInIndexPage
import com.kgrodzicki.flashcards.grails.pages.UploadPage
import com.kgrodzicki.flashcards.grails.pages.LessonPage
import com.kgrodzicki.flashcards.grails.pages.IndexPage
import com.kgrodzicki.flashcards.grails.pages.LessonsPage
import com.kgrodzicki.flashcards.grails.Lesson
import com.kgrodzicki.flashcards.grails.Card
import spock.lang.Stepwise
import spock.lang.Shared
import org.springframework.context.ApplicationContext
import org.codehaus.groovy.grails.web.context.ServletContextHolder
import org.codehaus.groovy.grails.web.servlet.GrailsApplicationAttributes

class LessonsSpec extends MobileSpeck {

    @Shared
    def lessonService

    def setupSpec() {
        given:
            ApplicationContext context = (ApplicationContext) ServletContextHolder.getServletContext().getAttribute(GrailsApplicationAttributes.APPLICATION_CONTEXT)
            lessonService = context.getBean('lessonService')
            //lessonService.delete()

            Lesson lesson
            Card card
            def cards = []
            def name = "Grails mobile testing installation"

            if (isMobile) {
                lesson = Lesson.findOrCreateWhere(name: name)
                def cardsQAs = [[question: "Geb", answer: "grails install-plugin geb"],
                        [question: "Spock", answer: "grails install-plugin spock"], [question: "Selenium", answer: "grails.project.dependency.resolution"]]
                cardsQAs.each {
                    card = new Card(question: it.question, answer: it.answer)
                    cards << card
                }
            } else {
                uploadLessons()
            }
        when:
            if (isMobile) {
                lessonService.save(lesson, cards)
                lesson = Lesson.findByName(name)
            } else {
                to LessonsPage
            }
        then:
            if (isMobile) {
                lesson.cards.size() == 3
            } else {
                at LessonsPage
            }
    }

    def uploadLessons() {
        to LoginPage
        at LoginPage
        username = 'admin'
        password = 'admin'
        submit.click()
        at LoggedInIndexPage
        to UploadPage
        $("form").jsonData = "/Users/lendon/Desktop/testLesson.json"
        uploadButton.click()
        waitFor {
            $("div.alert-message.block-message.info").find("p").text() ==~ "File imported."
        }
        loggedInHeadingModule.logoutLink.click()
        at IndexPage
    }

    def "test first lesson"() {
        given:
        to LessonsPage
        at LessonsPage
        when:
        firstLesson.click()
        then:
        at LessonPage
    }

    def "navigate through a lesson"() {
        given:
        to LessonsPage
        at LessonsPage
        when:
        firstLesson.click()
        timesClickNext.times {
            $(".next").click()
        }
        then:
        waitFor {
            $("#status").text() == statusText
        }
        where:
        timesClickNext | statusText
        0              | "1/3"
        1              | "2/3"
        2              | "3/3"
    }
}
