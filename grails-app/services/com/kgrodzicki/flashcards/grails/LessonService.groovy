package com.kgrodzicki.flashcards.grails

class LessonService {

    static transactional = true

    def save = { lesson, cards ->
        cards.each { c->
            lesson.addToCards(c)
        }
        
        lesson.save(flush:true)
    }

    def delete() {
        def lessons = Lesson.findAll()
        lessons*.delete()
    }
}
