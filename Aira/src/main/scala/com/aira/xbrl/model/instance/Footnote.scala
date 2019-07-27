package com.aira.xbrl.model.instance

import java.util.Locale
import com.aira.xbrl.model.Resource

object Footnote{
  val role = "http://www.xbrl.org/2003/role/footnote"
}

class Footnote(_text: String, _lang: Locale) extends Resource(_text, _lang, Footnote.role) {
}