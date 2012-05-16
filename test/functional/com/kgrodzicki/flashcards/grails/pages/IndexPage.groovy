package com.kgrodzicki.flashcards.grails.pages

import geb.Page

class IndexPage extends GebRemotePage {
    static url = "/"

    static content = {
        heading(required: false) { $(".mainHeader").last()}
        description(required: false) { $("div.hero-unit").find("p")}
        loginLink(required: false, to: LoginPage) { $("a[name='login']") }
        lessons(required: false) { $(".lessons") }
    }

    static at = {
        waitFor {
            heading.text().contains("Flash Cards")
        }
    }
}
