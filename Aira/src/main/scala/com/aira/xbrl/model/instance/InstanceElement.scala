package com.aira.xbrl.model.instance

import com.aira.xbrl.model.Namespace
import com.aira.xbrl.util.Preamble._
import com.aira.xbrl.model.XbrlElement

object InstanceElement{
  val namespace:Namespace = "http://www.xbrl.org/2003/instance"
  val defaultPrefix = "xbrli";
}

class InstanceElement(_id:String = null)
    extends XbrlElement(_id) {
  
}