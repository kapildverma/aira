package com.aira.xbrl.model

abstract class Relationship[+A <: XbrlElement, +B <: XbrlElement](_from: A, _to: B, _role:String = null, _id:String = null)
  extends XbrlElement(_id){
  
  val from = _from
  val to = _to
  
  var role = _role
}