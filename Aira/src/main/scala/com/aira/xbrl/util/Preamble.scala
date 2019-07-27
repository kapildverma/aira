package com.aira.xbrl.util

import com.aira.xbrl.model.Namespace

object Preamble{
  implicit def namespaceWrapper( _value:String) = new Namespace(_value)
}