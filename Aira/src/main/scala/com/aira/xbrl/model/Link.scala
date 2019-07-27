package com.aira.xbrl.model

class Link[R <: Relationship[XbrlElement, XbrlElement]] 
  (_role:String, _type:String, _title:String = null, _id:String = null) extends XbrlElement(_id){
  
  var role:String = _role
  var title:String = _title
  var linkType:String = _type//type is reserved keyword 

  var documentation:String = _
  var arcs:List[Relationship[XbrlElement, XbrlElement]] = _

  var resources : List[XbrlElement] = _
}