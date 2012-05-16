package com.kgrodzicki.flashcards.grails.pages

import geb.Page

class LoginPage extends GebRemotePage {
    static url = "/login/auth"

    static content = {
        heading(required: false) { $("#loginHeader")}
        username(required: false) { $("#username")}
        password(required: false) { $("#password") }
        submit(required: false) { $("#submit") }
    }

    static at = {
        waitFor {
            heading.text() ==~ /Please Login/
        }
    }
}