package com.aira.xbrl.model.instance

import com.aira.xbrl.model.XbrlElement
import com.aira.xbrl.model.taxonomy.Concept
import com.aira.xbrl.model.taxonomy.types.DataType

abstract class DimensionReference[D <: DataType](_dimension:Concept[D]) extends XbrlElement{
  val dimension = _dimension
}

class ExplicitMember[D <: DataType, M <: DataType](_dimension:Concept[D], _member:Concept[M])
  extends DimensionReference[D](_dimension){
  val member = _member
}


class TypedMember[D <: DataType](_dimension:Concept[D], _value:ValueNode)
  extends DimensionReference[D](_dimension){
  val value = _value
}

abstract class ValueNode(_name:String, _value:String, _children:List[ValueNode],
    _attributes:Map[String, String] = null){
  val name = _name
  val value = _value
  val attributes = _attributes
  
  val children = _children;
}

class SimpleValue(_name:String, _value:String, _attributes:Map[String, String] = null) 
  extends ValueNode(_name, _value, null, _attributes){
 
}

class ComplexValue(_name:String, _value:String, _children:List[ValueNode],
    _attributes:Map[String, String] = null) 
  extends ValueNode(_name, _value, _children, _attributes){
  
}


abstract class SegmentScenario[D <: DataType](_dimReferences : List[DimensionReference[D]]) extends XbrlElement{
  var dimReferences = _dimReferences
}

class Scenario[D <: DataType](_dimReferences : List[DimensionReference[D]]) extends SegmentScenario(_dimReferences){
  
}

class Segment[D <: DataType](_dimReferences : List[DimensionReference[D]]) extends SegmentScenario(_dimReferences){
  
}