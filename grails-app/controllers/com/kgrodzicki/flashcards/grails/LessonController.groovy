package com.kgrodzicki.flashcards.grails

import com.kgrodzicki.flashcards.grails.Lesson;
import grails.converters.JSON

class LessonController {
	static scaffold = Lesson
	
	def showJson = {
		render Lesson.list() as JSON
	}
}
