package com.kgrodzicki.flashcard.grails.modules

import geb.Module

class LoggedInHeadingModule extends Module {
    static content = {
        cardLink(required: false) { $("ul.nav li:nth-child(1)").find("a") }
        logoutLink(required: false) { $("ul.nav li:nth-child(3)").find("a") }
        adminLink(required: false) { $("ul.secondary-nav li:nth-child(1)").find("a") }
        importLessons(required: false) { $(".import") }
        exportLessons(required: false) { $(".export") }
    }
}
