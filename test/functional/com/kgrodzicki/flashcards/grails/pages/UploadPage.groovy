package com.kgrodzicki.flashcards.grails.pages

import geb.Page
import com.kgrodzicki.flashcard.grails.modules.LoggedInHeadingModule

class UploadPage extends GebRemotePage {
    static url = "/lesson/upload"

    static content = {
        loggedInHeadingModule { name -> module LoggedInHeadingModule }
        heading(required: true) { $("h1")}
        description(required: true) { $("div.hero-unit").find("p")}
        uploadButton(required: true) { $(".btn") }
    }

    static at = {
        waitFor {
            heading.text() == "Upload file"
        }
    }
}
