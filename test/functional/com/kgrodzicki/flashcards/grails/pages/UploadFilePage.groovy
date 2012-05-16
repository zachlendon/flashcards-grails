package com.kgrodzicki.flashcards.grails.pages

import com.kgrodzicki.flashcard.grails.modules.LoggedInHeadingModule
import geb.Page

class UploadFilePage extends GebRemotePage {
    static url = "/lesson/uploadFile"

    static content = {
        loggedInHeadingModule { name -> module LoggedInHeadingModule }
        description(required: true) { $(".block-message")}
    }

    static at = {
        waitFor {
            description.text() ==~ "File imported"
        }
    }
}
