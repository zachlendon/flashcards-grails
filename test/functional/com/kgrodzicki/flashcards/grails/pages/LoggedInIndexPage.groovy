package com.kgrodzicki.flashcards.grails.pages

import geb.Page
import com.kgrodzicki.flashcard.grails.modules.LoggedInHeadingModule

class LoggedInIndexPage extends GebRemotePage {
    static url = "/"

    static content = {
        heading(required: true) { $("h1")}
        description(required: true) { $("div.hero-unit").find("p")}
        loggedInHeadingModule { name -> module LoggedInHeadingModule }
    }

    static at = {
        waitFor {
            loggedInHeadingModule.cardLink.text() == "Card"
        }
    }

    static mobileAt = {
        waitFor {
            $('a[name=logout]').find(".ui-btn-text") == "Logout"
        }
    }
}
