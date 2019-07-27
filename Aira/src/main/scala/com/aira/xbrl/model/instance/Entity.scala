package com.aira.xbrl.model.instance

object Entity{
  val name="entity"
}

case class Entity(_scheme:String, _identifier:String) extends InstanceElement(){
  val scheme = _scheme
  val identifier = _identifier
}