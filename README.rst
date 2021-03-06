
***********
Flash Cards
***********

Flash cards are a common way to memorize subject material.

Technologies
============

#. Grails - http://grails.org/
#. Spring Security
#. Spring Mobile
#. Bootstrap from Twitter - http://twitter.github.com/bootstrap/

Mobile app:

#. Mobile Boilerplate - http://html5boilerplate.com/mobile/	 
#. Backbone.js - http://documentcloud.github.com/backbone/
#. jQuery Mobile - http://jquerymobile.com/

Requirements
============

#. ``Grails``, see http://grails.org/Installation

Development environment
=======================

#. You can use ``SpringSource Tool Suite`` with ``Grails`` plugin - http://www.springsource.com/developer/sts

Installation
============
#. Clone the repository::
        Original repository:
            git clone git@github.com:kgrodzicki/flashcards-grails.git
        Forked Repository:
            git clone git@github.com:zachlendon/flashcards-grails.git

#. Navigate to project directory::

    cd flashcards-grails

#. Run jetty server::

    grails runApp

#. Application is now up and running - http://localhost:8080/flashcards-grails (admin/admin)

Production
==========

Check out running application on:

#. `cloud foundry <http://www.cloudfoundry.com/>`_ - http://bit.ly/fcards
#. `cloudBees <http://www.cloudbees.com/>`_ - http://bit.ly/cb-fcards

Testing
========

Geb and Spock testing related to mobile/desktop versions added around core features

Additional Changes in Fork
================

Also upgraded to Grails 2.0.3 and upgraded other libraries and templates accordingly