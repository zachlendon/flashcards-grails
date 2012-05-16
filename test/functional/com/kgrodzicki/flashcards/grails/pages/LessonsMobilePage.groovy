package com.kgrodzicki.flashcards.grails.pages

class LessonsMobilePage extends LessonsPage {
    static url = "/lessonMobile/lessons"

    static content = {
        heading(required: true) { $("#flashCardsHeader")}
        loginLink(required: false) { $('ul.nav').find("a") }
        firstLesson(required: true) { $("lesson-1") }
    }

    static at = {
        waitFor {
            heading.text() ==~ /Lessons/
        }
    }
}