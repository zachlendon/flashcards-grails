package com.kgrodzicki.flashcards.grails.pages

class LessonsPage extends GebRemotePage {
    static url = "/lesson/lessons"
    static mobileUrl = "/lessonMobile/lessons"

    static content = {
        heading(required: true) { $(".mainHeader").last()}
        loginLink(required: false) { $('ul.nav').find("a") }
        firstLesson(required: true) { $("a[name=lesson-1]") }
    }

    static at = {
        waitFor {
            heading.text() ==~ /Lessons/
        }
    }
}