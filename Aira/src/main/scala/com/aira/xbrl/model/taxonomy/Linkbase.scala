package com.aira.xbrl.model.taxonomy

import com.aira.xbrl.model.Relationship
import com.aira.xbrl.model.taxonomy.types.DataType


class Linkbase {
  
}

object Use{
  val Optional:Int = 0
  val Prohibited:Int = 1
}

class ConceptArc(_from:Concept[DataType], _to:Concept[DataType], _arcRole:String)
  extends Relationship[Concept[DataType], Concept[DataType]](_from, _to, _arcRole){
  
  var order:Float = _
  var priority:Int = _
  var use = Use.Optional
}

object CalculationArc{
  val role = "http://www.xbrl.org/2003/arcrole/summation-item"
}

class CalculationArc(summation:Concept[DataType], item:Concept[DataType])
  extends ConceptArc(summation, item, CalculationArc.role){
  
  var weight:Int = _
}

object PresentationArc{
  val role = "http://www.xbrl.org/2003/arcrole/parent-child"
}

class PresentationArc(parent:Concept[DataType], child:Concept[DataType])
  extends ConceptArc(parent, child, PresentationArc.role){
  
}