package com.aira.xbrl.model

import java.util.Locale

abstract class Resource(resourceText: String, resourceLang: Locale, resourceRole: String = null, id:String = null) extends XbrlElement(id) {
  val text = resourceText
  val lang = resourceLang 
  val role = resourceRole
}