package com.aira.xbrl.model.instance

object Context{
  val name = "context"
}

class Context(_id:String) extends InstanceElement(_id) {
  
  private var _entity: Entity = null
  def entity_=(value:Entity) = this._entity = value  
	def entity = this._entity  
  
  private var _period:Period = null
  def period_=(value:Period) = this._period = value
  def period = this._period

  /*private var _scenario:Scenario = null
  def scenario_=(value:Scenario) = this._scenario = value
  def scenario = this._scenario*/
  
}

