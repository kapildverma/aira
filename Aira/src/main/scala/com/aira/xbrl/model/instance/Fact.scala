package com.aira.xbrl.model.instance

import com.aira.xbrl.model.taxonomy.Concept
import com.aira.xbrl.model.taxonomy.types.DataType
import com.aira.xbrl.model.XbrlElement
import com.aira.xbrl.util.Preamble._


class Fact[+T <: DataType] (_value : FactValue[T], _concept:Concept[T],
    _context: Context, _unit: Unit, _id:String=null) extends XbrlElement(_id) {

  val value = _value
  val concept = _concept
  val context = _context
  val unit = _unit
}

class Tuple (_facts : List[Fact[DataType]]){
  val facts = _facts
}