package com.aira.xbrl.model.instance

import units._

object Unit{
  val name = "unit"
}

abstract class AbstractUnit(id: String)
  extends InstanceElement(id){
}


object Measure{
  val name = "measure"
}

case class Measure(measureValue: String) extends InstanceElement(){
}


case class Unit(_id: String, measures : List[Measure]) 
  extends AbstractUnit(_id){
  
}


case class DivideUnit(_id: String, numerators : List[Measure], denominators : List[Measure]) 
  extends AbstractUnit(_id){
  
}

