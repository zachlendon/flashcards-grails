package com.kgrodzicki.flashcards.grails.pages

import geb.Page

class LessonPage extends GebRemotePage {
    static url = "/lessons/start"
    static mobileUrl = "/lessonsMobile/start"

    @Override
    String convertToPath(Object[] args) {
        args ? '/' + args*.toString().join('/') : ""
    }

    static content = {
        cardText(required: false) { $("#text") }
        next(required: false) { $(".next") }
        status(required: false) { $("#status") }
    }

    static at = {
        waitFor {
            cardText.size() > 0
        }
    }
}