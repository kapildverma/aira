package com.aira.xbrl

import com.aira.xbrl.model.instance.{Fact, FactValue, Tuple}
import com.aira.xbrl.model.taxonomy.types.DataType
import com.aira.xbrl.model.taxonomy.Concept
import com.aira.xbrl.util.Preamble._

class StringDataType extends DataType{
  
}

class StringValue(_value:String) extends FactValue[StringDataType]{
  val value = _value
}

class IntDataType extends DataType{
  
}

class IntValue(_value : Int) extends FactValue[IntDataType]{
  val value = _value
}


object Test{
  
  def main(args : Array[String])={
    val intType = new IntDataType()
    val stringType = new StringDataType()
    
    
    var list = List[DataType](intType, stringType)
    
    val stringConcept = new Concept[StringDataType]("StDataTyperingConcept", "testnamespace")
    
    val intConcept = new Concept[IntDataType]("IntConcept", "testnamespace")
    
    val stringFact = Concept.newFact(new StringValue("testFact"), stringConcept, null, null, "1")
    
    val intFact = Concept.newFact(new IntValue(10), intConcept, null, null, "2")
    
    val facts = List[Fact[DataType]](intFact, stringFact)
    
    val tuple = new Tuple(facts)
  }
}