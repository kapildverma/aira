package com.aira.xbrl.model.taxonomy

import com.aira.xbrl.model.instance.Context
import com.aira.xbrl.model.instance.FactValue
import com.aira.xbrl.model.instance.Fact
import com.aira.xbrl.model.instance.Unit
import com.aira.xbrl.model.Namespace
import com.aira.xbrl.model.XbrlElement
import com.aira.xbrl.model.taxonomy.types.DataType

object Concept{
  def newFact[T <: DataType](value: FactValue[T], concept: Concept[T], context : Context, unit : Unit, id : String)
    = new Fact[T](value, concept, context, unit, id)
}

class Concept[+T <: DataType](_name:String, _namespace:Namespace, id:String = null)
  extends XbrlElement(id) {
  
}